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
  public String purchase(Player player, Wagon wagon, Item item, int amount) {   
    int playerMoney = player.getMoney();
    int price = (int)item.getPrice();
    int cost = amount * price;
    int currentAmount = item.getAmount();
    Item playerItem;

    if (amount <= currentAmount) {
      if (playerMoney >= cost) {
        // The player can afford the item
        Inventory playerInventory = player.getInventory();
        
        int weight = playerInventory.getWeight();
        weight += (item.getWeight() * amount);
        if (weight <= wagon.MAX_WEIGHT) { 
          // The wagon can hold the weight of the item 
          item.changeAmount(currentAmount - amount);
          
          //Check if the player already has this item in his/her inventory
          if((playerItem = playerInventory.getItemById(item.getId())) != null)
            playerItem.changeAmount(playerItem.getAmount() + amount);
          else {
            playerItem = new Item(item, amount);
            player.addItem(playerItem);
          }
          player.setMoney(playerMoney - cost);
          playerInventory.setWeight(weight);

          return "Purchased.";
        } else {
          return "You cannot carry this much weight." ;
        }
      } else {
        return "You cannot afford this." ;
      }
    } else {
      return "You cannot purchase more than the store currently has in stock." ;
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
