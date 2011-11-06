package edu.gatech.cs2340.shlat.models;
import edu.gatech.cs2340.shlat.models.*;

/**
 * Class that represents a River location.
 * @author S.H.L.A.T.
 * @version 0.6 11/05/11
 */
public class River extends Location {
    private int depth;
    //private Event event;
    
    /**
     * Constructor that creates a River object taht extends Location and also has depth.
     * 
     * @param name The name of this Location object
     * @param landmark The name of the next traveling point
     * @param distance The starting value of the distance traveled by the player
     * @param depth The depth of the river.
     */
    public River(String name, String landmark, int distance, int depth){ 
        super(name, landmark, distance, Boolean.FALSE);
        this.depth = depth;
    } //ends River constructor.
    
    /**
     * Method that runs the one of the three methods chosen by the player when they encounter a river.
     * 
     * @param choice The player's choice.
     * @param player The player.
     */
    public void choiceRiver(int choice, Player player) {
        if(choice == 0) {
            payRiver(player);
        }
        else if(choice == 1) {
            fordRiver(player);
        }
        else {
            caulkRiver(player);
        }
    } //ends choiceRiver method.
    
    /**
     * Method that checks to see if the player has $50 to cross the river. If the player does it subtracts $50 from 
     * the player's inventory and increases the distance traveled by 10 miles. If not it does nothing.
     * 
     * @param player The player.
     */
    public void payRiver(Player player) {
        if(player.getMoney() >= 50) {
            player.setMoney(-50);
            travelDistance(10);
        }
    } //ends payRiver method.
    
    /**
     * Method that runs the river fording event and then adds 10 miles traveled.
     * 
     * @param player The player.
     */
    public void fordRiver(Player player) {
        //event.doEvent(1, player); //the 1 represents whatever event its suppose to constue in the xml file?
        travelDistance(10);
    } //ends fordRiver method.
    
    /**
     * Method that runs the caulking the wagon to float across the river and event then adds 10 miles traveled.
     * 
     * @param player The player.
     */
    public void caulkRiver(Player player) {
        //event.doEvent(2, player); //the 2 represents whatever event its suppose to constue in the xml file?
        travelDistance(10);
    } //ends caulkRiver method.
} //ends River class.