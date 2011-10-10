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

  /**
   * Contructor for the Inventory class
   */
  public Inventory() {
    ItemList list = new ItemList();
    List<Item> readConfig = list.readConfig("items.xml");
    for (Item item : readConfig) {
     inventory.add(item); 
    }
  }

  public Inventory(boolean player) {
    ItemList list = new ItemList();
    List<Item> readConfig = list.readConfig("items.xml");
    for (Item item : readConfig) {
      int playerStart = item.getStart();
      if (playerStart == 1) {
        inventory.add(item);
      }
    }
  }
}
