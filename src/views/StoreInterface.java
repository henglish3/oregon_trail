package edu.gatech.cs2340.shlat.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.List;
import java.awt.Choice;
import javax.swing.JTextField;
import javax.swing.JButton;

public class StoreInterface {

    private JFrame frame;
    private JTextField wantItem1;
    private JTextField wantItem2;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StoreInterface window = new StoreInterface();
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
    public StoreInterface() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 727, 471);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        
        JLabel lblInventory = new JLabel("You");
        
        JLabel lblStoreInv = new JLabel("Max");
        
        JLabel lblBuy = new JLabel("Buy");
        
        wantItem1 = new JTextField();
        wantItem1.setColumns(10);
        
        wantItem2 = new JTextField();
        wantItem2.setColumns(10);
        
        textField = new JTextField();
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        
        textField_6 = new JTextField();
        textField_6.setColumns(10);
        
        textField_7 = new JTextField();
        textField_7.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("10");
        
        JLabel label_10 = new JLabel(" 0");
        
        JLabel lblNewLabel_1 = new JLabel("Item");
        
        JLabel lblNewLabel_2 = new JLabel("Lorem ipsum dolor sit amet");
        
        JLabel lblNewLabel_3 = new JLabel("Unit Cost");
        
        JLabel lblNewLabel_4 = new JLabel("Cost");
        
        JLabel lblTotalCost = new JLabel("Total Cost");
        
        textField_8 = new JTextField();
        textField_8.setColumns(10);
        
        textField_9 = new JTextField();
        textField_9.setColumns(10);
        
        textField_10 = new JTextField();
        textField_10.setColumns(10);
        
        JLabel label = new JLabel("10");
        
        JLabel label_1 = new JLabel("10");
        
        JLabel label_2 = new JLabel("10");
        
        JLabel label_3 = new JLabel("10");
        
        JLabel label_4 = new JLabel("10");
        
        JLabel label_5 = new JLabel("10");
        
        JLabel label_6 = new JLabel("10");
        
        JLabel label_7 = new JLabel("10");
        
        JLabel label_8 = new JLabel("10");
        
        JLabel label_9 = new JLabel(" 0");
        
        JLabel label_11 = new JLabel(" 0");
        
        JLabel label_12 = new JLabel(" 0");
        
        JLabel label_13 = new JLabel(" 0");
        
        JLabel label_14 = new JLabel(" 0");
        
        JLabel label_15 = new JLabel(" 0");
        
        JLabel label_16 = new JLabel(" 0");
        
        JLabel label_17 = new JLabel(" 0");
        
        JLabel label_18 = new JLabel(" 0");
        
        JLabel label_19 = new JLabel("Lorem ipsum dolor sit amet");
        
        JLabel label_20 = new JLabel("Lorem ipsum dolor sit amet");
        
        JLabel label_21 = new JLabel("Lorem ipsum dolor sit amet");
        
        JLabel label_22 = new JLabel("Lorem ipsum dolor sit amet");
        
        JLabel label_23 = new JLabel("Lorem ipsum dolor sit amet");
        
        JLabel label_24 = new JLabel("Lorem ipsum dolor sit amet");
        
        JLabel label_25 = new JLabel("Lorem ipsum dolor sit amet");
        
        JLabel label_26 = new JLabel("Lorem ipsum dolor sit amet");
        
        JLabel label_27 = new JLabel("Lorem ipsum dolor sit amet");
        
        JLabel lblNewLabel_5 = new JLabel("4.95");
        
        JLabel label_28 = new JLabel("4.95");
        
        JLabel label_29 = new JLabel("4.95");
        
        JLabel label_30 = new JLabel("4.95");
        
        JLabel label_31 = new JLabel("4.95");
        
        JLabel label_32 = new JLabel("4.95");
        
        JLabel label_33 = new JLabel("4.95");
        
        JLabel label_34 = new JLabel("4.95");
        
        JLabel label_35 = new JLabel("4.95");
        
        JLabel label_36 = new JLabel("4.95");
        
        JLabel label_37 = new JLabel("0.00");
        
        JLabel label_38 = new JLabel("0.00");
        
        JLabel label_39 = new JLabel("0.00");
        
        JLabel label_40 = new JLabel("0.00");
        
        JLabel label_41 = new JLabel("0.00");
        
        JLabel label_42 = new JLabel("0.00");
        
        JLabel label_43 = new JLabel("0.00");
        
        JLabel label_44 = new JLabel("0.00");
        
        JLabel label_45 = new JLabel("0.00");
        
        JLabel label_46 = new JLabel("0.00");
        
        JLabel lblYouHave = new JLabel("You Have $");
        
        JLabel lblNewLabel_6 = new JLabel("1400.01");
        
        JLabel lblTotalCost_1 = new JLabel("Total Cost $");
        
        JLabel lblNewLabel_7 = new JLabel("0.00");
        
        JButton btnPurchase = new JButton("Purchase");
        
        JButton btnCancel = new JButton("Cancel");
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(lblInventory)
                        .addComponent(label_10, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_9, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_11, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_12, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_13, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_14, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_15, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_16, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_17, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_18, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(36)
                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                .addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addPreferredGap(ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                                    .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                        .addComponent(lblTotalCost)
                                        .addGroup(groupLayout.createSequentialGroup()
                                            .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                .addComponent(lblTotalCost_1)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                    .addComponent(lblNewLabel_3)
                                                    .addGroup(groupLayout.createSequentialGroup()
                                                        .addGap(6)
                                                        .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                            .addComponent(label_28, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblNewLabel_5)
                                                            .addComponent(label_29, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label_30, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label_31, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label_32, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label_33, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label_34, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label_35, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label_36, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))))
                                            .addGap(18))))
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                            .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                .addComponent(label_8, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_7, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_6, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_5, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblNewLabel))
                                            .addGap(18)
                                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                .addComponent(wantItem1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(wantItem2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                            .addGap(26)
                                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                .addComponent(label_27, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_26, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_25, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_24, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_23, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_22, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_21, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_20, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label_19, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblNewLabel_2)))
                                        .addGroup(groupLayout.createSequentialGroup()
                                            .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                .addComponent(lblStoreInv)
                                                .addGroup(groupLayout.createSequentialGroup()
                                                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(btnPurchase)
                                                        .addComponent(lblYouHave))
                                                    .addPreferredGap(ComponentPlacement.RELATED)))
                                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                .addGroup(groupLayout.createSequentialGroup()
                                                    .addGap(18)
                                                    .addComponent(lblBuy)
                                                    .addGap(70)
                                                    .addComponent(lblNewLabel_1))
                                                .addGroup(groupLayout.createSequentialGroup()
                                                    .addPreferredGap(ComponentPlacement.UNRELATED)
                                                    .addComponent(lblNewLabel_6))
                                                .addGroup(groupLayout.createSequentialGroup()
                                                    .addGap(112)
                                                    .addComponent(btnCancel)))))
                                    .addGap(91)))
                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addGap(18)
                                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lblNewLabel_4)
                                        .addComponent(label_37)
                                        .addComponent(label_38, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_39, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_40, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_41, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_42, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_43, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_44, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_45, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_46, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addComponent(lblNewLabel_7)))
                            .addContainerGap())))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(panel, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblStoreInv)
                                .addComponent(lblBuy)
                                .addComponent(lblNewLabel_1)
                                .addComponent(lblNewLabel_3)
                                .addComponent(lblNewLabel_4)
                                .addComponent(lblInventory))
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(wantItem1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNewLabel)
                                .addComponent(label_10)
                                .addComponent(lblNewLabel_2)
                                .addComponent(label_37)
                                .addComponent(lblNewLabel_5))
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(wantItem2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label)
                                .addComponent(label_9)
                                .addComponent(label_19)
                                .addComponent(label_38)
                                .addComponent(label_28))
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_1)
                                .addComponent(label_11)
                                .addComponent(label_20)
                                .addComponent(label_39)
                                .addComponent(label_29))
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_2)
                                .addComponent(label_12)
                                .addComponent(label_21)
                                .addComponent(label_40)
                                .addComponent(label_30))
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_3)
                                .addComponent(label_13)
                                .addComponent(label_22)
                                .addComponent(label_41)
                                .addComponent(label_31))
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_4)
                                .addComponent(label_14)
                                .addComponent(label_23)
                                .addComponent(label_42)
                                .addComponent(label_32))
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_5)
                                .addComponent(label_15)
                                .addComponent(label_24)
                                .addComponent(label_43)
                                .addComponent(label_33))
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_6)
                                .addComponent(label_16)
                                .addComponent(label_25)
                                .addComponent(label_44)
                                .addComponent(label_34))
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_7)
                                .addComponent(label_17)
                                .addComponent(label_26)
                                .addComponent(label_45)
                                .addComponent(label_35))
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_8)
                                .addComponent(label_18)
                                .addComponent(label_27)
                                .addComponent(label_46)
                                .addComponent(label_36))
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblYouHave)
                                .addComponent(lblNewLabel_6)
                                .addComponent(lblNewLabel_7)
                                .addComponent(lblTotalCost_1))
                            .addGap(31)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(btnPurchase)
                                .addComponent(btnCancel))
                            .addGap(44)
                            .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(22))
                                .addComponent(lblTotalCost)))))
        );
        frame.getContentPane().setLayout(groupLayout);
    }
}
