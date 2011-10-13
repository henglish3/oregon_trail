package edu.gatech.cs2340.shlat.views;

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.lang.Math;


public class StoreInterface implements ActionListener {

    private JFrame frame;

    //GUI Elements - text fields to enter purchase amounts
    private JTextField wantItem1;
    private JTextField wantItem2;
    private JTextField wantItem3;
    private JTextField wantItem4;
    private JTextField wantItem5;
    private JTextField wantItem6;
    private JTextField wantItem7;
    private JTextField wantItem8;
    private JTextField wantItem9;
    private JTextField wantItem10;
    
    //GUI elements - labels
    private JLabel itemHave1;
    private JLabel itemHave2;
    private JLabel itemHave3;
    private JLabel itemHave4;
    private JLabel itemHave5;
    private JLabel itemHave6;
    private JLabel itemHave7;
    private JLabel itemHave8;
    private JLabel itemHave9;
    private JLabel itemHave10;
        
    private JLabel numItem1;
    private JLabel numItem2;
    private JLabel numItem3;
    private JLabel numItem4;
    private JLabel numItem5;
    private JLabel numItem6;
    private JLabel numItem7;
    private JLabel numItem8;
    private JLabel numItem9;
    private JLabel numItem10;
    
    private JLabel itemDes1;
    private JLabel itemDes2;
    private JLabel itemDes3;
    private JLabel itemDes4;
    private JLabel itemDes5;
    private JLabel itemDes6;
    private JLabel itemDes7;
    private JLabel itemDes8;
    private JLabel itemDes9;
    private JLabel itemDes10;
        
    private JLabel itemWeight1;
    private JLabel itemWeight2;
    private JLabel itemWeight3;
    private JLabel itemWeight4;
    private JLabel itemWeight5;
    private JLabel itemWeight6;
    private JLabel itemWeight7;
    private JLabel itemWeight8;
    private JLabel itemWeight9;
    private JLabel itemWeight10;

    private JLabel unitCost1;
    private JLabel unitCost2;
    private JLabel unitCost3;
    private JLabel unitCost4;
    private JLabel unitCost5;
    private JLabel unitCost6;
    private JLabel unitCost7;
    private JLabel unitCost8;
    private JLabel unitCost9;
    private JLabel unitCost10;
        
    private JLabel cost1;
    private JLabel cost2;
    private JLabel cost3;
    private JLabel cost4;
    private JLabel cost5;
    private JLabel cost6;
    private JLabel cost7;
    private JLabel cost8;
    private JLabel cost9;
    private JLabel cost10;
    
    private JLabel lblCurrentMoney;
    private JLabel lblTotalCost;
    private JLabel lblWeight;
    
    //Instance variables to hold store data
    private String[] storeMax;
    private String[] itemDes;
    private String[] itemHave;
    private String[] unitCost;
    private int[] unitCostI;
    private String[] itemTotalCost;
    private String[] itemWeight;
    private String currentMoney = "14000";
    private String totalCost = "0";
    private String currentWeight = "1000";
    
    /**
     * Set visibility of the window
     * 
     * @param visibility The boolean value that determines if the frame is visible or not
     */
    public void setVisibility(boolean visibility) {
        frame.setVisible(visibility);
    }
    
    /**
     * sets the amount of items the store has
     * 
     * @param max amount the stores has
     * @param itemID the item number 
     */
    public void setStoreMax(int max, int itemID){
    	storeMax[itemID] = ""+max;	
        switch(itemID) {
    	    case 0:
    	        numItem1.setText(storeMax[itemID]);
    	        break;
    	    case 1:
    	        numItem2.setText(storeMax[itemID]);
    	        break;
    	    case 2:
    	        numItem3.setText(storeMax[itemID]);
    	        break;
    	    case 3:
    	        numItem4.setText(storeMax[itemID]);
    	        break;
    	    case 4:
    	        numItem5.setText(storeMax[itemID]);
    	        break;
    	    case 5:
    	        numItem6.setText(storeMax[itemID]);
    	        break;
    	    case 6:
    	        numItem7.setText(storeMax[itemID]);
    	        break;
    	    case 7:
    	        numItem8.setText(storeMax[itemID]);
    	        break;
    	    case 8:
    	        numItem9.setText(storeMax[itemID]);
    	        break;
    	    case 9:
    	        numItem10.setText(storeMax[itemID]);
    	        break;
    	}
    }
    /**
     * Sets the amount of items you currently have
     * 
     * @param items number of items in inventory
     * @param itemID the item Number for now 1-10
     */
    public void setItemsHave(int items, int itemID){
    	itemHave[itemID] = ""+items;
  	    switch(itemID) {
    	    case 0:
    	        itemHave1.setText(itemHave[itemID]);
    	        break;
    	    case 1:
    	        itemHave2.setText(itemHave[itemID]);
    	        break;
    	    case 2:
    	        itemHave3.setText(itemHave[itemID]);
    	        break;
    	    case 3:
    	        itemHave4.setText(itemHave[itemID]);
    	        break;
    	    case 4:
    	        itemHave5.setText(itemHave[itemID]);
    	        break;
    	    case 5:
    	        itemHave6.setText(itemHave[itemID]);
    	        break;
    	    case 6:
    	        itemHave7.setText(itemHave[itemID]);
    	        break;
    	    case 7:
    	        itemHave8.setText(itemHave[itemID]);
    	        break;
    	    case 8:
    	        itemHave9.setText(itemHave[itemID]);
    	        break;
    	    case 9:
    	        itemHave10.setText(itemHave[itemID]);
    	        break;
    	}
    }
    /**
     * Sets the name of the item or description
     * 
     * @param itemName Name or Description of item
     * @param itemID the item Number for now 1-10
     */
    public void setItemDes(String itemName, int itemID){
    	itemDes[itemID] = itemName;
    	switch(itemID) {
    	    case 0:
    	        itemDes1.setText(itemDes[itemID]);
    	        break;
    	    case 1:
    	        itemDes2.setText(itemDes[itemID]);
    	        break;
    	    case 2:
    	        itemDes3.setText(itemDes[itemID]);
    	        break;
    	    case 3:
    	        itemDes4.setText(itemDes[itemID]);
    	        break;
    	    case 4:
    	        itemDes5.setText(itemDes[itemID]);
    	        break;
    	    case 5:
    	        itemDes6.setText(itemDes[itemID]);
    	        break;
    	    case 6:
    	        itemDes7.setText(itemDes[itemID]);
    	        break;
    	    case 7:
    	        itemDes8.setText(itemDes[itemID]);
    	        break;
    	    case 8:
    	        itemDes9.setText(itemDes[itemID]);
    	        break;
    	    case 9:
    	        itemDes10.setText(itemDes[itemID]);
    	        break;
    	}
    }
    /**
     * Sets the cost per unit
     * 
     * @param cost amount item cost per unit
     * @param itemID the item Number for now 1-10
     */
    public void setUnitCost(int cost, int itemID){
        unitCostI[itemID] = cost;
    	unitCost[itemID] = ""+cost;
        switch(itemID) {
    	    case 0:
    	        unitCost1.setText(unitCost[itemID]);
    	        break;
    	    case 1:
    	        unitCost2.setText(unitCost[itemID]);
    	        break;
    	    case 2:
    	        unitCost3.setText(unitCost[itemID]);
    	        break;
    	    case 3:
    	        unitCost4.setText(unitCost[itemID]);
    	        break;
    	    case 4:
    	        unitCost5.setText(unitCost[itemID]);
    	        break;
    	    case 5:
    	        unitCost6.setText(unitCost[itemID]);
    	        break;
    	    case 6:
    	        unitCost7.setText(unitCost[itemID]);
    	        break;
    	    case 7:
    	        unitCost8.setText(unitCost[itemID]);
    	        break;
    	    case 8:
    	        unitCost9.setText(unitCost[itemID]);
    	        break;
    	    case 9:
    	        unitCost10.setText(unitCost[itemID]);
    	        break;
    	}
    }
    /**
     *  Sets the total Cost for the one type of item
     *  
     * @param cost total cost for one type
     * @param itemID id for the item
     */
    public void setItemCost(int cost, int itemID){
    	itemTotalCost[itemID] = ""+cost;
        switch(itemID) {
    	    case 0:
    	        cost1.setText(itemTotalCost[itemID]);
    	        break;
    	    case 1:
    	        cost2.setText(itemTotalCost[itemID]);
    	        break;
    	    case 2:
    	        cost3.setText(itemTotalCost[itemID]);
    	        break;
    	    case 3:
    	        cost4.setText(itemTotalCost[itemID]);
    	        break;
    	    case 4:
    	        cost5.setText(itemTotalCost[itemID]);
    	        break;
    	    case 5:
    	        cost6.setText(itemTotalCost[itemID]);
    	        break;
    	    case 6:
    	        cost7.setText(itemTotalCost[itemID]);
    	        break;
    	    case 7:
    	        cost8.setText(itemTotalCost[itemID]);
    	        break;
    	    case 8:
    	        cost9.setText(itemTotalCost[itemID]);
    	        break;
    	    case 9:
    	        cost10.setText(itemTotalCost[itemID]);
    	        break;
    	}
    }
    /**
     * Sets the item Weight
     * 
     * @param weight number value for weight
     * @param itemID id for the item
     */
    public void setItemWeight(int weight, int itemID){
    	itemWeight[itemID] = ""+weight;
        switch(itemID) {
    	    case 0:
    	        itemWeight1.setText(itemWeight[itemID]);
    	        break;
    	    case 1:
    	        itemWeight2.setText(itemWeight[itemID]);
    	        break;
    	    case 2:
    	        itemWeight3.setText(itemWeight[itemID]);
    	        break;
    	    case 3:
    	        itemWeight4.setText(itemWeight[itemID]);
    	        break;
    	    case 4:
    	        itemWeight5.setText(itemWeight[itemID]);
    	        break;
    	    case 5:
    	        itemWeight6.setText(itemWeight[itemID]);
    	        break;
    	    case 6:
    	        itemWeight7.setText(itemWeight[itemID]);
    	        break;
    	    case 7:
    	        itemWeight8.setText(itemWeight[itemID]);
    	        break;
    	    case 8:
    	        itemWeight9.setText(itemWeight[itemID]);
    	        break;
    	    case 9:
    	        itemWeight10.setText(itemWeight[itemID]);
    	        break;
    	}
    }
    /**
     * Set the CurrentMoney label
     * 
     * @param money amount of money you have in your inventory
     */
     public void setCurrentMoney(int money) {
     	currentMoney = "" + money;
        lblCurrentMoney.setText(currentMoney);
     }
     /**
      * Sets the current weight of the wagon
      * 
      * @param weight current weight
      */
     public void setCurrentWeight(int weight) {
      	currentWeight = "" + weight;
        lblWeight.setText(currentWeight);
      }
     /**
      * Set the CurrentMoney label
      * 
      * @param amount of the total cost
      */
     public void setTotalCost(int amount) {
        totalCost = ""+amount;
        lblTotalCost.setText(totalCost);
      }
      
      /**
       *Get number of each item wanted
       *
       *@param itemId number of the item you would like to get.
       */
      public int getNumWant(int itemId) {
          JTextField itemField;
          int result = 0;
          switch(itemId) {
              case 0:
                  itemField = wantItem1;
                  break;
              case 1:
                  itemField = wantItem2;
                  break;
              case 2:
                  itemField = wantItem3;
                  break;
              case 3:
                  itemField = wantItem4;
                  break;
              case 4:
                  itemField = wantItem5;
                  break;
              case 5:
                  itemField = wantItem6;
                  break;
              case 6:
                  itemField = wantItem7;
                  break;
              case 7:
                  itemField = wantItem8;
                  break;
              case 8:
                  itemField = wantItem9;
                  break;
              case 9:
                  itemField = wantItem10;
                  break;
              default:
                  return 0;
          }
          
          try {
                result = Integer.parseInt(itemField.getText());
          } catch(Exception e) {
                result = 0;
          }
          
          return Math.max(0, result);
      }
      
    /**
     *Clears user input from the view
     */
    public void clearInput() {
        wantItem1.setText("");
        wantItem2.setText("");
        wantItem3.setText("");
        wantItem4.setText("");
        wantItem5.setText("");
        wantItem6.setText("");
        wantItem7.setText("");
        wantItem8.setText("");
        wantItem9.setText("");
        wantItem10.setText("");
        
        setTotalCost(0);
    }
      
    /**
     * Update the total transaction cost when text fields are modified
     * 
     * @param e The action caught
     */
    public void actionPerformed(ActionEvent e) { 
        //Check each text field and calculate total cost
        int runningTotalCost = 0;
        for(int i = 0; i < 10; i++)
            runningTotalCost += (getNumWant(i) * unitCostI[i]);

        setTotalCost(runningTotalCost);
    }
     
    /**
     * Create the application.
     * 
     * @param al The ActionListener object that connects to the view of the store interface
     */
    public StoreInterface(ActionListener al) {
        //Temporary
        storeMax = new String[10];
        itemDes = new String[10];
        itemHave = new String[10];
        unitCost = new String[10];
        itemTotalCost = new String[10];
        itemWeight = new String[10];
        unitCostI = new int[10];
        
        for(int i = 0; i < 10; i++) {
            storeMax[i] = itemDes[i] = itemHave[i] = unitCost[i] = itemTotalCost[i] = itemWeight[i] = "";
            unitCostI[i] = 0;
        }
        
        //Initialize view
        initialize(al);
    }
    
    /**
     * Updates values stored in GUI labels
     */
    private void updateLabels()
    {
        JLabel itemHave1 = new JLabel(itemHave[0]);
        JLabel itemHave2 = new JLabel(itemHave[1]);
        JLabel itemHave3 = new JLabel(itemHave[2]);
        JLabel itemHave4 = new JLabel(itemHave[3]);
        JLabel itemHave5 = new JLabel(itemHave[4]);
        JLabel itemHave6 = new JLabel(itemHave[5]);
        JLabel itemHave7 = new JLabel(itemHave[6]);
        JLabel itemHave8 = new JLabel(itemHave[7]);
        JLabel itemHave9 = new JLabel(itemHave[8]);
        JLabel itemHave10 = new JLabel(itemHave[9]);
        
        JLabel numItem1 = new JLabel(storeMax[0]);
        JLabel numItem2 = new JLabel(storeMax[1]);
        JLabel numItem3 = new JLabel(storeMax[2]);
        JLabel numItem4 = new JLabel(storeMax[3]);
        JLabel numItem5 = new JLabel(storeMax[4]);
        JLabel numItem6 = new JLabel(storeMax[5]);
        JLabel numItem7 = new JLabel(storeMax[6]);
        JLabel numItem8 = new JLabel(storeMax[7]);
        JLabel numItem9 = new JLabel(storeMax[8]);
        JLabel numItem10 = new JLabel(storeMax[9]);
    }

    /**
     * Initialize the contents of the frame.
     * 
     * @param al The ActionListener object that connects to the frame of the Store interface
     */
    private void initialize(ActionListener al) {
        frame = new JFrame();
        frame.setBounds(100, 100, 580, 471);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lblInventory = new JLabel("You");
        lblInventory.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblStoreInv = new JLabel("Max");
        lblStoreInv.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblBuy = new JLabel("Buy");
        lblBuy.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblItemDescription = new JLabel("Item");
        lblItemDescription.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblItemWeight = new JLabel("Weight");
        lblItemWeight.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblUnitCost = new JLabel("Unit Cost");
        lblUnitCost.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblCost = new JLabel("Cost");
        lblCost.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        
        /*for(int i =0; i<=numItems; i++){
        	//itemHave[i] = new JLabel("0");
        	storeMax[i] = new JLabel("10");
        	wantItem[i] = new JTextField();
            wantItem[i].setColumns(10);
            itemDes[i] = new JLabel("Lorem ipsum dolor sit amet");
            unitCost[i] = new JLabel("4.95");
        	
        }*/
        
        //JLabel[] itemHave = new JLabel[1];
        //itemHave[0] = new JLabel("0");
        itemHave1 = new JLabel(itemHave[0]);
        itemHave2 = new JLabel(itemHave[1]);
        itemHave3 = new JLabel(itemHave[2]);
        itemHave4 = new JLabel(itemHave[3]);
        itemHave5 = new JLabel(itemHave[4]);
        itemHave6 = new JLabel(itemHave[5]);
        itemHave7 = new JLabel(itemHave[6]);
        itemHave8 = new JLabel(itemHave[7]);
        itemHave9 = new JLabel(itemHave[8]);
        itemHave10 = new JLabel(itemHave[9]);
        
        numItem1 = new JLabel(storeMax[0]);
        numItem2 = new JLabel(storeMax[1]);
        numItem3 = new JLabel(storeMax[2]);
        numItem4 = new JLabel(storeMax[3]);
        numItem5 = new JLabel(storeMax[4]);
        numItem6 = new JLabel(storeMax[5]);
        numItem7 = new JLabel(storeMax[6]);
        numItem8 = new JLabel(storeMax[7]);
        numItem9 = new JLabel(storeMax[8]);
        numItem10 = new JLabel(storeMax[9]);
        
        wantItem1 = new JTextField();
        wantItem2 = new JTextField();
        wantItem3 = new JTextField();
        wantItem4 = new JTextField();
        wantItem5 = new JTextField();
        wantItem6 = new JTextField();
        wantItem7 = new JTextField();
        wantItem8 = new JTextField();
        wantItem9 = new JTextField();
        wantItem10 = new JTextField();
        wantItem1.addActionListener(this);
        wantItem2.addActionListener(this);
        wantItem3.addActionListener(this);
        wantItem4.addActionListener(this);
        wantItem5.addActionListener(this);
        wantItem6.addActionListener(this);
        wantItem7.addActionListener(this);
        wantItem8.addActionListener(this);
        wantItem9.addActionListener(this);
        wantItem10.addActionListener(this);
        
        itemDes1 = new JLabel(itemDes[0]);
        itemDes2 = new JLabel(itemDes[1]);
        itemDes3 = new JLabel(itemDes[2]);
        itemDes4 = new JLabel(itemDes[3]);
        itemDes5 = new JLabel(itemDes[4]);
        itemDes6 = new JLabel(itemDes[5]);
        itemDes7 = new JLabel(itemDes[6]);
        itemDes8 = new JLabel(itemDes[7]);
        itemDes9 = new JLabel(itemDes[8]);
        itemDes10 = new JLabel(itemDes[9]);
        
        itemWeight1 = new JLabel(itemWeight[0]);
        itemWeight2 = new JLabel(itemWeight[1]);
        itemWeight3 = new JLabel(itemWeight[2]);
        itemWeight4 = new JLabel(itemWeight[3]);
        itemWeight5 = new JLabel(itemWeight[4]);
        itemWeight6 = new JLabel(itemWeight[5]);
        itemWeight7 = new JLabel(itemWeight[6]);
        itemWeight8 = new JLabel(itemWeight[7]);
        itemWeight9 = new JLabel(itemWeight[8]);
        itemWeight10 = new JLabel(itemWeight[9]);
        
        unitCost1 = new JLabel(unitCost[0]);
        unitCost2 = new JLabel(unitCost[1]);
        unitCost3 = new JLabel(unitCost[2]);
        unitCost4 = new JLabel(unitCost[3]);
        unitCost5 = new JLabel(unitCost[4]);
        unitCost6 = new JLabel(unitCost[5]);
        unitCost7 = new JLabel(unitCost[6]);
        unitCost8 = new JLabel(unitCost[7]);
        unitCost9 = new JLabel(unitCost[8]);
        unitCost10 = new JLabel(unitCost[9]);
        
        cost1 = new JLabel(itemTotalCost[0]);
        cost2 = new JLabel(itemTotalCost[1]);
        cost3 = new JLabel(itemTotalCost[2]);
        cost4 = new JLabel(itemTotalCost[3]);
        cost5 = new JLabel(itemTotalCost[4]);
        cost6 = new JLabel(itemTotalCost[5]);
        cost7 = new JLabel(itemTotalCost[6]);
        cost8 = new JLabel(itemTotalCost[7]);
        cost9 = new JLabel(itemTotalCost[8]);
        cost10 = new JLabel(itemTotalCost[9]);
        
        JLabel titleCurrentMoney = new JLabel("You Have $");
        
        lblCurrentMoney = new JLabel(currentMoney);
        
        JLabel titleTotalCost = new JLabel("Total Cost $");
        
        lblTotalCost = new JLabel(totalCost);
        
        JButton btnPurchase = new JButton("Purchase");
        btnPurchase.setActionCommand("siPurchase");
        btnPurchase.addActionListener(al);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setActionCommand("siCancel");
        btnCancel.addActionListener(al);
        
        lblWeight = new JLabel(currentWeight);
        
        JLabel titleTotalWeight = new JLabel("Total Weight");
      
        
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(25)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblInventory)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(6)
        							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(itemHave1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(itemHave2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(itemHave3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(itemHave4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(itemHave5, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(itemHave6, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(itemHave7, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(itemHave8, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(itemHave9, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(itemHave10, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))))
        					.addGap(18)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblStoreInv, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(6)
        							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(numItem2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(numItem1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(numItem3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(numItem4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(numItem5, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(numItem6, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(numItem7, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(numItem8, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(numItem9, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
        								.addComponent(numItem10, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))))
        					.addGap(18)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(lblBuy, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(wantItem1)
        						.addComponent(wantItem2)
        						.addComponent(wantItem3)
        						.addComponent(wantItem4)
        						.addComponent(wantItem5)
        						.addComponent(wantItem6)
        						.addComponent(wantItem7)
        						.addComponent(wantItem8)
        						.addComponent(wantItem9)
        						.addComponent(wantItem10))
        					.addGap(18)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(lblItemDescription, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(itemDes1)
        						.addComponent(itemDes2)
        						.addComponent(itemDes3)
        						.addComponent(itemDes4)
        						.addComponent(itemDes5)
        						.addComponent(itemDes6)
        						.addComponent(itemDes7)
        						.addComponent(itemDes8)
        						.addComponent(itemDes9)
        						.addComponent(itemDes10))
        					.addGap(18)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(lblItemWeight, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(itemWeight1)
        						.addComponent(itemWeight2)
        						.addComponent(itemWeight3)
        						.addComponent(itemWeight4)
        						.addComponent(itemWeight5)
        						.addComponent(itemWeight6)
        						.addComponent(itemWeight7)
        						.addComponent(itemWeight8)
        						.addComponent(itemWeight9)
        						.addComponent(itemWeight10))
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(18)
        							.addComponent(lblUnitCost))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(41)
        							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(unitCost1)
        								.addComponent(unitCost2)
        								.addComponent(unitCost3)
        								.addComponent(unitCost4)
        								.addComponent(unitCost5)
        								.addComponent(unitCost6)
        								.addComponent(unitCost7)
        								.addComponent(unitCost8)
        								.addComponent(unitCost9)
        								.addComponent(unitCost10))))
        					.addGap(18)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(lblCost, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(cost1)
        						.addComponent(cost2)
        						.addComponent(cost3)
        						.addComponent(cost4)
        						.addComponent(cost5)
        						.addComponent(cost6)
        						.addComponent(cost7)
        						.addComponent(cost8)
        						.addComponent(cost9)
        						.addComponent(cost10)))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(173)
        					.addComponent(btnPurchase)
        					.addGap(64)
        					.addComponent(btnCancel)))
        			.addContainerGap(28, Short.MAX_VALUE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(16)
        			.addComponent(titleTotalWeight)
        			.addGap(18)
        			.addComponent(lblWeight)
        			.addGap(69)
        			.addComponent(titleCurrentMoney)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(lblCurrentMoney)
        			.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
        			.addComponent(titleTotalCost)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(lblTotalCost, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addGap(46))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(12)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblInventory)
        				.addComponent(lblStoreInv, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblBuy)
        				.addComponent(lblItemDescription)
        				.addComponent(lblItemWeight)
        				.addComponent(lblUnitCost)
        				.addComponent(lblCost))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(wantItem1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(itemDes1)
        				.addComponent(cost1)
        				.addComponent(unitCost1)
        				.addComponent(itemHave1)
        				.addComponent(numItem1)
        				.addComponent(itemWeight1))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(wantItem2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(itemDes2)
        				.addComponent(cost2)
        				.addComponent(unitCost2)
        				.addComponent(itemHave2)
        				.addComponent(numItem2)
        				.addComponent(itemWeight2))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(wantItem3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(itemDes3)
        				.addComponent(cost3)
        				.addComponent(unitCost3)
        				.addComponent(itemHave3)
        				.addComponent(numItem3)
        				.addComponent(itemWeight3))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(wantItem4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(itemDes4)
        				.addComponent(cost4)
        				.addComponent(unitCost4)
        				.addComponent(itemHave4)
        				.addComponent(numItem4)
        				.addComponent(itemWeight4))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(wantItem5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(itemDes5)
        				.addComponent(cost5)
        				.addComponent(unitCost5)
        				.addComponent(itemHave5)
        				.addComponent(numItem5)
        				.addComponent(itemWeight5))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(wantItem6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(itemDes6)
        				.addComponent(cost6)
        				.addComponent(unitCost6)
        				.addComponent(itemHave6)
        				.addComponent(numItem6)
        				.addComponent(itemWeight6))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(wantItem7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(itemDes7)
        				.addComponent(cost7)
        				.addComponent(unitCost7)
        				.addComponent(itemHave7)
        				.addComponent(numItem7)
        				.addComponent(itemWeight7))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(wantItem8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(itemDes8)
        				.addComponent(cost8)
        				.addComponent(unitCost8)
        				.addComponent(itemHave8)
        				.addComponent(numItem8)
        				.addComponent(itemWeight8))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(wantItem9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(itemDes9)
        				.addComponent(cost9)
        				.addComponent(unitCost9)
        				.addComponent(itemHave9)
        				.addComponent(numItem9)
        				.addComponent(itemWeight9))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(wantItem10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(itemDes10)
        				.addComponent(cost10)
        				.addComponent(unitCost10)
        				.addComponent(itemHave10)
        				.addComponent(numItem10)
        				.addComponent(itemWeight10))
        			.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(titleTotalCost)
        				.addComponent(lblTotalCost)
        				.addComponent(lblWeight)
        				.addComponent(titleTotalWeight)
        				.addComponent(titleCurrentMoney)
        				.addComponent(lblCurrentMoney))
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnPurchase)
        				.addComponent(btnCancel))
        			.addContainerGap())
        );
        frame.getContentPane().setLayout(groupLayout);      

        
    }
}
