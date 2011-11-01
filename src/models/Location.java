package edu.gatech.cs2340.shlat.models;

import edu.gatech.cs2340.shlat.models.Store;

/**
 * This class represents a Location object with a String name, an int distance, 
 * @author S.H.L.A.T.
 *
 */
public class Location {
  private String name;
  private Store store1;
  private String landmark;
  private String description;
  private static int distanceTraveled;//Keeps track of how many miles the player has traveled
  /**
   * This method creates a default Location object
   */
  public Location(){
    name = null;
    store1 = null;
    landmark = null;
    Location.distanceTraveled = 0;
  }
  /**
   * This constructor creates a Location object
   * @param name 
   *        The name of this Location object
   * @param landmark
   *        The name of the next traveling point
   */
  public Location (String name, String landmark, Store object){
    this.name = name;
    this.landmark = landmark;
    store1 = object;
    Location.distanceTraveled = 0;
  }
  /**
   * This constructor creates a Location object with specific name, landmark, and distance traveled values
   * @param name 
   *        The name of this Location object
   * @param landmark
   *        The name of the next traveling point
   * @param distance
   *        The starting value of the distance traveled by the player
   */
  public Location(String name, String landmark, int distance, Store object){
    this(name, landmark, object);
    Location.distanceTraveled = distance;
  }
  /**
   * This constructor creates a Location object with specific name, landmark, distance traveled, and distance to landmark values
   * @param name 
   *        The name of this Location object
   * @param landmark
   *        The name of the next traveling point
   * @param distance
   *        The starting value of the distance traveled by the player
   * @param land
   *        The value of the distance to the next traveling point
   */
  public Location(String name, String landmark, int distance, int land, Store object){ 
    this(name, landmark, distance, object);
  }
  /**
   * This method returns the name of the current location
   * @return
   *        The name of the current location
   */
  public String getName(){
    return name;
  }
  /**
   * This method sets a new name for the current location
   * @param name
   *        The new name for the current location
   */
  public void setName(String name){
    this.name = name;
  }
  /**
   * This method returns the name of the next landmark
   * @return 
   *        The name of the next landmark
   */
  public String getLandmark(){
    return landmark;
  }
  /**
   * This method sets a new name for the next landmark
   * @param landmark
   *        The new name of the next landmark
   */
  public void setLandmark(String landmark){
    this.landmark = landmark;
  }
  /**
   * This method returns the distance traveled
   * @return
   *        The distance traveled
   */
  public int getDistance(){
    return Location.distanceTraveled;
  }
  /**
   * This method sets a new distance for this object
   * @param distance 
   *        The new distance traveled by this object
   */
  public void setDistance(int distance){
    Location.distanceTraveled = distance;
  }
  /**
   * This method determines if this location object has a store
   * @param 
   *        The 
   * @return 
   *        The boolean value that determines if this Location has a store
   */
  public boolean hasStore(){
    return (store1 == null);
  }
  /**
   * This method calculates and updates the distance traveled by the player and returns the new value of the distance traveled
   * @param x 
   *        The int value used to increment the distance traveled by the player
   * @return
   *        The new value of the distance traveled
   */
  public int getCurrentDistanceTraveled(int x){
    Location.distanceTraveled += x;
    return Location.distanceTraveled;
  }
  /**
   * This method creates or sets a description of this Location
   * @param desc
   *        The description of this Location object
   */
  public void setDesc(String desc){
    this.description = desc;
  }
  /**
   * This method returns the description for this Location object
   * @return
   *        The description of this Location object
   */
  public String getDesc(){
    return description;
  }
}
