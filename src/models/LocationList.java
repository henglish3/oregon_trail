/**
 * Class that parses a list of locations and turns them into location objects
 *
 * @author SHLAT
 * @version 0.1 10/30/11
 */

package edu.gatech.cs2340.shlat.models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import edu.gatech.cs2340.shlat.models.Location;

public class LocationList {
  static final String LOCATION = "location";
  static final String NAME = "name";
  static final String LANDMARK = "landmark";
  static final String DESC = "desc";
  static final String DISTANCE = "distance";
  static final String STORE = "store";
  static final String RIVER = "river";
  static final String END = "end";

  /**
   * This method takes a String location of an xml file and parses it into location objects and stores it in a List
   *
   * @param xmlFile The file to be parsed.
   *
   * @return A list of Location objects.
   */
  public List<Location> readFile(String xmlFile) {
    List<Location> locations = new ArrayList<Location>();
    try {
      XMLInputFactory inputFactory = XMLInputFactory.newInstance();

      InputStream in = new FileInputStream(xmlFile);
      XMLEventReader eventReader = inputFactory.createXMLEventReader(in);

      // Create a null location
      Location location = null;

      while (eventReader.hasNext()) {
        XMLEvent event = eventReader.nextEvent();

        if (event.isStartElement()) {
          StartElement startElement = event.asStartElement();
          
          // If the XML element is an location create a new location
          if (startElement.getName().getLocalPart() == (LOCATION)) {
            location = new Location(); 
          }

          // If the first element is the start element and it's the name then set the name
          if (event.isStartElement()) {
            if (event.asStartElement().getName().getLocalPart().equals(NAME)) {
              event = eventReader.nextEvent();
              location.setName(event.asCharacters().getData());
              continue;
            }
          }

          // If it is the name then set the location landmark
          if (event.asStartElement().getName().getLocalPart().equals(LANDMARK)) {
            event = eventReader.nextEvent();
            location.setLandmark(event.asCharacters().getData());
            continue;
          }
          
          // If it is the description then set the location description
          if (event.asStartElement().getName().getLocalPart().equals(DESC)) {
            event = eventReader.nextEvent();
            location.setDesc(event.asCharacters().getData());
            continue;
          }

          // If it is the distance then set the location distance
          if (event.asStartElement().getName().getLocalPart().equals(DISTANCE)) {
            event = eventReader.nextEvent();
            location.setLandmarkDistance(event.asCharacters().getData());
            continue;
          }
          
          // If it is a store then set store to true
          if (event.asStartElement().getName().getLocalPart().equals(STORE)) {
            event = eventReader.nextEvent();
            location.setStore(event.asCharacters().getData());
            continue;
          } 

          // If it is a store then set store to true
          if (event.asStartElement().getName().getLocalPart().equals(RIVER)) {
            event = eventReader.nextEvent();
            location.setRiver(event.asCharacters().getData());
            continue;
          } 

          // If it is the last location then set end to true
          if (event.asStartElement().getName().getLocalPart().equals(END)) {
            event = eventReader.nextEvent();
            location.setEnd(event.asCharacters().getData());
            continue;
          } 

       }
        
        // If this is the closing tag for the location then add the location to the list
        if (event.isEndElement()) {
          EndElement endElement = event.asEndElement();
          if (endElement.getName().getLocalPart() == (LOCATION)) {
            locations.add(location);
          }
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (XMLStreamException e) {
      e.printStackTrace();
    }
    return locations;
  }
}
