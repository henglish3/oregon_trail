package edu.gatech.cs2340.shlat.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JButton.*;
import javax.swing.JToolBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePlayInterface {

    private JFrame frame;
    private String date = "date";
    private String distTravel = "dist Traveled";
    private String remainFood = "food remain";
    private String currLoc = "current location";
    private String nextLoc= "next location";
    private String lEvent= "last event";
    private ImageIcon weatherIcon;
    private JRadioButton rdbtnNorm;
    private JRadioButton rdbtnSlow;
    private JRadioButton rdbtnFast;
    private JRadioButton rdbtnStarved;
    private JRadioButton rdbtnEnough;
    private JRadioButton rdbtnFilling;
    private JLabel lblOutofRations;
    private JLabel lblDate;
    private JLabel lblRemainingFood;
    private JLabel lblDistTravel;
    private JLabel currentLocation;
    private JLabel nextLocation;
    private JLabel lastEvent;
    private MapPanel panel;

    /**
    *set visibility of the window
    */
    public void setVisibility(boolean visibility) {
    	frame.setVisible(visibility);
    }
    /**
     * Create the application.
     */
    public GamePlayInterface(ActionListener al) {
        initialize(al);
    }
    /**
     * Sets the text in the alert label
     *
     * @param message A string to put in the label
     */
    public void setAlertLabel(String message) {
        lblOutofRations.setText(message);
    }
    /**
    * sets the rations radio button
    *
    *@param rations int to select correct ration button i.e.
    * 1 for starved
    * 2 for enough
    * 3 for filling
    */
    public void setRations(int rations) {
        switch(rations) {
            case 1:
                rdbtnStarved.setSelected(true);
                break;
            case 2:
                rdbtnEnough.setSelected(true);
                break;
            case 3:
                rdbtnFilling.setSelected(true);
                break;
        }
    }
    /**
     * sets the rations radio button
     *
     *@param pace int to select correct ration button i.e.
     * 1 for slow
     * 2 for norm
     * 3 for fast
     */
     public void setPace(int pace) {
         switch(pace) {
             case 1:
                 rdbtnSlow.setSelected(true);
                 break;
             case 2:
                 rdbtnNorm.setSelected(true);
                 break;
             case 3:
                 rdbtnFast.setSelected(true);
                 break;
         }
     }
    /**
    * returns the rations amount based on which radio button is pressed i.e.
    * 1 for barebones
    * 2 for enough
    * 3 for filling
    *
    */
    public int getRations() {
    	if(rdbtnStarved.isSelected()){
    		return 1;
    	}
    	else if(rdbtnEnough.isSelected()){
    		return 2;
    	}
    	else {
    		return 3;
    	}
    }
    /**
     * returns the pace amount based on which radio button is pressed i.e.
     * 1 for slow
     * 2 for norm
     * 3 for fast
     *
     */
     public int getPace() {
     	if(rdbtnSlow.isSelected()){
     		return 1;
     	}
     	else if(rdbtnNorm.isSelected()){
     		return 2;
     	}
     	else {
     		return 3;
     	}
     }
    /**
    * Sets the displayed date
    *
    *@param date string to display as date
    */
    public void setDate(String date) {
        this.date = date;
        lblDate.setText(date);
    }
    /**
     * Sets the current location
     *
     *@param location string to display as current location
     */
     public void setCurrLocation(String location) {
         currLoc = location;
         currentLocation.setText(currLoc);
     }
     /**
      * Sets the next location
      *
      *@param location string to display as next location
      */
      public void setNextLocation(String location) {
          nextLoc = location;
          nextLocation.setText(nextLoc);
      }
      /**
       * Sets the last event
       *
       *@param event string to display as last event
       */
       public void setLastEvent(String event) {
           lEvent = event;
           lastEvent.setText(lEvent);
       }
    /**
     * Sets the distance traveled
     *
     *@param dist string to display as distance traveled
     */
     public void setDistTravel(int dist) {
        distTravel = "" + dist + " miles";
        lblDistTravel.setText(distTravel);
        panel.setDist(dist);
     }
     /**
      * Sets the distance traveled
      *
      *@param amount string to display as food remaining
      */
      public void setFoodRemaining(String amount) {
          remainFood = amount;
          lblRemainingFood.setText(remainFood);
      }
    /*
    * Sets the event boolean to stop the animation
    *
    * @param  event boolean to stop animation
    */
    public void setEvent(boolean event) {
    	//panel.setEvent(event);
    }
    /**
    * Sets the imageicon for the weather
    *
    * @param img image to set the imageicon to
    */
    public void setWeatherIcon(ImageIcon img) {
    	weatherIcon = img;
    }
    /**
     * Initialize the contents of the frame.
     */
    private void initialize(ActionListener al) {
        frame = new JFrame();
        frame.setBounds(100, 100, 749, 484);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JToolBar toolBar = new JToolBar();
        
        JButton btnMenu = new JButton("Menu");
        btnMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        toolBar.add(btnMenu);
        
        JPopupMenu popupMenu = new JPopupMenu();
        addPopup(btnMenu, popupMenu);
        
        JButton btnNew = new JButton("New");
        btnNew.setActionCommand("mgiNew");
        btnNew.addActionListener(al);
        popupMenu.add(btnNew);
        
        JButton btnLoad = new JButton("Load");
        btnLoad.setActionCommand("mgiLoad");
        btnLoad.addActionListener(al);
        popupMenu.add(btnLoad);
        
        JButton btnSave = new JButton("Save");
        btnSave.setActionCommand("mgiSave");
        btnSave.addActionListener(al);
        popupMenu.add(btnSave);
        
        JButton btnQuit = new JButton("Quit");
        btnQuit.setActionCommand("mgiQuit");
        btnQuit.addActionListener(al);
        popupMenu.add(btnQuit);
        
        toolBar.setFloatable(false);
        
        JLabel lblPace = new JLabel("Pace");
        lblPace.setHorizontalAlignment(SwingConstants.CENTER);
        lblPace.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        rdbtnNorm = new JRadioButton("Normal");
        rdbtnNorm.setHorizontalAlignment(SwingConstants.LEFT);
        rdbtnNorm.setSelected(true);
        rdbtnNorm.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        
        rdbtnSlow = new JRadioButton("Slow");
        rdbtnSlow.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        rdbtnSlow.setHorizontalAlignment(SwingConstants.LEFT);
        
        rdbtnFast = new JRadioButton("Ludicrous ");
        rdbtnFast.setHorizontalAlignment(SwingConstants.LEFT);
        rdbtnFast.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        
        ButtonGroup paceGroup = new ButtonGroup();
            paceGroup.add(rdbtnNorm);
            paceGroup.add(rdbtnSlow);
            paceGroup.add(rdbtnFast);

        JLabel lblRations = new JLabel("Rations");
        lblRations.setHorizontalAlignment(SwingConstants.CENTER);
        lblRations.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        rdbtnStarved = new JRadioButton("Famished");
        rdbtnStarved.setHorizontalAlignment(SwingConstants.LEFT);
        rdbtnStarved.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        
        rdbtnEnough = new JRadioButton("Enough");
        rdbtnEnough.setSelected(true);
        rdbtnEnough.setHorizontalAlignment(SwingConstants.LEFT);
        rdbtnEnough.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        
        rdbtnFilling = new JRadioButton("Gluttonous");
        rdbtnFilling.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        rdbtnFilling.setHorizontalAlignment(SwingConstants.LEFT);
        
        ButtonGroup rationGroup = new ButtonGroup();
            rationGroup.add(rdbtnStarved);
            rationGroup.add(rdbtnEnough);
            rationGroup.add(rdbtnFilling);       

        panel = new MapPanel();
        panel.setBackground(Color.white);
        panel.setEvent(false);
        Thread mpThread = new Thread(panel);
        mpThread.start();

        JLabel lblWeather = new JLabel("Weather");
        lblWeather.setHorizontalAlignment(SwingConstants.CENTER);
        
    	weatherIcon = new ImageIcon("img/sunny.jpg");
        
        JLabel lblWeatherImg = new JLabel("");
        lblWeatherImg.setIcon(weatherIcon);
        
        lblDate = new JLabel(date);
        lblDate.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        
        JButton btnGo = new JButton("GO");
        btnGo.setActionCommand("makeMove");
        btnGo.addActionListener(al);
        
        JButton btnMap = new JButton("Map");
        
        JButton btnStop = new JButton("Rest");
        
        JButton btnInventory = new JButton("Inventory");
        
        JButton btnStatus = new JButton("Status");
        btnStatus.setActionCommand("mgiShowStatus");
        btnStatus.addActionListener(al);
        
        JLabel lblDistanceTraveled = new JLabel("Distance Traveled");
        lblDistanceTraveled.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        
        lblDistTravel = new JLabel(distTravel);
        lblDistTravel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        
        JLabel lblFoodRemaining = new JLabel("Food Remaining");
        lblFoodRemaining.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        
        lblRemainingFood = new JLabel(remainFood);
        lblRemainingFood.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        
        lblOutofRations = new JLabel("You have NO RATIONS!");
        lblOutofRations.setFont(new Font("Lucida Grande", Font.BOLD, 13));
        lblOutofRations.setForeground(Color.RED);
        
        JLabel lblCurrentLocation = new JLabel("Current Location");
        lblCurrentLocation.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        
        currentLocation = new JLabel(currLoc);
        currentLocation.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        
        JLabel lblNextLocation = new JLabel("Next Location");
        lblNextLocation.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        
        nextLocation = new JLabel(nextLoc);
        nextLocation.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        
        JLabel lblLastEvent = new JLabel("Last Event");
        lblLastEvent.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        
        lastEvent = new JLabel(lEvent);
        lastEvent.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addGroup(groupLayout.createSequentialGroup()
        									.addPreferredGap(ComponentPlacement.UNRELATED, 30, Short.MAX_VALUE)
        									.addComponent(lblDate)
        									.addGap(81))
        								.addGroup(groupLayout.createSequentialGroup()
        									.addGap(27)
        									.addComponent(lblDistTravel, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
        								.addGroup(groupLayout.createSequentialGroup()
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        										.addComponent(lblFoodRemaining, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
        										.addComponent(lblDistanceTraveled))))
        							.addGroup(groupLayout.createSequentialGroup()
        								.addGap(26)
        								.addComponent(lblRemainingFood, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(18)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblWeather)
        								.addComponent(lblWeatherImg, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))))))
        			.addContainerGap(7, Short.MAX_VALUE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(38)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(rdbtnSlow)
        								.addComponent(lblPace)
        								.addComponent(rdbtnNorm, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblRations)
        								.addComponent(rdbtnStarved)
        								.addComponent(rdbtnEnough)))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(lblOutofRations)
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGap(39)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(currentLocation)
        						.addComponent(lblNextLocation)
        						.addComponent(lblCurrentLocation)
        						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(nextLocation)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lastEvent)
        								.addComponent(lblLastEvent)))))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(rdbtnFast)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(rdbtnFilling)))
        			.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(btnStop, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnGo, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnInventory, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnStatus, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnMap, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
        			.addGap(62))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(lblWeather)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lblWeatherImg, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lblDate)
        					.addGap(12)
        					.addComponent(lblDistanceTraveled)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lblDistTravel)
        					.addGap(18)
        					.addComponent(lblFoodRemaining, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lblRemainingFood, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(lblPace)
        								.addComponent(lblRations)))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(18)
        							.addComponent(lblCurrentLocation)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(rdbtnSlow, GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
        								.addComponent(rdbtnStarved))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(rdbtnNorm)
        								.addComponent(rdbtnEnough))
        							.addGap(12)
        							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(rdbtnFast)
        								.addComponent(rdbtnFilling)))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(currentLocation)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(lblNextLocation)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(nextLocation)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(lblLastEvent)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblOutofRations)
        						.addComponent(lastEvent))
        					.addGap(22))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(24)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnStatus)
        						.addComponent(btnGo))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnMap)
        						.addComponent(btnStop))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnInventory)))
        			.addContainerGap())
        );
        frame.getContentPane().setLayout(groupLayout);
    }

    private static void addPopup(Component component, final JPopupMenu popup) {
        component.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    showMenu(e);
                }
            }
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    showMenu(e);
                }
            }
            private void showMenu(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });
    }
}
