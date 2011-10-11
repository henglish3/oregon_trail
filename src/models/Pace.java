/**
 * Class that represents the pace.
 * 
 * @author S.H.L.A.T.
 * @version 0.2 10/10/11
 */

package edu.gatech.cs2340.shlat.models;

public class Pace {
    private int pace;

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
} //ends Pace class.
