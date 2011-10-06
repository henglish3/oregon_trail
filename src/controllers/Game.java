 /**
 * Main controller object
 * 
 * @author S.H.L.A.T.
 * @version 0.1 10/04/11
 */

package edu.gatech.cs2340.shlat.controllers;
import java.awt.event.*;
import java.awt.EventQueue;
import edu.gatech.cs2340.shlat.models.*;
import edu.gatech.cs2340.shlat.views.*;

public class Game implements ActionListener {
    //Views
    private NewGameCharInterface    newGameUI;
    private CharStatusInterface     charStat;
    //Models
    private Player                  playerCharacter;
    private Pace                    currentPace;
    private int                     currentRations;
    
    private edu.gatech.cs2340.shlat.models.Character[] partyCharacters;
    
    //Just for M4 Delete and make better
    private String[] name;
    private String[] age;
    private String[] sex;
    private String[] status;
    private String job;



    /*
     *Initialize all models and views
     */
    public Game() {
        //Initialize view GUIs
        newGameUI = new NewGameCharInterface(this);
        
        //Initialize models
        playerCharacter = new Player(18, 0, "Player", Player.Job.BANKER);
        partyCharacters = new edu.gatech.cs2340.shlat.models.Character[3];
        for(int i = 0; i < 3; i++)
        {
            partyCharacters[i] = new edu.gatech.cs2340.shlat.models.Character(18, 0, "Bob");
        }
        currentPace = new Pace(0);
        currentRations = 1;

        //Temporary initialize arrays
        name = new String[4];
        age = new String[4];
        sex = new String[4];
        status = new String[4];
    }

    /*
     *Catches action events from views
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
            switch(temp) {
                case 0:
                    currentRations = 0;
                    break;
                case 1:
                    currentRations = 1;
                    break;
                case 2:
                    currentRations = 2;
                    break;
            }
            
            temp = newGameUI.getInitialPace();
            switch(temp) {
                case 0:
                    currentPace.setPace(0);
                    break;
                case 1:
                    currentPace.setPace(1);
                    break;
                case 2:
                    currentPace.setPace(2);
                    break;
            }

            //Close the new game GUI and open the character stat gui
            getInfo();
            charStat = new CharStatusInterface(name, age, sex, job);
            charStat.setRations(currentRations);
            charStat.setPace(currentPace.getPace());
            newGameUI.setVisibility(false);
            charStat.setVisibility(true);
        } else if(action_command.equals("ngciReset")) {
            //Reset data in GUI/models?
        }
    }
    
    /*
     *Begin running the game controller logic
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
    /*
     *Application entry point
     */
    public static void main(String[] args) {
        //Entry point
        Game gameController = new Game();
        gameController.run();
    }

}
