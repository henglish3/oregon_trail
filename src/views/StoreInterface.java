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


public class StoreInterface {

    private JFrame frame;

   
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
    private String[] storeMax;
    private String[] itemDes;
    private String[] itemHave;
    private String[] unitCost;
    private String[] itemTotalCost;
    private String[] itemWeight;
    private String currentMoney = "14000";
    private String totalCost = "0";
    private String currentWeight = "1000";
    
    /**
     *Set visibility of the window
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
    }
    /**
     * Sets the amount of items you currently have
     * 
     * @param items number of items in inventory
     * @param itemID the item Number for now 1-10
     */
    public void setItemsHave(int items, int itemID){
    	itemHave[itemID] = ""+items;
  	  
    }
    /**
     * Sets the name of the item or description
     * 
     * @param itemName Name or Description of item
     * @param itemID the item Number for now 1-10
     */
    public void setItemDes(String itemName, int itemID){
    	itemDes[itemID] = itemName;
    }
    /**
     * Sets the cost per unit
     * 
     * @param cost amount item cost per unit
     * @param itemID the item Number for now 1-10
     */
    public void setUnitCost(int cost, int itemID){
    	unitCost[itemID] = ""+cost;
    }
    /**
     *  Sets the total Cost for the one type of item
     *  
     * @param cost total cost for one type
     * @param itemID id for the item
     */
    public void setCost(int cost, int itemID){
    	itemTotalCost[itemID] = ""+cost;
    }
    /**
     * Sets the item Weight
     * 
     * @param weight number value for weight
     * @param itemID id for the item
     */
    public void setItemWeight(int weight, int itemID){
    	itemWeight[itemID] = ""+weight;
    }
    /**
     * Set the CurrentMoney label
     * 
     * @param money amount of money you have in your inventory
     */
     public void setCurrentMoney(int money) {
     	currentMoney = "" + money;
     }
     /**
      * Sets the current weight of the wagon
      * 
      * @param weight current weight
      */
     public void setCurrentWeight(int weight) {
      	currentWeight = "" + weight;
      }
     /**
      * Set the CurrentMoney label
      * 
      * @param amount of the total cost
      */
      public void setTotalCost(int amount) {
      	totalCost = ""+amount;
      }
      /**
       *Get number of each item wanted
       *
       *@param itemId number of the item you would like to get.
       */
      public int getNumWant(int itemId) {
          JTextField itemField;
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
          
          return Integer.parseInt(itemField.getText());
      }
     
    /**
     * Create the application.
     */
    public StoreInterface(ActionListener al) {
        //Temporary
        storeMax = new String[10];
        itemDes = new String[10];
        itemHave = new String[10];
        unitCost = new String[10];
        itemTotalCost = new String[10];
        itemWeight = new String[10];
        
        for(int i = 0; i < 10; i++) {
            storeMax[i] = itemDes[i] = itemHave[i] = unitCost[i] = itemTotalCost[i] = itemWeight[i] = "";
        }
        
        //Initialize view
        initialize(al);
    }

    /**
     * Initialize the contents of the frame.
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
        
        JLabel itemDes1 = new JLabel(itemDes[0]);
        JLabel itemDes2 = new JLabel(itemDes[1]);
        JLabel itemDes3 = new JLabel(itemDes[2]);
        JLabel itemDes4 = new JLabel(itemDes[3]);
        JLabel itemDes5 = new JLabel(itemDes[4]);
        JLabel itemDes6 = new JLabel(itemDes[5]);
        JLabel itemDes7 = new JLabel(itemDes[6]);
        JLabel itemDes8 = new JLabel(itemDes[7]);
        JLabel itemDes9 = new JLabel(itemDes[8]);
        JLabel itemDes10 = new JLabel(itemDes[9]);
        
        JLabel itemWeight1 = new JLabel(itemWeight[0]);
        JLabel itemWeight2 = new JLabel(itemWeight[1]);
        JLabel itemWeight3 = new JLabel(itemWeight[2]);
        JLabel itemWeight4 = new JLabel(itemWeight[3]);
        JLabel itemWeight5 = new JLabel(itemWeight[4]);
        JLabel itemWeight6 = new JLabel(itemWeight[5]);
        JLabel itemWeight7 = new JLabel(itemWeight[6]);
        JLabel itemWeight8 = new JLabel(itemWeight[7]);
        JLabel itemWeight9 = new JLabel(itemWeight[8]);
        JLabel itemWeight10 = new JLabel(itemWeight[9]);
        
        JLabel unitCost1 = new JLabel(unitCost[0]);
        JLabel unitCost2 = new JLabel(unitCost[1]);
        JLabel unitCost3 = new JLabel(unitCost[2]);
        JLabel unitCost4 = new JLabel(unitCost[3]);
        JLabel unitCost5 = new JLabel(unitCost[4]);
        JLabel unitCost6 = new JLabel(unitCost[5]);
        JLabel unitCost7 = new JLabel(unitCost[6]);
        JLabel unitCost8 = new JLabel(unitCost[7]);
        JLabel unitCost9 = new JLabel(unitCost[8]);
        JLabel unitCost10 = new JLabel(unitCost[9]);
        
        JLabel cost1 = new JLabel(itemTotalCost[0]);
        JLabel cost2 = new JLabel(itemTotalCost[1]);
        JLabel cost3 = new JLabel(itemTotalCost[2]);
        JLabel cost4 = new JLabel(itemTotalCost[3]);
        JLabel cost5 = new JLabel(itemTotalCost[4]);
        JLabel cost6 = new JLabel(itemTotalCost[5]);
        JLabel cost7 = new JLabel(itemTotalCost[6]);
        JLabel cost8 = new JLabel(itemTotalCost[7]);
        JLabel cost9 = new JLabel(itemTotalCost[8]);
        JLabel cost10 = new JLabel(itemTotalCost[9]);
        
        JLabel titleCurrentMoney = new JLabel("You Have $");
        
        JLabel lblCurrentMoney = new JLabel(currentMoney);
        
        JLabel titleTotalCost = new JLabel("Total Cost $");
        
        JLabel lblTotalCost = new JLabel(totalCost);
        
        JButton btnPurchase = new JButton("Purchase");
        //btnPurchase.setActionCommand("nsciPurchase");
        //btnPurchase.addActionListener(storeController);
        
        JButton btnCancel = new JButton("Cancel");
        //btnCancel.setActionCommand("nsciCancel");
        //btnCancel.addActionListener(storeController);
        
        JLabel lblWeight = new JLabel(currentWeight);
        
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
