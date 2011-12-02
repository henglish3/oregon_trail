//package edu.gatech.cs2340.shlat.tests;
package tests;

import org.junit.*;
import junit.framework.*;
import org.junit.Test;
import org.junit.Assert;
import edu.gatech.cs2340.shlat.models.*;

/**
 * @author Tomer Elmalem
 * Store purchase() tests
 */
public class StoreTests extends TestCase {
  private Wagon w;
  private Store s;
  
  /**
   * Fixtures for the tests
   */
  @Before public void setUp() {
    w = new Wagon();
    s = new Store();
  }

  /**
   * Test the amount condition of the purchase method
   */
  @Test public void testAmount() {
    Player p = new Player();
    p.initializeInventory();
    Item i = new Item("Food", 1, 1, 10);

    String expected = "Purchased.";
    String result = s.purchase(p, w, i, 1);
    Assert.assertTrue(expected.equals(result));
  }

  /**
   * Test the cost condition of the purchase method
   */
  @Test public void testCost() {
    Player p = new Player();
    p.initializeInventory();
    Item i = new Item("Food", 1, 1, 800);

    String expected = "Purchased.";
    String result = s.purchase(p, w, i, 1);
    Assert.assertTrue(expected.equals(result));
  }
  
  /**
   * Test the weight condition of the purchase method
   */
  @Test public void testWeight() {
    Player p = new Player();
    p.initializeInventory();
    Item i = new Item("Food", 1, 1, 10);

    String expected = "Purchased.";
    String result = s.purchase(p, w, i, 10);
    Assert.assertTrue(expected.equals(result));
  }
}
