package edu.gatech.cs2340.shlat.models;
import java.util.*;
import java.lang.Math;

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
   * CURRENTLY NOT USED This constructor creates an Event object
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
   * @param wagon The wagon.
   * @param date The date.
   */
  public void chanceEvent(Location location, Pace pace, Rations rations, Player player, Party party, Wagon wagon, Date date) {
      int chance =(int)(Math.random()*5);
      if(chance == 0){
          selectEvent(location, pace, rations, player, party, wagon, date);
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
   * @param wagon The wagon.
   * @param date The date.
   */
  public void selectEvent(Location location, Pace pace, Rations rations, Player player, Party party, Wagon wagon, Date date) {
      int ID = ((int)(Math.random()*5)) + 1;
      doEvent(ID, pace, rations, player, party, wagon, date);
  } //ends selectEvent method.
  
  /**
   * Method that assigns chance of every event occuring and then selects which one to do.
   * 
   * @param ID The ID of the event that will occur.
   * @param pace The wagon's current pace.
   * @param rations The wagon's amount of rations used while moving.
   * @param player The player.
   * @param party The party.
   * @param wagon The wagon.
   * @param date The date.
   */
  public void doEvent(int ID, Pace pace, Rations rations, Player player, Party party, Wagon wagon, Date date) {
      if(ID == 1) { //EVENT: STORM EVENT. LOSE X AMOUNT OF DAYS AND RATION FOR THOSE DAYS. 
          int daysLost = ((int)(Math.random()*3)) + 1;
          for(int i = 0; i != daysLost; i++) {   
          date.updateDay();
          player.consumeFood(party.getCharacters().length, party.getCharacters().length);
          }
          //MESSAGE: You were caught in a storm. You have lost daysLost from your journey.
      }
      if(ID == 2) { //EVENT: A CHARACTER WILL GET ILL, IF ALREADY ILL THEN DIE.
          int i = 0;
          int j = party.getCharacters().length - 1;
          boolean a = false;
          while(!a || i < j) {
              int charNum = (int)(Math.random()* j);
              if(party.getCharacterStatus(charNum) == Status.NORMAL) {
                  party.getCharacter(charNum).setStatus(Status.SICK);
                  a = true;
                  //MESSAGE: party.getCharacterName(charNum)is now ill.
              }
              else if(party.getCharacterStatus(charNum) == Status.SICK) {
                  party.getCharacter(charNum).setStatus(Status.DEAD);
                  a = true;
                  //MESSAGE: party.getCharacterName(charNum)has died. 
              }
              else{
                  j--;
              }
          }
      }    
      if(ID == 3) { //EVENT: A CHARACTER WILL RECOVER IF SICK EVENT.
          int i = 0;
          int j = party.getCharacters().length - 1;
          boolean a = false;
          while(!a || i < j) {
              int charNum = (int)(Math.random()* j);
              if(party.getCharacterStatus(charNum) == Status.SICK) {
                  party.getCharacter(charNum).setStatus(Status.NORMAL);
                  a = true;
                  //MESSAGE: party.getCharacterName(charNum)has recovered from their sickness. 
              }
              else{
                  j--;
              }
          }
      } 
      /*
      if(ID == 4) { //EVENT: WAGON DAMAGE
          int partBroke = (int)(Math.random()*3);
          if(partBroke == 0) {
              wagon.setWheel(false);
            if(player.getJob() == FARMER) {
                  wagon.setWheel(true);
              }
              else if(player.getInventory(WHEEL INVENTORY) > 0) {
                  wagon.setWheel(true);
              }
          }

          else if(partBroke == 1) {
              wagon.setAxle(false);
             if(player.getJob() == FARMER) {
                  wagon.setAxle(true);
              }
              else if(player.getInventory(find if there is at least 1 of that part in inventory) {
                  wagon.setAxle(true);
              }
              
          }
          else {
              wagon.setTongue(false);
              if(player.getJob() == FARMER) {
                  wagon.setTongue(true);
              }
              else if(player.getInventory(find if there is at least 1 of that part in inventory) {
                  wagon.setTongue(true);
              }
              
          }
          */
          if(ID == 4) { //EVENT: RANDOM ITEM STOLEN EVENT.
              boolean a = false;
              while(!a) {
                  double t = Math.random();
                  int temp = (int)(t * player.getInventory().getList().size());
                  Item lostItem = (Item)(player.getInventory().getList().get(temp));
                  if(lostItem.getAmount() <= 1){
                      lostItem.changeAmount(lostItem.getAmount() - 1);
                      a = true;
                      //MESSAGE: 1 lostItem has been stolen from your wagon.
                  }
              }
          }
          if(ID == 5) { //EVENT: FREE 10-100 RATIONS EVENT.
              boolean a = false;
              int freeAmount = (int)((Math.random()*90) + 10);
              while(!a) {
                  if(player.getFood() + freeAmount  <= 2000) { //2000 represents max amount can carry. change later.
                      player.consumeFood(1, freeAmount);
                      a = true;
                      //MESSAGE: You went into a homeless shelter and you have been given freeAmount of rations.
                  }
                  else{
                      --freeAmount;
                      if(freeAmount <= 0) {
                          a = true;
                      }
                  }
              }
          }
          //if(ID == 7) { //EVENT: OXEN DEATH EVENT.
         //}
          //if(ID == 8) { //EVENT: OXEN TIRED EVENT. MOVE SLOWER FOR 3 DAYS.
          //}
          
      
  } //ends doEvent method.
  
  /**
   * Method that sends information on what event has occured and the outcome
   * 
   * @param ID The ID of the event that has occured.
   */
  public void displayEvent(int ID) {
  } //ends displayEvent method.
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  /**
   * SCRAP THIS METHOD LATER This method represents an event in which one of the characters is randomly arrested due to prostitution. 
   * @param randomInt The random integer calcuated to determine the index of the character that will be affected by this event
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
   * This method prints out the message associated with this Event object.
   * 
   * @return the String that needs to be returned.
   */
  public String toString(){
    return message;
  } //ends toString method.
} //ends Event class.