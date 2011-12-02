package edu.gatech.cs2340.shlat.tests;

import org.junit.*;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;
import edu.gatech.cs2340.shlat.models.*;

/**
 * This class will test the increaseStatus() method in the Status calss
 * @author Alfonza Lewis
 * @version 1.0 11/29/2011
 */
public class StatusTestCase {
	/**
	 * This method creates a Status object and tests the values of the player's status value
	 */
	public void testIncreaseStatus(){
		Status newStatus = Status.NORMAL;
		newStatus.increaseStatus();
		assertEquals(3 ,newStatus.getStatus()); 
	}
	/**
	 * This method creates a Status object and tests the values of a player's status value
	 */
	public void testDecreaseStatus(){
		Status newStatus = Status.NORMAL;
		newStatus.decreaseStatus();
		assertEquals(1, newStatus.getStatus());
	}
}