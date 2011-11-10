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
  public Event(Character char1, Character char2, Character char3, Character char4, ){
    generator = new Random();
    partyMembers = new Party(char1, char2, char3, char4);
  }
  /**
   * This method represents an event in which one of the characters is randomly arrested due to prostitution. 
   * @param randomInt 
   *      The random integer calcuated to determine the index of the character that will be affected by this event
   */
  public void arrest(int randomInt){
    message = "" + partyMembers.getCharacterName(randomInt) + " has just been arrested for prostition and cannot continue on the journey. ";
    partyMembers.setCharacterStatus(randomInt, Status.DEAD);
  }
  /**
   * This method represents an event in which one of the characters instantly dies due to having AIDS from prostitution
   * @param randomInt 
   *      The random integer calcuated to determine the index of the character that will be affected by this event
   */
  public void aidsDeath(int randomInt){
    message = "" + partyMembers.getCharacterName(randomInt) + " has just died due to having AIDS from prostitution. ";
    partyMembers.setCharacterStatus(randomInt, Status.DEAD);
  }
  /**
   * This method represents an event in which one of the characters gets jacked and beat up so bad that he/she bleeds to death
   * @param randomInt 
   *      The random integer calcuated to determine the index of the character that will be affected by this event
   */
  public void bleedToDeath(int randomInt){
    message = "" + partyMembers.getCharacterName(randomInt) + " has just been viciously beaten to death by thugs. ";
    partyMembers.setCharacterStatus(randomInt, Status.DEAD);
  }
  /**
   * This method represents an event that changes the status of one of the players to become sick
   * @param randomInt 
   *      The random integer calcuated to determine the index of the character that will be affected by this event
   */
  public void illness(int randomInt){
    partyMembers.setCharacterStatus(randomInt, Status.SICK);
    message = "" + partyMembers.getCharacterName(randomInt) + "just became ill.";
  }
  /**
   * This method represents an event that changes the status of one of the characters to become fully recovered (or NORMAL)
   * @param randomInt 
   *      The random integer calcuated to determine the index of the character that will be affected by this event
   */
  public void recovery(int randomInt){
    partyMembers.setCharacterStatus(randomInt, Status.NORMAL);
    message = "" + partyMembers.getCharacterName(randomInt) + " has fully recovered back to health.";
  }
  /**
   * This method represents an event in which a thief steals X (food or clothing) amount (up to 10 %) of an item
   */
  public void theft(Inventory goods){
    this.stock = goods;
    randomInt = generator.nextInt(2);
    percentageValue = generator.nextInt(11) + 1;
    switch (randomInt) {
      case 0://the case that food is chosen to be stolen (id 4)
        item = stock.getItemById(4);
        itemLoss = item.getAmount()*(percentageValue/100);
        if (!(item.getAmount() < itemLoss)) {
          item.changeAmount(item.getAmount() - itemLoss);
        }
        else {
          item.changeAmount(0);
        }
        message = "THEFT!!! You have lost " + itemLoss + " amount of food.";
        break;
      case 1://the case that clothes are stolen
        item = stock.getItemById(5);
        itemLoss = item.getAmount()*(percentageValue/100);
        if (!(item.getAmount() < itemLoss)) {
          item.changeAmount(item.getAmount() - itemLoss);
        }
        else {
          item.changeAmount(0);
        }
        message = "THEFT!!! You have lost " + itemLoss + " amount of clothing.";
        break;

      default:
        break;
    }
  }
  /**
   * This method prints out the message associated with this Event object
   */
  public String printMessage(){
    return message;
  }
}

