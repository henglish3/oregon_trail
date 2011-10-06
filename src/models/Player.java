/**
 * Class that represents the player.
 * 
 * @author S.H.L.A.T.
 * @version 0.1 10/04/11
 */
 
package edu.gatech.cs2340.shlat.models;
 
public class Player extends Character {
    public Player(int age, int sex, String name, Job job) {
        super(age, sex, name, Status.IMMORTAL);
        this.job = job;
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

    public String jobString() {
      return job.toString();
    }
} //ends Player class.
