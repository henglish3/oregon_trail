package edu.gatech.cs2340.shlat.models;
import java.util.*;
/**
 * This class will create an Event object with it's own set of actions throughout the gameplay
 * @author S.H.L.A.T.
 * @version 1.0 11/08/2011
 */
public class Event {
  private Party partyMembers;
  private int randChar;
  private String message;
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
    randChar = (int) Math.random()*3;
    if(chance <= 15 && partyMembers.getCharacterStatus(randChar) != Status.DEAD) {
        partyMembers.setCharacterStatus(randChar, Status.DEAD);
        message =  "" + partyMembers.getCharacterName(randChar) + " has just been arrested for prostition and cannot continue on the journey. ";
        return true;
    else {
    	return false;
  }

  /**
   * This method prints out the message associated with this Event object
   */
  public String toString(){
    return message;
  }
}

