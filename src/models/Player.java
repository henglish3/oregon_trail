/**
 * Class that represents the player.
 * 
 * @author S.H.L.A.T.
 * @version 0.1 10/04/11
 */
 
package edu.gatech.cs2340.shlat.models;
import java.io.Serializable;
 
public class Player extends Character implements Serializable {
    private int money;
    private Inventory inventory;

    public Player()  {}

    public Player(int age, int sex, String name, Job job) {
        super(age, sex, name, Status.IMMORTAL);
        this.job = job;
        this.money = 1600;
        this.inventory = new Inventory(true);
    }
    /**
     * Enumerated type which identifies the character's job.
     */
    public enum Job {
        BANKER, FARMER, CARPENTER;
    } //ends Job enum.
    
    private Job job;
  
    /**
     * Method that gets the job of the character.
     * 
     * @return The job of the character.
     */
    public Job getJob() {
        return job;
    } //ends getJob method.
 
    /**
    * Method that sets the character's job.
    * 
    * @param job The job the character will have. 
    */
    public void setJob(Job job) {
        this.job = job;
    } //ends setJob method.

    /**
     * Method that returns a string value of the player's job.
     * 
     * @return The string value of the player's job.
     */    
    public String jobString() {
      return job.toString();
    }

    /**
     * This method sets the amount of money a player has
     *
     * @param money an amount of money to set to the player
     */
    public void setMoney(int money) {
      this.money = money;
    }

    /**
     * This method gets the amount of money a player has
     *
     * @return the amount of money a player has
     */
    public int getMoney() {
      return money;
    }

    /**
     * This method returns the players current inventory
     *
     * @return The players current inventory as an inventory object
     */
    public Inventory getInventory() {
      return inventory;
    }
    
    /**
     * This method adds an item to the players inventory and updates the inventory's weight.
     *
     * @param item The item to be added to the inventory.
     */
    public void addItem(Item item) {
      inventory.add(item); // add the item
      inventory.setWeight(item.getWeight() * item.getAmount()); // update the weight
    }
    
    /**
     * This method updates the food in the players inventory by subtracting the distrance travled from the amount of food currently in the inventory. Currently one unit of food is consumed for every unit traveled.
     *
     * @param players The amount of players currently alive
     * @param ration  The current ration being used
     */
    public void consumeFood(int players, int ration) {
        Item food = inventory.getItemById(4); // get the food in the players inventory
        int quantity = food.getAmount();
        quantity -= (players * ration); // currently 1 unit of food is consumed for every unit of distance covered
        food.changeAmount(quantity);
        inventory.update(food);
    }

    /**
     * This method returns the amount of food the player currently has in their inventory.
     *
     * @return The amount of food in the inventory.
     */
    public int getFood() {
        Item food = inventory.getItemById(4);
        return food.getAmount();
    }
} //ends Player class.
