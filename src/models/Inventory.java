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
   * Contructor for the Inventory class
   */
  public Inventory() {
    ItemList list = new ItemList();
    List<Item> readConfig = list.readConfig(location);
    for (Item item : readConfig) {
     inventory.add(item); 
    }
    weight = 0;
  }

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

  public int getWeight() {
    return weight;
  }

  public List getList() {
    return inventory;
  }

  public void add(Item item) {
    inventory.add(item);
  }

  public void setWeight(int weight) {
    this.weight += weight;
  }
}
