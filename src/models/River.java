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
     * @param choice The player's choice
     */
    public void riverChoice(int choice, int money, Inventory inventory) {
        if(choice == 0) {
            payRiver(money);
        }
        else if(choice == 1) {
            //fordRiver();
        }
        else {
            //caulkRiver();
        }
    } //ends riverChoice method.
    
    public void payRiver(int money) {
        if(money >= 50) {   
        }
        else{   
        }    
    } //ends payRiver method.
    
    public void fordRiver(Inventory inventory) {
    } //ends fordRiver method.
    
    public void caulkRiver(Inventory inventory) {
    } //ends caulkRiver method.
    
    
} //ends River class.