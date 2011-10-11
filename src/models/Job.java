/**
 * Enumeration that represents the jobs the player can have. 
 * Banker, Carpenter and Farmer. 
 * 
 * @author S.H.L.A.T.
 * @version 0.2 10/09/11
 */
 
package edu.gatech.cs2340.shlat.models;

public enum Job {
    BANKER(0),
    CARPENTER(1),
    FARMER(2);
    
    private final int job;
    
    /**
     * Constructor that assigns the jobs.
     */
    Job(int job) {
        this.job = job;
    } //ends Job constructor.
    
    /**
     * Method that gets the player's job.
     *   
     * @return The job the player has.
     */
    public int getJob() {
        return job;
    } //ends getJob method.
    
    /**
     * toString method returns a string.
     * 
     * @return The string that is returned.
     */
    public String toString() {
        return " ";
    } //ends toString method.
} //ends Job enumeration.