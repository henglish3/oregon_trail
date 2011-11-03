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
    private Player                  playerCharacter;
    private Wagon                   playerWagon;
    private Store                   startStore;
    private Pace                    currentPace;
    private Rations                 currentRations;
    private Location                currentLocation;
    private Map                     map;
    
    private edu.gatech.cs2340.shlat.models.Character[] partyCharacters;
    
    //Just for M4 Delete and make better
    private String[] name;
    private String[] age;
    private String[] sex;
    private String[] status;
    private String job;



    /**
     * Constructor for the Game controller. Initialize all models and views
     */
    public Game() {
        //Initialize view GUIs
        newGameUI = new NewGameCharInterface(this);
        gameplayUI = new GamePlayInterface(this);
        
        //Initialize models
        playerWagon = new Wagon();
        startStore = new Store();
        map = new Map();
        currentLocation = new Location("Player", "NONE", false);
        playerCharacter = new Player(18, 0, "Player", Player.Job.BANKER);
        partyCharacters = new edu.gatech.cs2340.shlat.models.Character[3];
        for(int i = 0; i < 3; i++)
        {
            partyCharacters[i] = new edu.gatech.cs2340.shlat.models.Character(18, 0, "Bob");
        }
        currentPace = new Pace(0);
        currentRations = new Rations(0);

        //Temporary initialize arrays
        name = new String[4];
        age = new String[4];
        sex = new String[4];
        status = new String[4];
        
        //Initialize other controllers
        storeControl = new StoreController(this, playerCharacter, playerWagon);
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
            playerCharacter.setName(newGameUI.getMainCharacterName());
            playerCharacter.setAge(newGameUI.getMainCharacterAge());
            playerCharacter.setSex(newGameUI.getMainCharacterSex());
            temp = newGameUI.getMainCharacterJob();
            switch(temp) {
                case 0:
                    playerCharacter.setJob(Player.Job.BANKER);
                    break;
                case 1:
                    playerCharacter.setJob(Player.Job.CARPENTER);
                    break;
                case 2:
                    playerCharacter.setJob(Player.Job.FARMER);
                    break;
            }
            
            //Other party members
            for(int i = 0; i < 3; i++)
            {
                partyCharacters[i].setName(newGameUI.getCharacterName(i));
                partyCharacters[i].setAge(newGameUI.getCharacterAge(i));
                partyCharacters[i].setSex(newGameUI.getCharacterSex(i));
            }
            
            //Initial rations/pace
            temp = newGameUI.getInitialRations();
            currentRations.setRation(temp);
            
            temp = newGameUI.getInitialPace();
            currentPace.setPace(temp);

            //Close the new game GUI and open the character stat gui
            getInfo();
            charStat = new CharStatusInterface(name, age, sex, job);
            charStat.setRations(currentRations.getRation());
            charStat.setPace(currentPace.getPace());
            newGameUI.setVisibility(false);
            
            //Run the starting store
            storeControl.run(startStore);
        } else if(action_command.equals("ngciReset")) {
            //Reset data in GUI/models?
        } else if(action_command.equals("storeClosed")) {
            //Open main game GUI and set information in the GUI
            gameplayUI.setVisibility(true);
            gameplayUI.setRations(currentRations.getRation());
            gameplayUI.setPace(currentPace.getPace());
            gameplayUI.setDistTravel("" + currentLocation.getCurrentDistanceTraveled() + " miles");
            gameplayUI.setFoodRemaining("" + playerCharacter.getFood());
            gameplayUI.setAlertLabel("");
            //TODO: current date
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
            temp = playerCharacter.getFood()/4;     //Maximum rations
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
            playerCharacter.consumeFood(4, rationsUsed);
            
            //Update GUI labels containing rations and distance traveled
            gameplayUI.setDistTravel("" + currentLocation.getCurrentDistanceTraveled() + " miles");
            gameplayUI.setFoodRemaining("" + playerCharacter.getFood());
            
            //Alert player if they reached a destination
            if(atLoc) {
                JOptionPane.showMessageDialog(null,"You have reached " + nextLoc.getName());
            }
        } else if(action_command.equals("mgiShowStatus")) {
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
     * Fetch data from models for populating the view
     */
    public void getInfo() {
    	name[0]=playerCharacter.getName(); 
        age[0]=""+playerCharacter.getAge();
        //status[0]=playerCharacter.getStatus();
        job = playerCharacter.jobString();
        for(int i=1; i < 4; i++) {
            name[i] = partyCharacters[i-1].getName();
            age[i] = ""+partyCharacters[i-1].getAge();
            //status[i] = partyCharacters[i-1].getStatus();
        }

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
