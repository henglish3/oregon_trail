/**
 * Enumeration that represents the statuses a character can have. 
 * Immortal, Normal, Sick, and Dead.
 * 
 * @author S.H.L.A.T.
 * @version 0.2 10/09/11
 */
 
package edu.gatech.cs2340.shlat.models;

public enum Status {
    IMMORTAL(0),
    NORMAL(1),
    SICK(2),
    DEAD(3);
    
    private int status;
    
    /**
     * Constructor that assigns the character's status
     */
    Status(int status) {
        this.status = status;
    } //ends Status constructor.
    
    /**
     * Method that gets the character's status.
     *   
     * @return The status the character has.
     */
    public int getstatus() {
        return status;
    } //ends getStatus method.
    
    /**
     * toString method returns a string.
     * 
     * @return The string that is returned.
     */
    public String toString() {
        return " ";
    } //ends toString method.
} //ends Status enumueration.