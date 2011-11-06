package edu.gatech.cs2340.shlat.models;

import edu.gatech.cs2340.shlat.models.Store;

/**
 * Class represents a River Location.
 * @author S.H.L.A.T.
 *
 */
public class River extends Location {
    
    private int depth;
    
    /**
     * Constructor
     */
    public River(String name, String landmark, int distance, int land, boolean store){ 
        super(name, landmark, distance, land, store);
        
    } //ends River constructor.
    
    
    /**
     * Method that runs the one of the three methods chosen by the player when they encounter a river.
     * 
     * @param choice The player's choice
     */
    public void riverChoice(int choice) {
        if(choice == 0) {
            //payRiver();
        }
        else if(choice == 1) {
            //fordRiver();
        }
        else {
            //caulkRiver();
        }
    } //ends riverChoice method.
    
    public void payRiver() {
        
    } //ends payRiver method.
    
    
} //ends River class.