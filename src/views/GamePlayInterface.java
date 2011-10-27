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
    private ImageIcon weatherIcon;
    private JRadioButton rdbtnNorm;
    private JRadioButton rdbtnSlow;
    private JRadioButton rdbtnFast;
    private JRadioButton rdbtnStarved;
    private JRadioButton rdbtnEnough;
    private JRadioButton rdbtnFilling;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GamePlayInterface window = new GamePlayInterface();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public GamePlayInterface() {
        initialize();
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
    }
    /**
     * Sets the distance traveled
     *
     *@param dist string to display as distance traveled
     */
     public void setDistTravel(String dist) {
         distTravel = dist;
     }
     /**
      * Sets the distance traveled
      *
      *@param amount string to display as food remaining
      */
      public void setfoodRemainingl(String amount) {
          remainFood = amount;
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
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 752, 495);
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
        popupMenu.add(btnNew);
        
        JButton btnLoad = new JButton("Load");
        popupMenu.add(btnLoad);
        
        JButton btnSave = new JButton("Save");
        popupMenu.add(btnSave);
        
        JButton btnQuit = new JButton("Quit");
        popupMenu.add(btnQuit);
        
        JLabel lblPace = new JLabel("Pace");
        lblPace.setHorizontalAlignment(SwingConstants.CENTER);
        lblPace.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        
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
        lblRations.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        
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

        JPanel panel = new JPanel();
        
        JLabel lblWeather = new JLabel("Weather");
        lblWeather.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel lblWeatherImg = new JLabel("");
        lblWeatherImg.setIcon(weatherIcon);
        
        JLabel lblDate = new JLabel(date);
        lblDate.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        
        JButton btnGo = new JButton("GO");
        
        JButton btnMap = new JButton("Map");
        
        JButton btnStop = new JButton("Stop");
        
        JButton btnJournal = new JButton("Journal");
        
        JButton btnInventory = new JButton("Inventory");
        
        JButton btnStatus = new JButton("Status");
        
        JTextPane textPane = new JTextPane();
        
        JLabel lblDistanceTraveled = new JLabel("Distance Traveled");
        lblDistanceTraveled.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        
        JLabel lblDistTravel = new JLabel(distTravel);
        lblDistTravel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        
        JLabel lblFoodRemaining = new JLabel("Food Remaining");
        lblFoodRemaining.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        
        JLabel label = new JLabel(remainFood);
        label.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        
        JLabel lblOutofRations = new JLabel("You have NO RATIONS!");
        lblOutofRations.setFont(new Font("Lucida Grande", Font.BOLD, 13));
        lblOutofRations.setForeground(Color.RED);
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(38)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(rdbtnFast)
        						.addComponent(rdbtnSlow)
        						.addComponent(lblPace)
        						.addComponent(rdbtnNorm, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblOutofRations)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(rdbtnStarved)
        								.addComponent(rdbtnFilling)
        								.addComponent(rdbtnEnough)
        								.addComponent(lblRations))
        							.addGap(18)
        							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(btnInventory, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnGo, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnStop, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
        					.addGap(6)
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(btnStatus, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        							.addComponent(btnMap, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        							.addComponent(btnJournal, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(Alignment.TRAILING, groupLayout.createParallelGroup(Alignment.LEADING)
        							.addComponent(lblFoodRemaining, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblDistanceTraveled)
        							.addGroup(groupLayout.createSequentialGroup()
        								.addGap(27)
        								.addComponent(label, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
        							.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        								.addComponent(lblDistTravel, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
        								.addGap(23)))
        						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        							.addComponent(lblWeatherImg, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
        							.addGap(18))
        						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        							.addComponent(lblDate)
        							.addGap(53))
        						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        							.addComponent(lblWeather)
        							.addGap(44)))))
        			.addGap(3))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
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
        					.addComponent(label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblPace)
        						.addComponent(lblRations))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnStatus)
        						.addComponent(btnGo)
        						.addComponent(rdbtnSlow, GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
        						.addComponent(rdbtnStarved))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(rdbtnNorm)
        								.addComponent(rdbtnEnough))
        							.addGap(12))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(btnStop)
        								.addComponent(btnMap))
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnInventory)
        						.addComponent(btnJournal)
        						.addComponent(rdbtnFilling)
        						.addComponent(rdbtnFast)))
        				.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblOutofRations))
        );
        frame.getContentPane().setLayout(groupLayout);
    }

    private static void addPopup(Component component, final JPopupMenu popup) {
        component.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showMenu(e);
                }
            }
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showMenu(e);
                }
            }
            private void showMenu(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });
    }
}
