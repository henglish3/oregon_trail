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
    	if(distance >= 111 && coordXMap < -340 && coordYMap < -500 ) {	
    		coordXMap ++;
    		coordYMap ++;
    		coordX++;
    		coordY++;
    	}
    }
    public void setEvent(boolean event) {
    	this.event = event;
    }
    /**
    * Moves the the wagon round and round and round
    * to set locations
    */
    public void findWagon() {
    	if(distance == 0)
    		moveWagon(570, 240);
    	else if(distance == 5)
    		moveWagon(560, 205);
    	else if(distance == 10)
    		moveWagon(550, 170);
    	else if(distance == 15)
    		moveWagon(520, 130);
        else if(distance == 20)
    		moveWagon(490,90);    	
    	else if(distance == 25)
    		moveWagon(440, 105);	
        else if(distance == 30) 
            moveWagon(390,120);
    	else if(distance == 35)
    		moveWagon(360, 120);
    	else if(distance ==40)
            moveWagon(330,120);
     	else if(distance == 45)
    		moveWagon(313, 120);
        else if(distance == 50) 
            moveWagon(295,120);	
        else if(distance ==55) 
            moveWagon(290,120);
        else if(distance == 60)
    		moveWagon(290, 115);
        else if(distance == 65)
            moveWagon(287,125);
        else if(distance == 70)
    		moveWagon(285, 127);
        else if(distance == 75)
            moveWagon(283,130);
    	else if(distance == 80)
    		moveWagon(281, 135);
        else if(distance ==85) 
            moveWagon(280,140);
    	else if(distance == 90)
    		moveWagon(280, 142);
        else if(distance ==95) 
            moveWagon(280,145);
    	else if(distance == 100)
    		moveWagon(280, 170);
        else if(distance == 110) 
            moveWagon(170,22);
    	else if(distance == 115)
    		moveWagon(226, 62);
        else if(distance == 120) 
            moveWagon(282,101);
    	else if(distance == 125)
    		moveWagon(284, 83);
         else if(distance == 130) 
            moveWagon(287,67);
    	else if(distance == 135)
    		moveWagon(290, 51);
        else if(distance == 140) 
    		moveWagon(292, 35);
    }
    public void moveWagon(int x, int y) {
        if(coordX < x)
        	coordX += 2;
        else if(coordX > x)
        	coordX -=2;
        if(coordY < y)
        	coordY+=2;
        else if(coordY > y)
        	coordY-=2;
    }
   // Redraw screen every 15ms
    public void run() {
           	try {
           	    while (true) {
           	        findWagon();
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
