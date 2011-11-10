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
    private int coordXMap = -445;
    private int coordYMap= -630;
    private int coordX = 570;
    private int coordY = 240;
    private int distance;
    private int movement;
    private boolean debug = false;
    private boolean event;

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
    public void setDist(int dist) {
    	movement = dist - distance;
    	distance = dist;
    }
    public void moveMap() {
    	if(distance >= 111 && coordXMap < -340 && coordYMap < -500) {	
    		coordXMap ++;
    		coordYMap ++;
    		coordX =277;
    		coordY =145;
    	}
    }
    public void setEvent(boolean event) {
    	this.event = event;
    }
    /**
    * Moves the the wagon round and round and round
    * to set locations
    */
    public void moveWagon() {
    	if(distance == 10) { 
    		if(coordX > 550)	
    		    coordX -=2;
    		if(coordY > 170) 
    		    coordY -=2;
        }
        else if(distance == 20) {
    		if(coordX > 490)	
    		    coordX -=2;
    		if(coordY > 90) 
    		    coordY -=2;
        }
        else if(distance == 30) {
            if(coordX > 390)	
    		    coordX -=2;
    		if(coordY < 120) 
    		    coordY +=2;
    	}
    	else if(distance ==40) {
    		if(coordX > 330)
    			coordX -=2;
    		if(coordY < 120)
    			coordY +=2;
        }
        else if(distance == 50) {
    		if(coordX > 295)
    			coordX -=2;
    		if(coordY < 120)
    			coordY +=2;
        }
        else if(distance ==55) {
            if(coordX > 290)	
    		    coordX -=2;
    		if(coordY < 120) 
    		    coordY +=2;
        }
         else if(distance == 65) {
            if(coordX > 287)	
    		    coordX -=2;
    		if(coordY < 125) 
    		    coordY +=2;
        } 
        else if(distance == 75) {
            if(coordX > 283)	
    		    coordX -=2;
    		if(coordY < 130) 
    		    coordY +=2;
        }
        else if(distance ==85) {
            if(coordX > 280)	
    		    coordX -=2;
    		if(coordY < 140) 
    		    coordY +=2;
        }
        else if(distance ==95) {
            if(coordX > 280)	
    		    coordX -=2;
    		if(coordY < 145) 
    		    coordY +=2;
        }
        else if(distance == 110) {
    		if(coordX > 170)//277)
    			coordX -=2;
    		if(coordY < 22)//145)
    			coordY += 2;        
        }
        else if(distance == 120) {
            if(coordX < 282)	
    		    coordX +=2;
    		if(coordY > 101) 
    		    coordY -=2;
        }
         else if(distance == 130) {
            if(coordX < 287)	
    		    coordX +=2;
    		if(coordY > 67) 
    		    coordY -=2;
        }    
        else if(distance == 140) {
    		if(coordY > 35) {
    			coordY -= 2;
            }
    		if(coordX < 292)
    			coordX +=2;
        }

    }
   // Redraw screen every 15ms
    public void run() {
           	try {
           	    while (true) {
           	        moveWagon();
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
        g.drawImage(mapBG, coordXMap, coordYMap, null);
        g.setColor(Color.BLUE);
        g.fillOval(coordX, coordY, 20, 20);
        g.setColor(Color.YELLOW);
        //debugging grid
        if(debug) {
        for(int i = 0; i <595; i+=20)
        		g.drawLine(i,0,i,332);
        for(int i = 0; i <332; i+=20)
        	    g.drawLine(0,i,595,i);
        }
    }
}
