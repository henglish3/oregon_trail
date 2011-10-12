package edu.gatech.cs2340.shlat.controllers;
/**
 * This is the controller for using the Store and buying items
 * @author S.H.L.A.T.
 * @version 1.0 10/10/2011
 */
 
import java.awt.event.*;
import edu.gatech.cs2340.shlat.models.*;
import edu.gatech.cs2340.shlat.views.*;

public class StoreController implements ActionListener {
    //The view used for store dialogs
    private StoreInterface storeView;
    
    //Models
    private Store       tradingAt;      //The current store the player is trading with
    private Wagon       playerWagon;    //The player's wagon
    private Player      player;         //The player
    
    /**
     *Constructs the Store Controller and initializes views
     */
    public StoreController(Player player, Wagon playerWagon) {
        this.player = player;
        this.playerWagon = playerWagon;
        
        //Initialize the store view
        storeView = new StoreInterface(this);
    }
    
    /**
     *Handles action events from the store view
     */
    public void actionPerformed(ActionEvent e) { 
        
    }
    
    /**
     *Guides the system through a store dialog
     */
    public void run(Store tradeAt) {
        tradingAt = tradeAt;
        
        //Populate fields in the Store view
        
        //Display the store view
        storeView.setVisibility(true);
    }
}
