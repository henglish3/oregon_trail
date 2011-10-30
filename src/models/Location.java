package edu.gatech.cs2340.shlat.models;
/**
 * This class represents a Location object with a String name, an int distance, 
 * @author S.H.L.A.T.
 *
 */
public class Location {
  private String name;
  private String landmark;
  private String description;
  private int distanceTraveled;//Keeps track of how many miles the player has traveled
  private int landmarkDistance;//Keeps track of how many miles to the next landmark
  
  public Location() {
    name = null;
    landmark = null;
    description = null;
    landmarkDistance = 0;
  }

  /**
   * This constructor creates a Location object
   * @param name 
   *        The name of this Location object
   * @param landmark
   *        The name of the next traveling point
   */
  public Location (String name, String landmark){
    this.name = name;
    this.landmark = landmark;
    distanceTraveled = 0;
    landmarkDistance = 100;//Feel free to change this value
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
  public Location(String name, String landmark, int distance){
    this(name, landmark);
    distanceTraveled = distance;
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
  public Location(String name, String landmark, int distance, int land){ 
    this(name, landmark, distance);
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
    return distanceTraveled;
  }
  /**
   * This method sets a new distance for this object
   * @param distance 
   *        The new distance traveled by this object
   */
  public void setDistance(int distance){
    this.distanceTraveled = distance;
  }
  /**
   * This method returns the distance to the next landmark
   * @return
   *        The distance to the next landmark
   */
  public int getLandmarkDistance(){
    return landmarkDistance;
  }
  /**
   * This method sets a new distance to the next landmark
   * @param landmarkDistance
   *        The new distance value to the next landmark
   */
  public void setLandmarkDistance(int landmarkDistance){
    this.landmarkDistance = landmarkDistance;
  }
  
  public void setLandmarkDistance(String landmarkDistance){
    this.landmarkDistance = Integer.parseInt(landmarkDistance);
  }
 /**
   * This method returns the distance traveled
   * @return
   *        The new value of the distance traveled
   */
  public int getCurrentDistanceTraveled(){
    return distanceTraveled;
  }
  /**
   * This method increases the distance traveled
   * @param x
   *        The int value used to increment the distance traveled by the player
   */
  public void travelDistance(int x) {
    distanceTraveled += x;
  }
  /**
   * This method calculates and updates the distance to the next landmark and returns this new value
   * @param x
   *        The distance to the next landmark
   * @return
   *        The new value of the distance to the next landmark
   */
  public int getCurrentLandmarkDistance(int x){
    if (!((landmarkDistance - x) < 0))
      landmarkDistance -= x;
    else
      landmarkDistance = 0;
    return landmarkDistance;
  }
  
  public void setDesc(String desc) {
    this.description = desc;
  }

  public String getDesc() {
    return description;
  }
}
