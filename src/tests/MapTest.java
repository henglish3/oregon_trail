//package edu.gatech.cs2340.shlat.tests;
package tests;

import org.junit.*;
import junit.framework.*;
import org.junit.Test;
import org.junit.Assert;
import edu.gatech.cs2340.shlat.models.*;

/**
 * @author Stewart Hall
 * Store getNextLocation() tests
 */
public class MapTest {
    Map testMap;
    
    /**
     * Fixtures for the tests
     */
    @Before public void setUp() {
        testMap = new Map();
        testMap.addLocation(new Location("Georgia", "GT", 10, 10, false));
        testMap.addLocation(new Location("Maine", "", 100, 100, false));
        testMap.addLocation(new Location("South Carolina", "", 20, 20, false));
        testMap.addLocation(new Location("North Carolina", "", 40, 40, false));
        testMap.addLocation(new Location("New York", "", 80, 80, false));
        testMap.addLocation(new Location("Maryland", "", 60, 60, false));
    }

    /**
     * Test the getNextLocation method
     */
    @Test public void testGetNextLocation() {
        Assert.assertEquals(testMap.getNextLocation(0).getName(), "Georgia");
        Assert.assertEquals(testMap.getNextLocation(21).getName(), "North Carolina");
        Assert.assertEquals(testMap.getNextLocation(55).getName(), "Maryland");
        Assert.assertEquals(testMap.getNextLocation(99).getName(), "Maine");
        Assert.assertEquals(testMap.getNextLocation(101), null);
    }
}
