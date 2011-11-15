/**
 * Class that represents the pace.
 * 
 * @author S.H.L.A.T.
 * @version 0.2 10/10/11
 */

package edu.gatech.cs2340.shlat.models;
import java.io.Serializable;

public class Pace implements Serializable {
    private int pace;

    public Pace() {}

    /**
     * Constructor that sets the initial pace.
     * 
     * @param pace The pace of the wagon.
     */
    public Pace(int pace) {
      this.pace = pace;
    } //ends Pace constructor.

    /**
     * Method that gets the pace.
     * 
     * @return The wagon's pace..
     */
    public int getPace() { 
        return this.pace;
    } //ends getPace method.
    
    /**
     * Method that sets the pace.
     * 
     * @param pace The change in the the wagon's pace.
     */
    public void setPace(int pace) {
        this.pace = pace;
    } //ends setPace method.
    
    /**
     * Gets the distance traveled in one day at the current pace
     *
     * @return The number of miles traveled in one day at the given pace
     */
    public int getDistanceTraveled() {
        return (pace * 10);
    }
} //ends Pace class.
