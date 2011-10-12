/**
 * Class that stores the inventory for a player or store
 *
 * @author SHLAT
 * @version 0.1 10/08/11
 */
package edu.gatech.cs2340.shlat.models;

import java.util.List;

public class Inventory {
  private List inventory;
  private String location = "items.xml";
  private int weight;

  /**
   * Constructor for the Inventory class for stores.
   */
  public Inventory() {
    ItemList list = new ItemList();
    List<Item> readConfig = list.readConfig(location);
    for (Item item : readConfig) {
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
    for (Item item : readConfig) {
      boolean playerStart = item.getStart();
      if (playerStart) {
        inventory.add(item);
      }
    }
    weight = 100;
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
  public void setWeight(int weight) {
    this.weight += weight;
  }
}
