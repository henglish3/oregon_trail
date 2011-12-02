package edu.gatech.cs2340.shlat.tests;

import org.junit.Test;
import org.junit.Assert;
import edu.gatech.cs2340.shlat.models.*;

public class StoreTests {
  private Wagon w = new Wagon();
  private Player p = new Player();
  private Item i = new Item();
  private Store s = new Store();

  @Test public void testAmount() {
    String expected = "Purchased.";
    String result = s.purchase(p, w, i, 100);
    Assert.assertTrue(expected.equals(result));
  }

  @Test public void testCost() {

  }
  
  @Test public void testWeight() {

  }
}
