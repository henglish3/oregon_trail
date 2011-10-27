//package edu.gatech.cs2340.shlat.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.*;


public class NewGameCharInterface {

    private JFrame frame;
    private JTextField mainCharNameField;
    private JTextField char2NameField;
    private JTextField char3NameField;
    private JTextField char4NameField;
    private JTextField mainCharAgeField;
    private JTextField char2AgeField;
    private JTextField char3AgeField;
    private JTextField char4AgeField;
    private JComboBox mainCharJobField;        
    private JComboBox mainCharSexField;
    private JComboBox char2SexField;
    private JComboBox char3SexField;
    private JComboBox char4SexField;
    private JRadioButton rdbtnSlow;
    private JRadioButton rdbtnNormal;
    private JRadioButton rdbtnLudicrous; 
    private JRadioButton rdbtnFamished;        
    private JRadioButton rdbtnEnough;
    private JRadioButton rdbtnGluttonous;
    private JLabel lblNewCharacterScreen;
    private JLabel lblPartyLeader;

    /**
     * Launch the application.
     */
    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NewGameCharInterface window = new NewGameCharInterface();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/

    /**
     * Create the application.
     */
    public NewGameCharInterface(ActionListener al) {
        initialize(al);
    }
    
    /**
     *Set visibility of the window
     */
    public void setVisibility(boolean visibility) {
        frame.setVisible(visibility);
    }
    
    /**
     *Get the main character name
     */
    public String getMainCharacterName() {
        return mainCharNameField.getText();
    }
    
    /**
     *Get a character name
     */
    public String getCharacterName(int charId) {
        switch(charId) {
            case 0:
                return char2NameField.getText();
            case 1:
                return char3NameField.getText();
            case 2:
                return char4NameField.getText();
        }
        
        return "";
    }
    
    /**
     *Get the main character age
     */
    public int getMainCharacterAge() {
        return Integer.parseInt(mainCharAgeField.getText());
    }
    
    /**
     *Get character age
     */
    public int getCharacterAge(int charId) {
        JTextField ageField;
        switch(charId) {
            case 0:
                ageField = char2AgeField;
                break;
            case 1:
                ageField = char3AgeField;
                break;
            case 2:
                ageField = char4AgeField;
                break;
            default:
                return 0;
        }
        
        return Integer.parseInt(ageField.getText());
    }
    
    /**
     *Get the main character sex
     */
    public int getMainCharacterSex() {
        if(((String)(mainCharJobField.getSelectedItem())).equals("Male"))
            return 0;
        
        return 1;
    }
    
    /**
     *Get character sex
     */
    public int getCharacterSex(int charId) {
        JComboBox sexCombo;
        switch(charId) {
            case 0:
                sexCombo = char2SexField;
                break;
            case 1:
                sexCombo = char3SexField;
                break;
            case 2:
                sexCombo = char4SexField;
                break;
            default:
                return 0;
        }
        
        if(((String)(sexCombo.getSelectedItem())).equals("Male"))
            return 0;
        
        return 1;
    }
    
    /**
     *Get the main character job
     */
    public int getMainCharacterJob() {
        String selection =(String)(mainCharJobField.getSelectedItem());
        if(selection.equals("Banker"))
            return 0;
        else if(selection.equals("Carpenter"))
            return 1;
        else
            return 2;
    }
    
    /**
     *Get initial pace
     */
    public int getInitialPace() {
        if(rdbtnSlow.isSelected())
            return 0;
        else if(rdbtnNormal.isSelected())
            return 1;
        else
            return 2;
    }
    
    /**
     *Get initial rations
     */
    public int getInitialRations() {
        if(rdbtnFamished.isSelected())
            return 0;
        else if(rdbtnEnough.isSelected())
            return 1;
        else
            return 2;
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize(ActionListener al) {
        frame = new JFrame();
        frame.setBounds(100,100, 602, 607);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //Sets the Labels for the different Category  
        JLabel lblName = new JLabel("Name");
        lblName.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblProfession = new JLabel("Profession");
        lblProfession.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblAge = new JLabel("Age");
        lblAge.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblSex = new JLabel("Sex");
        lblSex.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        //Jlables for the Images of each character
        JLabel lblMainCharPic = new JLabel("");
        lblMainCharPic.setIcon(new ImageIcon("/Users/harrisonenglish/Desktop/face.png"));
        
        JLabel lblChar2Pic = new JLabel("");
        lblChar2Pic.setIcon(new ImageIcon("/Users/harrisonenglish/Desktop/face.png"));
        
        JLabel lblChar3Pic = new JLabel("");
        lblChar3Pic.setIcon(new ImageIcon("/Users/harrisonenglish/Desktop/face.png"));
        
        JLabel lblChar4Pic = new JLabel("");
        lblChar4Pic.setIcon(new ImageIcon("/Users/harrisonenglish/Desktop/face.png"));
        
        //Set's the each Field for each player and sets the default
        mainCharNameField = new JTextField();
        mainCharNameField.setText("Your Name");
        mainCharNameField.setColumns(10);
        
        char2NameField = new JTextField();
        char2NameField.setText("Tomer Elmalem");
        char2NameField.setColumns(10);
        
        char3NameField = new JTextField();
        char3NameField.setText("Al Lewis");
        char3NameField.setColumns(10);
        
        char4NameField = new JTextField();
        char4NameField.setText("Lucas Pessoa");
        char4NameField.setColumns(10);
        
        mainCharAgeField = new JTextField();
        mainCharAgeField.setText("30");
        mainCharAgeField.setColumns(10);
        
        char2AgeField = new JTextField();
        char2AgeField.setText("22");
        char2AgeField.setColumns(10);
        
        char3AgeField = new JTextField();
        char3AgeField.setText("15");
        char3AgeField.setColumns(10);
        
        char4AgeField = new JTextField();
        char4AgeField.setText("60");
        char4AgeField.setColumns(10);
        
        
        String[] professions = { "Banker","Carpenter","Farmer" };
        mainCharJobField = new JComboBox(professions);
        
        String[] sex = { "Male","Female" };
        mainCharSexField = new JComboBox(sex);
        char2SexField = new JComboBox(sex);
        char3SexField = new JComboBox(sex);
        char4SexField = new JComboBox(sex);
        
        JLabel lblInitialPace = new JLabel("Initial Pace");
        lblInitialPace.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        rdbtnSlow = new JRadioButton("Slow");
        rdbtnNormal = new JRadioButton("Normal");
        rdbtnNormal.setSelected(true);
        rdbtnLudicrous = new JRadioButton("Ludicrous");
        
        ButtonGroup paceGroup = new ButtonGroup();
            paceGroup.add(rdbtnSlow);
            paceGroup.add(rdbtnNormal);
            paceGroup.add(rdbtnLudicrous);
    
            
        JLabel lblIntialRations = new JLabel("Intial Rations");
        lblIntialRations.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        rdbtnFamished = new JRadioButton("Famished");        
        rdbtnEnough = new JRadioButton("Enough");
        rdbtnEnough.setSelected(true);
        rdbtnGluttonous = new JRadioButton("Gluttonous");
        
        ButtonGroup rationGroup = new ButtonGroup();
            rationGroup.add(rdbtnFamished);
            rationGroup.add(rdbtnEnough);
            rationGroup.add(rdbtnGluttonous);
        
        JButton btnReset = new JButton("Reset");
        btnReset.setActionCommand("ngciReset");
        btnReset.addActionListener(al);
        
        JButton btnDone = new JButton("Done");
        btnDone.setActionCommand("ngciDone");
        btnDone.addActionListener(al);
        
        lblNewCharacterScreen = new JLabel("New Character Screen");
        lblNewCharacterScreen.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
        
        lblPartyLeader = new JLabel("Pary Leader:");
        lblPartyLeader.setFont(new Font("Lucida Grande", Font.PLAIN, 13));

        
        //Layout Stuff DON'T TOUCH!!!!
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(108)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(rdbtnNormal)
        				.addComponent(rdbtnSlow)
        				.addComponent(lblInitialPace)
        				.addComponent(rdbtnLudicrous))
        			.addGap(31)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(lblIntialRations)
        					.addContainerGap())
        				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        					.addGroup(groupLayout.createSequentialGroup()
        						.addComponent(rdbtnFamished)
        						.addContainerGap())
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(rdbtnEnough)
        							.addContainerGap(277, Short.MAX_VALUE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(rdbtnGluttonous)
        							.addPreferredGap(ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
        							.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(btnDone)
        							.addGap(29))))))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblChar2Pic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblChar3Pic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblChar4Pic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
        					.addGap(26)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblName)
        						.addComponent(char2NameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
        						.addComponent(char3NameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblPartyLeader)
        						.addComponent(mainCharNameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
        						.addComponent(char4NameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
        					.addGap(41)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(char4AgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(mainCharAgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblAge)
        						.addComponent(char2AgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(char3AgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        					.addGap(40)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(char3SexField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        						.addComponent(char2SexField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        						.addComponent(char4SexField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(groupLayout.createSequentialGroup()
        									.addComponent(lblSex)
        									.addGap(90))
        								.addGroup(groupLayout.createSequentialGroup()
        									.addComponent(mainCharSexField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)))
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblProfession)
        								.addComponent(mainCharJobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        					.addGap(35))
        				.addComponent(lblMainCharPic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(43)
        			.addComponent(lblNewCharacterScreen)
        			.addContainerGap(394, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(26)
        			.addComponent(lblNewCharacterScreen)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(lblMainCharPic, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(lblChar2Pic, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(lblChar3Pic, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(lblChar4Pic, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblName)
        						.addComponent(lblSex)
        						.addComponent(lblProfession)
        						.addComponent(lblAge))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lblPartyLeader)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(mainCharNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(mainCharSexField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(mainCharJobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(mainCharAgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(50)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(char2NameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(char2SexField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(char2AgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(71)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(char3NameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(char3SexField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(char3AgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(62)
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(char4SexField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(char4NameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(char4AgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
        			.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(49)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(rdbtnSlow)
        						.addComponent(rdbtnFamished))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(rdbtnNormal)
        						.addComponent(rdbtnEnough))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(btnDone)
        							.addComponent(btnReset))
        						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(rdbtnGluttonous)
        							.addComponent(rdbtnLudicrous))))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(26)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblInitialPace)
        						.addComponent(lblIntialRations))))
        			.addContainerGap(19, Short.MAX_VALUE))
        );
        frame.getContentPane().setLayout(groupLayout);
    }
}
