/**
 * Class that represents a player's Rations 
 * @author S.H.L.A.T.
 * @version 0.2 10/11/2011
 */

package edu.gatech.cs2340.shlat.models;

public class Rations {
  private int ration;

  /**
   * Method creates a Rations object with a selected rations description
   * @param rations The rations of the player
   */
  public Rations(int rations){
    this.ration = rations;
  }

  /**
   * Method returns this player's ration description
   * @return ration This player's ration description
   */
  public int getRation(){
    return ration;
  }

  /**
   * Method sets a new description for this player's ration
   * @param ration The new ration for the player
   */
  public void setRation(int ration){
    this.ration = ration;
  }
}
