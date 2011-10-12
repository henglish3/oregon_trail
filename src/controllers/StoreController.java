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
            
            //TEMP!!! Re-open store window to show changes to player inventory
            run(tradingAt);
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
