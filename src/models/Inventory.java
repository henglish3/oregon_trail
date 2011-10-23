/**
 * Class that stores the inventory for a player or store
 *
 * @author SHLAT
 * @version 0.1 10/08/11
 */
package edu.gatech.cs2340.shlat.models;

import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private List<Item> inventory;
    private String location = "items.xml";
    private int weight;

    /**
     * Constructor for the Inventory class for stores.
     */
    public Inventory() {
        ItemList list = new ItemList();
        List<Item> readConfig = list.readConfig(location);
        inventory = new ArrayList();
        for (Item item : readConfig) {
            item.changeAmount(item.getStoreQuantity());
            inventory.add(item); 
        }
        weight = 0;
    }


    /**
     * Constructor for the Inventory for players.
     *
     * @param player Whether the inventory is for a player or not.
     */
    public Inventory(boolean player) {
        ItemList list = new ItemList();
        List<Item> readConfig = list.readConfig(location);
        inventory = new ArrayList();
        for (Item item : readConfig) {
            boolean playerStart = item.getStart();
            item.changeAmount(item.getStartAmount());
            if (playerStart) {
                inventory.add(item);
            }
        }
        weight = 100;
    }
    
    /**
     *Find an item with the supplied ID and return it or null if it doesnt't exist
     *
     * @param id The id of the item to search for
     * @return The instanc of the Item from this inventory
     */
    public Item getItemById(int id) {
        for (int i = 0; i < inventory.size(); i++) {
            if(inventory.get(i).getId() == id)
                return inventory.get(i);
        }
        
        return null;
    }
    
    /** 
     * Method that gets the inventory's weight.
     *
     * @return The weight of the inventory.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Method that gets the inventory as a List.
     * 
     * @return The inventory as a List.
     */
    public List getList() {
        return inventory;
    }

    /**
     * Method that adds an item to the inventory
     *
     * @param item The item to be added.
     */
    public void add(Item item) {
        inventory.add(item);
    }

    /**
     * Method to update the weight of the inventory
     *
     * @param weight The weight of the item to be added.
     */
    public void addWeight(int weight) {
        this.weight += weight;
    }
    
    /**
     * Method to set the weight of the inventory
     *
     * @param weight The weight to set to.
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void update(Item item) {
        int id = item.getId();
        for (int i = 0; i < inventory.size(); i++) {
            if(inventory.get(i).getId() == id)
                inventory.set(i, item);
        }
    }
}
