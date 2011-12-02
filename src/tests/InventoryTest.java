package edu.gatech.cs2340.shlat.tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import edu.gatech.cs2340.shlat.models.*;

/**
*
* @author Harrison English
*/
public class InventoryTest {
    private Inventory instance;

	public InventoryTest() {
    }

    @Before
    public void setUp() {
    	instance = new Inventory();
    }


    @Test
    public void testUpdate() {
    	System.out.println("update Inventory");
        Item item1 = new Item("item1", 1, 0, 0, 0);
        instance.add(item1);
        item1.changeAmount(2);
        instance.update(item1);
        int expResult = 2;
        int result = instance.getItemById(0).getAmount();
        assertEquals(expResult, result); 

    }

}
