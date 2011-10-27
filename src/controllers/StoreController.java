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
    private List        storeInventory; //List of all items at the current store
    
    //Action Listener for the main controller
    private ActionListener al;
    
    /**
     * Constructs the Store Controller and initializes views
     * 
     * @param player A Player object
     * @param playerWagon A Wagon object
     */
    public StoreController(ActionListener al, Player player, Wagon playerWagon) {
        this.player = player;
        this.playerWagon = playerWagon;
        this.al = al;
        
        //Initialize the store view
        storeView = new StoreInterface(this);
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
        
        if(action_command.equals("siPurchase")) {
            //Purchase button was pressed, call purchase for each selected item
            for(int i = 0; i < storeInventory.size(); i++) {
                if((temp = storeView.getNumWant(i)) > 0)
                    tradingAt.purchase(player, playerWagon, (Item)(storeInventory.get(i)), temp);
            }
            
            //Reset store view
            storeView.clearInput();
            
            //Close window
            storeView.setVisibility(false);
            
            //Signal the Game controller that the store is done
            ActionEvent storeClosed = new ActionEvent(this, 0, "storeClosed");
            al.actionPerformed(storeClosed);
        } else if(action_command.equals("siCancel")) {
            //Close store view
            storeView.setVisibility(false);
        }
    }
    
    /**
     * Guides the system through a store dialog
     *
     * @param tradeAt Store object representing the store the player is trading at
     */
    public void run(Store tradeAt) {
        tradingAt = tradeAt;
        
        //Populate fields in the Store view
        storeInventory = tradingAt.getInventoryAsList();
        Item currentItem;
        Item playersItem;
        
        for(int i = 0; i < storeInventory.size(); i++) {
            currentItem = (Item)storeInventory.get(i);
            storeView.setItemDes(currentItem.getName(), i);
            storeView.setUnitCost((int)currentItem.getPrice(), i);
            storeView.setStoreMax(currentItem.getAmount(), i);
            storeView.setItemCost(0, i);
            storeView.setItemWeight(currentItem.getWeight(), i);
            
            playersItem = player.getInventory().getItemById(currentItem.getId());
            if(playersItem != null)
                storeView.setItemsHave(playersItem.getAmount(), i);
            else
                storeView.setItemsHave(0, i);
        }
        
        storeView.setCurrentMoney((int)player.getMoney());
        storeView.setCurrentWeight(player.getInventory().getWeight());
        
        //Display the store view
        storeView.setVisibility(true);
    }
}
