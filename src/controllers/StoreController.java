package edu.gatech.cs2340.shlat.controllers;
/**
 * This is the controller for using the Store and buying items
 * @author S.H.L.A.T.
 * @version 1.0 10/10/2011
 */
 
import java.awt.event.*;
import java.util.List;
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
        //Use the action command to determine appropriate reaction
        String action_command = e.getActionCommand();
        
        if(action_command.equals("siPurchase")) {
            //Purchase button was pressed, call purchase for each selected item
            
            
            //Reset store view
            
        } else if(action_command.equals("siCancel")) {
            //Close store view
            storeView.setVisibility(false);
        }
    }
    
    /**
     *Guides the system through a store dialog
     */
    public void run(Store tradeAt) {
        tradingAt = tradeAt;
        
        //Populate fields in the Store view
        List storeInventory = tradingAt.getInventoryAsList();
        Item currentItem;
        System.out.println("List size: " + storeInventory.size());
        
        for(int i = 0; i < storeInventory.size(); i++) {
            currentItem = (Item)storeInventory.get(i);
            storeView.setItemDes(currentItem.getName(), i);
            storeView.setUnitCost((int)currentItem.getPrice(), i);
        }
        
        //Display the store view
        storeView.setVisibility(true);
    }
}
