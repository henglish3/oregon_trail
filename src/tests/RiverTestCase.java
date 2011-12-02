package edu.gatech.cs2340.shlat.tests;

import org.junit.*;
import org.junit.Test;
import org.junit.Assert;
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
	public void testPayWin(){
                int choice = 0;
                Player player = new Player();
                Party party = new Party();
                River river = new River();
                player.setMoney(50);
                River.crossRiver(choice, player, party);
		assertEquals("You pay 50$ to cross on a ferry", River.crossRiver(choice, player, party)); 
	}

	/**
	 * Method checks if crossRiver() method prevents player from crossing river if they chose to, but don't have 50 money.
	 */
	public void testPayLose(){
                int choice = 0;
                Player player = new Player();
                Party party = new Party();
                River river = new River();
                player.setMoney(49);
                River.crossRiver(choice, player, party);
		assertEquals("", River.crossRiver(choice, player, party)); 
	}

	/**
	 * Method checks if crossRiver() method makes player ford the river if they chose to and depth is less than 3.
	 */
	public void testFordWin(){
                int choice = 1;
                Player player = new Player();
                Party party = new Party();
                River river = new River();
                River.crossRiver(choice, player, party);
		assertEquals(fordRiver(player, party), River.crossRiver(choice, player, party)); 
	}

	/**
	 * Method checks if crossRiver() method prevents player from fording the river if they chose to and depth is 3 or more.
	 */
	public void testFordLose(){
                int choice = 1;
                Player player = new Player();
                Party party = new Party();
                River river = new River();
                River.crossRiver(choice, player, party);
		assertEquals("", River.crossRiver(choice, player, party)); 
	}

	/**
	 * Method checks if crossRiver() method makes player caulk wagon across river if they choose to.
	 */
	public void testCaulk(){
                int choice = 2;
                Player player = new Player();
                Party party = new Party();
                River river = new River();
                River.crossRiver(choice, player, party);
		assertEquals(caulkRiver(player, party), River.crossRiver(choice, player, party)); 
	}
}