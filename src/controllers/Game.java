 /**
 * Main controller object
 * 
 * @author S.H.L.A.T.
 * @version 0.1 10/04/11
 */

package edu.gatech.cs2340.shlat.controllers;
import java.awt.event.*;
import java.lang.*;
import java.awt.EventQueue;
import edu.gatech.cs2340.shlat.models.*;
import edu.gatech.cs2340.shlat.views.*;
import javax.swing.*;

public class Game implements ActionListener {
    //Sub-controllers
    private StoreController         storeControl;
    
    //Views
    private NewGameCharInterface    newGameUI;
    private CharStatusInterface     charStat;
    private GamePlayInterface       gameplayUI;
    
    //Models
    private Wagon                   playerWagon;
    private Store                   startStore;
    private Pace                    currentPace;
    private Rations                 currentRations;
    private Location                currentLocation; 
    private Map                     map;
    private Party                   party;
    private Date                    currentDate;
    
    //Keeps track of what state the game is in
    private int                     gameState;
    public static final int         STATE_MAINMENU = 0;
    public static final int         STATE_NEWGAME = 1;
    public static final int         STATE_INGAME = 2;

    /**
     * Constructor for the Game controller. Initialize all models and views
     */
    public Game() {
        //Initialize view GUIs
        newGameUI = new NewGameCharInterface(this);
        gameplayUI = new GamePlayInterface(this);
        
        //Initialize models
        playerWagon = new Wagon();
        party = new Party(new Player(), new edu.gatech.cs2340.shlat.models.Character(), 
                        new edu.gatech.cs2340.shlat.models.Character(), 
                        new edu.gatech.cs2340.shlat.models.Character());
        party.getPlayer().initializeInventory();
        startStore = new Store();
        map = new Map();
        currentLocation = new Location("Player", "NONE", false);
        currentPace = new Pace(0);
        currentRations = new Rations(0);
        currentDate = new Date("August");
        
        //Initialize other controllers
        storeControl = new StoreController(this, party.getPlayer(), playerWagon);
        
        //Start game at new game state
        gameState = STATE_NEWGAME;
    }

    /**
     * Catches action events from views
     *
     * @param e The action caught
     */
    public void actionPerformed(ActionEvent e) { 
        //Use the action command to determine appropriate reaction
        String action_command = e.getActionCommand();
        int temp;
        
        if(action_command.equals("ngciDone")) {
            //Get all data from GUI and update models
            //Player character
            party.getPlayer().setName(newGameUI.getMainCharacterName());
            party.getPlayer().setAge(newGameUI.getMainCharacterAge());
            party.getPlayer().setStatus(Status.NORMAL);
            temp = newGameUI.getMainCharacterJob();
            switch(temp) {
                case 0:
                    party.getPlayer().setJob(Player.Job.BANKER);
                    break;
                case 1:
                    party.getPlayer().setJob(Player.Job.CARPENTER);
                    break;
                case 2:
                    party.getPlayer().setJob(Player.Job.FARMER);
                    break;
            }
            
            //Other party members
            for(int i = 0; i < 3; i++)
            {
                party.getCharacter(i+1).setName(newGameUI.getCharacterName(i));
                party.getCharacter(i+1).setAge(newGameUI.getCharacterAge(i));
                party.getCharacter(i+1).setStatus(Status.NORMAL);
            }
            
            //Initial rations/pace
            temp = newGameUI.getInitialRations();
            currentRations.setRation(temp);
            
            temp = newGameUI.getInitialPace();
            currentPace.setPace(temp);

            //Close the new game GUI and open the character stat gui
            charStat = new CharStatusInterface(party);
            charStat.setRations(currentRations.getRation());
            charStat.setPace(currentPace.getPace());
            newGameUI.setVisibility(false);
            
            //Run the starting store
            storeControl.run(startStore);
        } else if(action_command.equals("ngciReset")) {
            //Reset data in GUI
            newGameUI.clear();
        } else if(action_command.equals("storeClosed")) {
            //Open main game GUI if the start store was closed
            if(gameState == STATE_NEWGAME) {
                gameplayUI.setVisibility(true);
                gameplayUI.setAlertLabel("");
                gameplayUI.setRations(currentRations.getRation());
                gameplayUI.setPace(currentPace.getPace());
                gameplayUI.setDistTravel(currentLocation.getCurrentDistanceTraveled());
                gameplayUI.setFoodRemaining("" + party.getPlayer().getFood());
                gameplayUI.setDate(currentDate.toString());
            }
        } else if(action_command.equals("makeMove")) {
            //Get any updates to rations and pace
            currentRations.setRation(gameplayUI.getRations());
            currentPace.setPace(gameplayUI.getPace());
            
            //Check if the player will encounter a location
            Location nextLoc = map.getNextLocation(currentLocation.getCurrentDistanceTraveled());
            int dist = nextLoc.getLandmarkDistance() - currentLocation.getCurrentDistanceTraveled();
            int rationsUsed = 0;
            boolean atLoc = false;
            
            if(dist <= currentPace.getDistanceTraveled()) {
                rationsUsed = currentRations.getRation() * dist / currentPace.getDistanceTraveled();
                atLoc = true;
            } else {
                dist = currentPace.getDistanceTraveled();
                rationsUsed = currentRations.getRation();
            }
            
            //Ensure that the player has enough food
            temp = party.getPlayer().getFood()/4;     //Maximum rations
            if(rationsUsed > temp) {
                currentRations.setRation(temp);
                rationsUsed = temp;
                gameplayUI.setRations(currentRations.getRation());
                if(temp == 0) {
                    gameplayUI.setAlertLabel("NO food remaining");
                } else {
                    gameplayUI.setAlertLabel("");
                }
            } else {
                gameplayUI.setAlertLabel("");
            }
            
            currentLocation.travelDistance(dist);
            party.getPlayer().consumeFood(4, rationsUsed);
            
            //Update GUI labels containing rations and distance traveled
            gameplayUI.setDistTravel(currentLocation.getCurrentDistanceTraveled());
            gameplayUI.setFoodRemaining("" + party.getPlayer().getFood());
            
            //Alert player if they reached a destination
            if(atLoc) {
                //Check if this is the end of the 'trail'
                if(nextLoc.getEnd()) {
                    JOptionPane.showMessageDialog(null,"Congratulations, you win! You have reached " + nextLoc.getName());
                    System.exit(0);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"You have reached " + nextLoc.getName());
                }
            }

            //Open the store window if the location has one
            if(atLoc && nextLoc.hasStore()) {
                Store locationStore = new Store();
                storeControl.run(locationStore);
            }

            //Show player options if the current location is a river
            if(atLoc && nextLoc.getRiver()) {
                //Get the players choice of what to do
                Object[] possibilities = {"Pay Toll", "Ford", "Caulk"};
                String choice = (String)JOptionPane.showInputDialog(
                    null,
                    "You reached a river. What would you like to do?\n",
                    "River!",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    possibilities,
                    "Caulk");
                    
                int riverChoice = 0;
                if(choice.equals("Pay Toll"))
                    riverChoice = 0;
                else if(choice.equals("Ford"))
                    riverChoice = 1;
                else
                    riverChoice = 2;
                
                River tempRiver = new River("river", "nile", 0, 5);
                String message = ((River)nextLoc).crossRiver(riverChoice, party.getPlayer(), null);
                JOptionPane.showMessageDialog(null,message);
            }
            
            //Update the current date
            currentDate.updateDay();
            gameplayUI.setDate(currentDate.toString());
        } else if(action_command.equals("mgiShowStatus")) {
            //Update statuses
            for(int i = 0; i < party.getNumCharacters(); i++)
                charStat.setStatus(i, party.getCharacter(i).getStatusStr());
                
            charStat.setVisibility(true);
        }
    }
    
    /**
     * Begin running the game controller logic
     */
    public void run()
    {
        //Launch the new game GUI
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    newGameUI.setVisibility(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
   }
    
    /**
     * Application entry point
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        //Entry point
        Game gameController = new Game();
        gameController.run();
    }

}
