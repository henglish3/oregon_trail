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

public class ItemList {
  static final String ID = "id";
  static final String NAME = "name";
  static final String DESC = "desc";
}
