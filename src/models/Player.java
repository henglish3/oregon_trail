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

    public void setMoney(int money) {
      this.money = money;
    }

    public int getMoney() {
      return money;
    }

    public Inventory getInventory() {
      return inventory;
    }
    
    public void addItem(Item item) {
      inventory.add(item);
      inventory.setWeight(item.getWeight());
    }
} //ends Player class.
