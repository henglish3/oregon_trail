package edu.gatech.cs2340.shlat.models;

import java.util.List;

public class Store {
  private Inventory inventory;

  // Constructor for a store instance
  public Store() {
    inventory = new Inventory();
  }

  public void purchase(Player player, Wagon wagon, Item item, int amount) {   
    int playerMoney = player.getMoney();
    int price = (int)item.getPrice();

    if (playerMoney > price ) {
      Inventory playerInventory = player.getInventory();
      
      int weight = playerInventory.getWeight();
      weight += item.getWeight();
      if (weight < wagon.MAX_WEIGHT) {
        int currentAmount = item.getAmount();
        item.changeAmount(currentAmount - amount);
        player.addItem(item);
        player.setMoney(playerMoney - price);
      }

    } else {
      System.out.println("You cannot afford this.");
    }
  }
}
