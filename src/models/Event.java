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
   * This constructor creates an Event object
   * @param party The party used to handle events.
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
      message = "";
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
      int ID = ((int)(Math.random()*6)) + 1;
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
          message = "You were caught in a storm. You have lost " + daysLost + " days from your journey.";
      }
      if(ID == 2) { //EVENT: A CHARACTER WILL GET ILL, IF ALREADY ILL THEN DIE.
          int i = 0;
          int j = party.getCharacters().length - 1;
          boolean a = false;
          int charNum = (int)(Math.random()* j);
          int orig = charNum;
          while(!a) {
              if(party.getCharacterStatus(charNum) == Status.NORMAL) {
                  party.getCharacter(charNum).setStatus(Status.SICK);
                  a = true;
                  message = "" + party.getCharacterName(charNum) + " is now ill";
              }
              else if(party.getCharacterStatus(charNum) == Status.SICK) {
                  party.getCharacter(charNum).setStatus(Status.DEAD);
                  a = true;
                  message = "" + party.getCharacterName(charNum) + " has died";
              }
              else{
                  charNum++;
                  if(charNum == party.getCharacters().length)
                    charNum = 0;
                  if(charNum == orig)
                    break;
              }
          }
      }    
      if(ID == 3) { //EVENT: A CHARACTER WILL RECOVER IF SICK.
          int i = 0;
          int j = party.getCharacters().length - 1;
          boolean a = false;
          int charNum = (int)(Math.random()* j);
          int orig = charNum;
          while(!a) {
              if(party.getCharacterStatus(charNum) == Status.SICK) {
                  party.getCharacter(charNum).setStatus(Status.NORMAL);
                  a = true;
                  message = "" + party.getCharacterName(charNum) + " has recovered from their sickness.";
              }
              else{
                  charNum++;
                  if(charNum == party.getCharacters().length)
                    charNum = 0;
                  if(charNum == orig)
                    break;
              }
          }
      } 
      if(ID == 4) { //EVENT: WAGON DAMAGE.
          int partBroke = (int)(Math.random()*3);
          if(partBroke == 0) {
              wagon.setWheel(false);
            if(player.getJob() == Player.Job.FARMER) {
                  wagon.setWheel(true);
                  message = "A wheel has been damaged. However since " + party.getCharacterName(0) + " is a farmer it has been repaired.";
              }
              else if(player.getInventory().getItemById(6).getAmount() > 0) {
                  wagon.setWheel(true);
                  player.getInventory().getItemById(6).changeAmount(-1);
                  player.getInventory().update(player.getInventory().getItemById(6));
                  message = "A wheel has been damaged. " + party.getCharacterName(0) + " has replaced the wheel.";
              }
          }
          if(partBroke == 1) {
              wagon.setAxle(false);
            if(player.getJob() == Player.Job.FARMER) {
                  wagon.setAxle(true);
                  message = "An axle has been damaged. However since " + party.getCharacterName(0) + " is a farmer it has been repaired.";
              }
              else if(player.getInventory().getItemById(7).getAmount() > 0) {
                  wagon.setAxle(true);
                  player.getInventory().getItemById(7).changeAmount(-1);
                  player.getInventory().update(player.getInventory().getItemById(6));
                  message = "A axle has been damaged. " + party.getCharacterName(0) + " has replaced the axle.";
              }
          }
          else {
              wagon.setTongue(false);
            if(player.getJob() == Player.Job.FARMER) {
                  wagon.setTongue(true);
                  message = "An tongue has been damaged. However since " + party.getCharacterName(0) + " is a farmer it has been repaired.";
              }
              else if(player.getInventory().getItemById(8).getAmount() > 0) {
                  wagon.setTongue(true);
                  player.getInventory().getItemById(8).changeAmount(-1);
                  player.getInventory().update(player.getInventory().getItemById(6));
                  message = "A tongue has been damaged. " + party.getCharacterName(0) + " has replaced the tongue.";
              }
          }
      }
          if(ID == 5) { //EVENT: RANDOM ITEM STOLEN.
              boolean a = false;
              while(!a) {
                  double t = Math.random();
                  int temp = (int)(t * player.getInventory().getList().size());
                  Item lostItem = (Item)(player.getInventory().getList().get(temp));
                  if(lostItem.getAmount() >= 1){
                      lostItem.changeAmount(lostItem.getAmount() - 1);
                      a = true;
                      message = "1 " + lostItem.getName() + " has been stolen from your wagon.";
                  }
              }
          }
          if(ID == 6) { //EVENT: FREE 10-100 RATIONS.
              boolean a = false;
              int freeAmount = (int)((Math.random()*90) + 10);
              while(!a) {
                  if(player.getFood() + freeAmount  <= 2000) { //2000 represents max amount can carry. change later.
                      player.consumeFood(1, (-freeAmount));
                      a = true;
                      message = "You went into a homeless shelter and you have been given " + freeAmount + " pounds of free rations.";
                  }
                  else{
                      --freeAmount;
                      if(freeAmount <= 0) {
                          a = true;
                      }
                  }
              }
          }
          if(ID == 7) { //EVENT: OXEN DEATH.
              wagon.setOxen(false);
              player.getInventory().getItemById(3).changeAmount(-1);
              player.getInventory().update(player.getInventory().getItemById(3));
              message = "An oxen has died.";
              if(player.getInventory().getItemById(3).getAmount() > 0) {
                  wagon.setOxen(true);
              }
          }
  } //ends doEvent method.
  
  /**
   * Method that sends information on what event has occured and the outcome
   * 
   * @return the message explaining what happened
   */
  public String getMessage() {
    return message;
  } //ends getMessage method.

  /**
   * This method prints out the message associated with this Event object.
   * 
   * @return the String that needs to be returned.
   */
  public String toString(){
    return message;
  } //ends toString method.
} //ends Event class.
