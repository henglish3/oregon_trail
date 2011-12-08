package edu.gatech.cs2340.shlat.models;
import java.io.*;
/**
 * This class will specify and update the date as the player progresses throughout the game
 * @author S.H.L.A.T.
 * @version 1.0 11/08/2011
 */
public class Date implements Serializable {
  private String month;
  private String[] months = {null, "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
  private int day, monthInt;
  private int year = 2011;//If we should decide to use the Oregon Trail theme, then the year will be set to 1848
  /**
   * This constructor creates a Date object with the month, day, and year fields
   * @param month
   *      The month the player chooses to start the game
   */
  public Date(String month){
    this.month = month;
    this.day = 1;
    
    for (int i = 1; i <= 12; i++) {
      if (month.equalsIgnoreCase(months[i])) {
        monthInt = i;
        break;
      }
    }
  }
  /**
   * This method returns the current month during the gameplay
   * @return month
   *      The current month during the gameplay
   */
  public String getMonth(){
    return month;
  }
  /**
   * This method changes this Date object's month 
   * @param month
   *      The new month during the gameplay
   */
  public void setMonth(String month){
    this.month = month;
  }
  /**
   * This method updates the current month of this Date object
   */
  public void updateMonth(){
    if (month.equalsIgnoreCase(months[12])) {
      monthInt = 1;
      setMonth(months[monthInt]);
      updateYear();
    }
    else {
      monthInt++;
      setMonth(months[monthInt]);
    }
  }
  /**
   * This method returns the current day of the month
   * @return day The current day of the month during the gameplay
   */
  public int getDay(){
    return day;
  }
  /**
   * This method changes this Date object's current day
   * @param day
   *      The new day of the month during the gameplay
   */
  public void setDay(int day){
    this.day = day;
  }
  /**
   * This method updates the current day of this Date object
   */
  public void updateDay(){
    if (month.equalsIgnoreCase("February")) { // Handles special cases in February
      if (year % 4 == 0) {
        if (day == 29) { // Handles leap year scenario
          setDay(1);
          updateMonth();
        }
      }
      else if (day == 28){ // Handles last day of February
        setDay(1);
        updateMonth();
      }
      else {
        day++;
      }
    }
    else if (((monthInt <= 7) && (monthInt % 2 == 1)) || ((monthInt >= 8) && (monthInt % 2 == 0))) { // Handles odd-numbered months in the range 1 - 7 (inclusive) and even numbered months in the range 8 - 12 (inclusive)
      if (day == 31) {
        setDay(1);
        updateMonth();
      }
      else {
        day++;
      }
    }
    else if (((monthInt <= 7) && (monthInt % 2 == 0)) || ((monthInt >= 8) && (monthInt % 2 == 1))) { // Handles even-numbered months in the range 1 - 7 (inclusive) and odd numbered months in the range 8 - 12 (inclusive)
      if (day == 30) {
        setDay(1);
        updateMonth();
      }
      else {
        day++;
      }

    }
  }
  /**
   * This method returns this Date object's current month
   * @return month 
   *      The current month during the gameplay
   */
  public int getYear(){
    return year;
  }
  /**
   * This method sets a new year for this Date object
   * @param year The new year for this Date object
   */
  public void setYear(int year){
    this.year = year;
  }
  /**
   * This method updates the current month for this Date object
   */
  public void updateYear(){
    year++;
  }
  /**
   * This method returns a string representation of this Date object
   */
  public String toString(){
    return getMonth() + " " + getDay() + ", " + getYear();
  }   
}
