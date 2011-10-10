package edu.gatech.cs2340.shlat.models;

public class Store {
  private Inventory inventory;

  // Constructor for a store instance
  public Store() {
    inventory = new Inventory();
  }

  public void purchase(int item_id, Player player) {
    Item item = null;
    List inventoryList = inventory.getList();
    for (Item itemTmp : inventoryList) {
      int id = item.getId();
      if (id == item_id) {
        item = itemTmp;
        break;
      }
    }
  }
}
