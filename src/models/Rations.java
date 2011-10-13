/**
 * Class that represents a player's Rations 
 * @author S.H.L.A.T.
 * @version 0.2 10/11/2011
 */

package edu.gatech.cs2340.shlat.models;

public class Rations {
  private String ration;

  /**
   * Method creates a Rations object with a selected rations description
   * @param rationsSelection The rations of the player
   */
  public Rations(String rationsSelection){
    if(rationsSelection.equalsIgnoreCase("None"))
      ration = "None";
    else if(rationsSelection.equalsIgnoreCase("Bare-bones"))
      ration = "Bare-bones";
    else if(rationsSelection.equalsIgnoreCase("Meager"))
      ration = "Meager";
    else if(rationsSelection.equalsIgnoreCase("Normal"))
      ration = "Normal";
    else if(rationsSelection.equalsIgnoreCase("Well fed"))
      ration = "Well fed";
  }

  /**
   * Method returns this player's ration description
   * @return ration This player's ration description
   */
  public String getRation(){
    return ration;
  }

  /**
   * Method sets a new description for this player's ration
   * @param ration The new description for this player's ration
   */
  public void setRation(String ration){
    this.ration = ration;
  }
}
