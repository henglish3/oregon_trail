package edu.gatech.cs2340.shlat.views;

import java.awt.geom.Line2D;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;


/**
 * @author Harrison English
 * MapPanel class
 * Creates the map.
 *

 */

public class MapPanel extends JPanel implements Runnable {
    

    private BufferedImage mapBG;
    private int coordX = -445;
    private int coordY= -630;
    private int distance;

	/**
	* Constructor places the map in the panel
	*
	*/
    MapPanel() {      
    	try {
			mapBG = ImageIO.read(new File("img/map.jpg"));
		} catch (IOException e) {
			System.out.println("FAIL");
		}

    }
    public void setDist(int distance) {
    	this.distance = distance;
    }
    public void moveMap() {
    	if(distance == 110) {	
    		coordX = -340;
    		coordY = -500;
        }
    }
   // Redraw screen every 15ms
    public void run() {
           	try {
           	    while (true) {
           	    	moveMap();
           	        repaint();     	            	            	 
           	        // Fixes performance problem
           	        Thread.sleep(15);
           	    }
           	} catch (InterruptedException e) {
           		// Ignore, just redraw next time
           	}
    }
	
    /**
    * Draws map
    *
    * @param g graphics component
    */
    @Override public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(mapBG, coordX, coordY, null);
    }
}
