/**
 * Class that represents the wagon. It checks if the wagon has all the necessary things to move and keeps track of
 * the maximum amount of weight it can hold.
 * 
 * @author S.H.L.A.T.
 * @version 0.2 10/09/11
 */
 
package edu.gatech.cs2340.shlat.models;

public class Wagon {
    
    private boolean wheel; //turns to false on wagon break event, player must use 1 part from inventory to change true.
    private boolean axle;
    private boolean tongue;
    private boolean oxen; //turns false when there is no oxen on inventory, turns true when there is at least 1.
    public final int MAX_WEIGHT = 3500;    

    /**
     * Constructor that makes a working wagon, but requires the player to first buy oxen.
     */
    public Wagon() {
        wheel = true;
        axle = true;
        tongue = true;
        oxen = false;
    } //ends Wagon constructor.
    
    /**
     * Method that checks if the wagon meets the requirements in order to move.
     */
    public void checkWagon() {
        if(wheel == true && axle == true && tongue == true && oxen == true) {
            //run method that allows wagon to move. 
            //we could also add weight check, food check and ability to drop/sell items anywhere.
        }
        else if(wheel == false) {
            System.out.println("A wheel on your Wagon is broken and needs repplacement.");
        }
        else if(axle == false) {
            System.out.println("An axle on your Wagon is broken and needs replacement.");
        }
        else if(tongue == false) {
            System.out.println("The tongue on your Wagon is broken and needs repairs.");
        }
        else {
            System.out.println("Your wagon needs oxen in order to move.");
        } 
    } //ends checkWagon method.
    
  /**
   * Method that sets the wheel boolean.
   * 
   * @param wheel The change in the the wagon's wheel.
  */
  public void setWheel(Boolean wheel) {
    this.wheel = wheel;
  } //ends setWheel method

  /**
   * Method that sets the axle boolean.
   * 
   * @param axle The change in the the wagon's axle.
  */
  public void setAxle(Boolean axle) {
    this.axle = axle;
  } //ends setAxle method.
  
  /**
   * Method that sets the toungue boolean.
   * 
   * @param tongue The change in the the wagon's tongue.
  */
  public void setTongue(Boolean tongue) {
    this.tongue = tongue;
  } //ends setTongue method.
    
  /**
   * Method that sets the oxen boolean.
   * 
   * @param oxen The change in the the wagon's oxen.
  */
  public void setOxen(Boolean oxen) {
    this.oxen = oxen;
  } //ends setOxen  method.
} //ends Wagon class.
