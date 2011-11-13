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
   * Method causes a 20% chance of an event happening everytime a player clicks to go.
   * 
   * @param location The wagon's current location.
   * @param pace The wagon's current pace.
   * @param rations The wagon's amount of rations used while moving.
   * @param player The player.
   * @param party The party.
   */
  public void chanceEvent(Location location, Pace pace, Rations rations, Player player, Party party) {
      int chance =(int)(Math.random()*5);
      if(chance == 0){
          selectEvent(location, pace, rations, player, party);
      }
  } //ends chanceEvent method.
  
  /**
   * Method that assigns chance of every event occuring and then selects which one to do.
   * 
   * @param location The wagon's current location.
   * @param pace The wagon's current pace.
   * @param rations The wagon's amount of rations used while moving.
   * @param player The player.
   * @param party The party.
   */
  public void selectEvent(Location location, Pace pace, Rations rations, Player player, Party party) {
      
      //int ID = ;
   //displayEvent(ID);   
  } //ends selectEvent method.
  
  /**
   * Method that assigns chance of every event occuring and then selects which one to do.
   * 
   * @param ID The ID of the event that will occur.
   * @param pace The wagon's current pace.
   * @param rations The wagon's amount of rations used while moving.
   * @param player The player.
   * @param party The party.
   */
  public void doEvent(int ID, Pace pace, Rations rations, Player player, Party party) {
      
  } //ends doEvent method.
  
  /**
   * Method that sends information on what event has occured and the outcome
   * 
   * @param ID The ID of the event that has occured.
   */
  public void displayEvent(int ID)
  {
  } //ends displayEvent method.
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
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
    } else {
     return false;
    }
  }

  /**
   * This method prints out the message associated with this Event object
   */
  public String toString(){
    return message;
  }
}

