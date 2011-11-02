/**
 * Class that represents the map.
 * 
 * @author S.H.L.A.T.
 * @version 0.5 10/28/11
 */
package edu.gatech.cs2340.shlat.models;

import java.util.*;

public class Map {
    
    private List<Location> locations;
    private String file = "locations.xml";

    /**
     * Constructor that instantiates the ArrayList for Location.
     */
    public Map() {
        LocationList list = new LocationList();
        List<Location> readFile = list.readFile(file);
        locations = new ArrayList();
        for (Location location : readFile) {
          locations.add(location);
        }
    } //ends Map constructor.
    
    /**
     * Method that gets the ArrayList that holds all locations.
     * 
     * @return All the locations.
     */
    public List<Location> getAllLocations() {
            return locations;
    } //ends getAllLocations method.
    
    /**
     * Method that adds locations to the locations ArrayList.
     * 
     * @param location The location to be added.
     */
    public void addLocation(Location location) {
        locations.add(location);
    } //ends addLocation method.
    
    /**
     * Method that gets the a location based on a distance.
     * It returns null if there is no landmark location at that distance.
     * 
     * @param distanceCheck The distance to check for a location.
     * @return the location.
     */
    public Location getLocation(int distanceCheck){
        for(int i = 0; i < locations.size(); i++) {
            if(distanceCheck == locations.get(i).getLandmarkDistance()) {
                return locations.get(i);
            }
        }
        return null;
    } //ends getCurrentLocation method.
    
    /**
     * Method that gets the current location the player is on.
     * It returns null if the player is not on a landmark location.
     * 
     * @param distanceTraveled The distance the player has traveled.
     * @return the location the player is currently at.
     */
    public Location getCurrentLocation(int distanceTraveled){
        for(int i = 0; i < locations.size(); i++) {
            if(distanceTraveled == locations.get(i).getLandmarkDistance()) {
                return locations.get(i);
            }
        }
        return null;
    } //ends getCurrentLocation method.
} //ends Map class.
