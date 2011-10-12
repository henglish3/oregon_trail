package edu.gatech.cs2340.shlat.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;


public class InventoryInterface {

    private JFrame frame;


    private String[] itemDes;
    private String[] itemHave;
    private String[] itemWeight;
    private String currentMoney = "14000";
    private String currentWeight = "1000";

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    InventoryInterface window = new InventoryInterface();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
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
     * Create the application.
     */
    public InventoryInterface() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 349, 365);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lblInventory = new JLabel("Amount");
        lblInventory.setFont(new Font("Lucida Grande", Font.BOLD, 16));

        
        JLabel lblItemDescription = new JLabel("Item");
        lblItemDescription.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblItemWeight = new JLabel("Weight");
        lblItemWeight.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        
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
        
        
        JLabel titleCurrentMoney = new JLabel("You Have $");
        
        JLabel lblCurrentMoney = new JLabel(currentMoney);
        
        JButton btnDone = new JButton("Done");
        //btnPurchase.setActionCommand("nsciDone");
        //btnPurchase.addActionListener(gameController);
        
        JLabel lblWeight = new JLabel(currentWeight);
        
        JLabel titleTotalWeight = new JLabel("Total Weight");
      
        
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
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
        			.addGap(34)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
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
        					.addComponent(itemWeight9))
        				.addComponent(itemWeight10))
        			.addContainerGap(60, Short.MAX_VALUE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(15)
        			.addComponent(titleTotalWeight)
        			.addGap(18)
        			.addComponent(lblWeight)
        			.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
        			.addComponent(titleCurrentMoney)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(lblCurrentMoney)
        			.addGap(35))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(125)
        			.addComponent(btnDone)
        			.addContainerGap(147, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(12)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblInventory)
        						.addComponent(lblItemDescription))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(itemDes1)
        						.addComponent(itemHave1))
        					.addGap(5)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(itemDes2)
        						.addComponent(itemHave2))
        					.addGap(5)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(itemDes3)
        						.addComponent(itemHave3)))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(lblItemWeight)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(itemWeight1)
        					.addGap(5)
        					.addComponent(itemWeight2)
        					.addGap(5)
        					.addComponent(itemWeight3)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(itemDes4)
        				.addComponent(itemHave4)
        				.addComponent(itemWeight4))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(itemDes5)
        				.addComponent(itemHave5)
        				.addComponent(itemWeight5))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(itemDes6)
        				.addComponent(itemHave6)
        				.addComponent(itemWeight6))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(itemDes7)
        				.addComponent(itemHave7)
        				.addComponent(itemWeight7))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(itemDes8)
        				.addComponent(itemHave8)
        				.addComponent(itemWeight8))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(itemDes9)
        				.addComponent(itemHave9)
        				.addComponent(itemWeight9))
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(itemDes10)
        				.addComponent(itemHave10)
        				.addComponent(itemWeight10))
        			.addGap(27)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblWeight)
        				.addComponent(titleTotalWeight)
        				.addComponent(titleCurrentMoney)
        				.addComponent(lblCurrentMoney))
        			.addGap(18)
        			.addComponent(btnDone)
        			.addContainerGap(116, Short.MAX_VALUE))
        );
        frame.getContentPane().setLayout(groupLayout);      

        
    }
}