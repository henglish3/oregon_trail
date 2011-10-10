/**
 * Class that parses a list of items and turns them into item objects
 *
 * @author SHLAT
 * @version 0.1 10/08/11
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

import edu.gatech.cs2340.shlat.models.Item;

public class ItemList {
  static final String ITEM = "item";
  static final String ID = "id";
  static final String NAME = "name";
  static final String DESC = "desc";

  public List<Item> readConfig(String configFile) {
    List<Item> items = new ArrayList<Item>();
    try {
      XMLInputFactory inputFactory = XMLInputFactory.newInstance();

      InputStream in = new FileInputStream(configFile);
      XMLEventReader eventReader = inputFactory.createXMLEventReader(in);

      Item item = null;

      while (eventReader.hasNext()) {
        XMLEvent event = eventReader.nextEvent();

        if (event.isStartElement()) {
          StartElement startElement = event.asStartElement();

          if (startElement.getName().getLocalPart() == (ITEM)) {
            item = new Item(); 
          }

          if (event.isStartElement()) {
            if (event.asStartElement().getName().getLocalPart().equals(ID)) {
              event = eventReader.nextEvent();
              item.setId(event.asCharacters().getData());
              continue;
            }
          }

          if (event.asStartElement().getName().getLocalPart().equals(NAME)) {
            event = eventReader.nextEvent();
            item.setName(event.asCharacters().getData());
            continue;
          }
          
          if (event.asStartElement().getName().getLocalPart().equals(DESC)) {
            event = eventReader.nextEvent();
            item.setDesc(event.asCharacters().getData());
            continue;
          }
        }

        if (event.isEndElement()) {
          EndElement endElement = event.asEndElement();
          if (endElement.getName().getLocalPart() == (ITEM)) {
            items.add(item);
          }
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (XMLStreamException e) {
      e.printStackTrace();
    }
    return items;
  }
}
