package edu.gatech.cs2340.shlat.tests;

import org.junit.*;
import org.junit.Test;
import org.junit.Assert;
import edu.gatech.cs2340.shlat.models.*;

public class StoreTests {
  private Wagon w;
  private Player p;
  private Item i;
  private Store s;

  @Before public void setUp() {
    w = new Wagon();
    p = new Player();
    i = new Item();
    s = new Store();
  }

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
