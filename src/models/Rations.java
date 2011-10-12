package edu.gatech.cs2340.shlat.models;
/**
 * This class represents a player's Rations 
 * @author S.H.L.A.T.
 * @version 1.0 10/11/2011
 */
public class Rations {
  private String ration;
  /**
   * This method creates a Rations object with a selected rations description
   * @param
   *    The rations of the player
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
   * This method returns this player's ration description
   * @return ration
   *      This player's ration description
   */
  public String getRation(){
    return ration;
  }
  /**
   * This method sets a new description for this player's ration
   * @param ration
   *    The new description for this player's ration
   */
  public void setRation(String ration){
    this.ration = ration;
  }
}
