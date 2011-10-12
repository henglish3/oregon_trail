package edu.gatech.cs2340.shlat.models;

import java.util.List;

public class Store {
  private Inventory inventory;

  /**
   * This constructor creates a new store with every item in its inventory
   */
  public Store() {
    inventory = new Inventory();
  }

  /**
   * This method purchases an item for the player if it is possible.
   * 
   * @param player The player object that is purchasing the item
   * @param wagon The wagon object that is "carrying" the inventory
   * @param item The item being purchased
   * @param amount The amount of the item being purchased
   */
  public void purchase(Player player, Wagon wagon, Item item, int amount) {   
    int playerMoney = player.getMoney();
    int price = (int)item.getPrice();
    int cost = amount * price;
    System.out.println(price);

    if (playerMoney > cost) {
      // The player can afford the item
      Inventory playerInventory = player.getInventory();
      
      int weight = playerInventory.getWeight();
      weight += (item.getWeight() * amount);
      if (weight < wagon.MAX_WEIGHT) { 
        // The wagon can hold the weight of the item 
        int currentAmount = item.getAmount();
        item.changeAmount(currentAmount - amount);
        player.addItem(item);
        player.setMoney(playerMoney - cost);
      } else {
        System.out.println("You cannot carry this much weight.");
      }
    } else {
      System.out.println("You cannot afford this.");
    }
  }

  /**
   * This method returns the inventory as a list of items
   *
   * @return the list of items.
   */
  public List getInventoryAsList() {
    return inventory.getList();
  }
}
