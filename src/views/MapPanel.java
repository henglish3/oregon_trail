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

public class MapPanel extends JPanel {
    

    private BufferedImage mapBG;
    
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


	
    /**
    * Draws map
    *
    * @param g graphics component
    */
    @Override public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(mapBG, 0, 0, null);
    }
}
