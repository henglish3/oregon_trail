package edu.gatech.cs2340.shlat.models;
/**
 * This class represents a weather condition during the gameplay
 * @author S.H.L.A.T.
 * @version 1.0 11/10/2011
 */

public enum Weather {
  SUNNY(0),
  WINDY(1), 
  SNOWING(0),
  RAINY(3);

  private int condition;
  private String weatherLabel;

  /**
   * This constructor creates a weather object with a specified weather condition
   * 
   */
  Weather(int condition){
    this.condition = condition;
    switch (condition) {
      case 0:
        weatherLabel = "SUNNY";
        break;
      case 1:
        weatherLabel = "WINDY";
        break;
      case 2:
        weatherLabel = "SNOWING";
        break;
      case 3:
        weatherLabel = "RAINY";
        break;
    }
  }
  /**
   * This method returns the int condition value
   *
   * @return The condition value of the weather
   */
  public int getCondition(){
    return condition;
  }
  /**
   * This method sets a new int condition value to this weather object
   * 
   * @param condition The new int value of the condition of this Weather object
   */
  public void setCondition(int condition){
    this.condition = condition;
    
  }
  /**
   * This method returns the String representation of this Weather object
   * 
   * @return The String representation of this Weather object
   */
  public String toString(){
    return weatherLabel;
  }
  /**
   * This method changes the String representation of this Weather object
   * 
   * @param weather condition value used to set the the weather label field
   */
  public void setWeatherLabel(Weather weather){
    switch (weather) {
      case SUNNY:
        weatherLabel = "SUNNY";
        break;
      case WINDY:
        weatherLabel = "WINDY";
        break;
      case SNOWING:
        weatherLabel = "SNOWING";
        break;
      case RAINY:
        weatherLabel = "RAINY";
        break;
    }
  }
}

  