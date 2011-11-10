package edu.gatech.cs2340.shlat.models;
import java.util.*;
/**
 * This class will create an Event object with it's own set of actions throughout the gameplay
 * @author S.H.L.A.T.
 * @version 1.0 11/08/2011
 */
public class Event {
  private static int deathChance;
  private int oxenLoss;
  private double itemLoss;
  private int randomInt, percentageValue;
  private String message;
  private Random generator;
  private Party partyMembers;
  private Player player1;
  private Pace pace;
  private Item item;
  private Inventory stock;
  /**
   * This constructor creates an Event object
   * @param int
   *      The integer corresponding to the event action
   */
  public Event(Party party){
    partyMembers = party;
  }
  /**
   * This method represents an event in which one of the characters is randomly arrested due to prostitution. 
   * @param randomInt 
   *      The random integer calcuated to determine the index of the character that will be affected by this event
   */
  public boolean checkArrest() {
  	int chance = (int) Math.random()*100;
    int randChar = (int) Math.random()*3;
    if(chance <=30) {
        partyMembers.setCharacterStatus(randomInt, Status.DEAD);
        return true;
    else {
    	return false;
  }

  /**
   * This method prints out the message associated with this Event object
   */
  public String toString(){
    return "" + partyMembers.getCharacterName(randomInt) + " has just been arrested for prostition and cannot continue on the journey. ";
  }
}

