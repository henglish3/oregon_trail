package edu.gatech.cs2340.shlat.tests;

import org.junit.*;
import org.junit.Test;
import org.junit.Assert.*;
import edu.gatech.cs2340.shlat.models.*;
/**
 * Class tests the crossRiver() method.
 * @author Lucas Pessoa
 * @version 1.0 11/29/2011
 */
public class RiverTestCase {
	/**
	 * Method checks if crossRiver() method makes player cross river if they chose to and have 50 money.
	 */
        @Test
	public void testPayWin(){
                int choice = 0;
                Player player = new Player();
                Party party = new Party();
                River river = new River();
                player.setMoney(50);
                river.crossRiver(choice, player, party);
		Assert.assertEquals("You pay 50$ to cross on a ferry", river.crossRiver(choice, player, party)); 
	}

	/**
	 * Method checks if crossRiver() method prevents player from crossing river if they chose to, but don't have 50 money.
	 */
        @Test
	public void testPayLose(){
                int choice = 0;
                Player player = new Player();
                Party party = new Party();
                River river = new River();
                player.setMoney(49);
                river.crossRiver(choice, player, party);
		Assert.assertEquals("", river.crossRiver(choice, player, party)); 
	}

	/**
	 * Method checks if crossRiver() method makes player ford the river if they chose to and depth is less than 3.
	 */
        @Test
	public void testFordWin(){
                int choice = 1;
                Player player = new Player();
                Party party = new Party();
                River river = new River();
                river.crossRiver(choice, player, party);
		Assert.assertEquals(fordRiver(player, party), river.crossRiver(choice, player, party)); 
	}

	/**
	 * Method checks if crossRiver() method prevents player from fording the river if they chose to and depth is 3 or more.
	 */
        @Test
	public void testFordLose(){
                int choice = 1;
                Player player = new Player();
                Party party = new Party();
                River river = new River();
                river.crossRiver(choice, player, party);
		Assert.assertEquals("", river.crossRiver(choice, player, party)); 
	}

	/**
	 * Method checks if crossRiver() method makes player caulk wagon across river if they choose to.
	 */
        @Test
	public void testCaulk(){
                int choice = 2;
                Player player = new Player();
                Party party = new Party();
                River river = new River();
                river.crossRiver(choice, player, party);
		Assert.assertEquals(caulkRiver(player, party), river.crossRiver(choice, player, party)); 
	}
}
