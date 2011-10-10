package edu.gatech.cs2340.shlat.models;

import java.util.List;

public class Store {
  private Inventory inventory;

  // Constructor for a store instance
  public Store() {
    inventory = new Inventory();
  }

  public void purchase(int item_id, Player player, Wagon wagon) {
    Item item = null;
    List<Item> inventoryList = inventory.getList();
    for (Item itemTmp : inventoryList) {
      int id = item.getId();
      if (id == item_id) {
        item = itemTmp;
        break;
      }
    }
    
    int playerMoney = player.getMoney();
    int price = (int)item.getPrice();

    if (playerMoney > price ) {
      // Need to add wagon weight check.
      // if item weight exceeds wagon weight.

    } else {
      System.out.println("You cannot afford this.");
    }
  }
}
