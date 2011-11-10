package edu.gatech.cs2340.shlat.models;

import edu.gatech.cs2340.shlat.models.Store;

/**
 * This class represents a Location object with a String name, an int distance, 
 * @author S.H.L.A.T.
 *
 */
public class Location {
  private String name;
  private boolean store;
  private boolean river;
  private String landmark;
  private String description;
  private int landmarkDistance;
  private static int distanceTraveled;//Keeps track of how many miles the player has traveled
  private boolean end;
  /**
   * This method creates a default Location object
   */
  public Location(){
    name = null;
    store = false;
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
  public Location (String name, String landmark, boolean store){
    this.name = name;
    this.landmark = landmark;
    this.store = store;
    distanceTraveled = 0;
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
  public Location(String name, String landmark, int distance, boolean store){
    this(name, landmark, store);
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
  public Location(String name, String landmark, int distance, int land, boolean store){ 
    this(name, landmark, distance, store);
    landmarkDistance = land;
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
   * This method returns the landmark distance
   * @return
   *        The landmark distance to the next destination
   */
  public int getLandmarkDistance(){
    return landmarkDistance;
  }
  /**
   * This method sets a new landmark distance
   * @param landmarkDistance
   *        The new value for the landmark distance to the next destination
   */
  public void setLandmarkDistance(int landmarkDistance){
    this.landmarkDistance = landmarkDistance;
  }
  /**
   * This method takes in a String and parses it as this Location's landmark Distance
   * @param landmarkDistance
   *        The String representation of the new landmark distance
   */
  public void setLandmarkDistance(String landmarkDistance){
    this.landmarkDistance = Integer.parseInt(landmarkDistance);
  }
  /**
   * This method calculates and updates the distance to the next landmark and returns this new value
   * @param x
   *        The distance to the next landmark
   * @return
   *        The new value of the distance to the next landmark
   */
  public int getCurrentLandmarkDistance(int x){
    if(!((landmarkDistance - x) < 0))
      landmarkDistance -= x;
    else
      landmarkDistance = 0;
    return landmarkDistance;
  }
  /** This method increases the distance traveled
   * @param x
   *         The int value used to increment the distance traveled by the player
   */
  public void travelDistance(int x) {
    Location.distanceTraveled += x;
  }

  /**
   * This method reads and interprets a string as a boolean to determine whether or not the location is a store.
   * 
   * @param bool a string boolean in the form of 'True' for true or anything else for false.
   */
  public void setStore(String bool) {
    this.store = Boolean.valueOf(bool);
  }
  
  /**
   * This method determines if this location object has a store
   * @return 
   *        The boolean value that determines if this Location has a store
   */
  public boolean hasStore(){
    return store;
  }
  /**
   * This method returns the distance traveled
   * @return
   *        The value of the distance traveled
   */
  public int getCurrentDistanceTraveled(){
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

  /**
   * This method sets whether or not each location is the end location for the game.
   *
   * @param end A string boolean to be interpreted as a boolean primitive.
   */
  public void setEnd(String end) {
    this.end = Boolean.valueOf(end);
  }

  /**
   * This method returns a boolean for each location saying whether or not it is the last location.
   */
  public boolean getEnd() {
    return end;
  }

  public void setRiver(String river) {
    this.river = Boolean.valueOf(river);
  }

  public boolean getRiver() {
    return river;
  }
}
