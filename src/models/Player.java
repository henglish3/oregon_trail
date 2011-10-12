/**
 * Class that represents the player.
 * 
 * @author S.H.L.A.T.
 * @version 0.1 10/04/11
 */
 
package edu.gatech.cs2340.shlat.models;
 
public class Player extends Character {
    private int money;
    private Inventory inventory;

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
} //ends Player class.
