package edu.gatech.cs2340.shlat.tests;

import org.junit.*;
import org.junit.Test;
import org.junit.Assert;
import edu.gatech.cs2340.shlat.models.*;

public class StoreTests {
  private Wagon w;
  private Store s;

  @Before public void setUp() {
    w = new Wagon();
    s = new Store();
  }

  @Test public void testAmount() {
    Player p = new Player();
    p.initializeInventory();
    Item i = new Item("Food", 1, 1, 10);

    String expected = "Purchased.";
    String result = s.purchase(p, w, i, 1);
    Assert.assertTrue(expected.equals(result));
  }

  @Test public void testCost() {
    Player p = new Player();
    p.initializeInventory();
    Item i = new Item("Food", 1, 1, 800);

    String expected = "Purchased.";
    String result = s.purchase(p, w, i, 1);
    Assert.assertTrue(expected.equals(result));
  }
  
  @Test public void testWeight() {
    Player p = new Player();
    p.initializeInventory();
    Item i = new Item("Food", 1, 1, 10);

    String expected = "Purchased.";
    String result = s.purchase(p, w, i, 10);
    Assert.assertTrue(expected.equals(result));
  }
}
