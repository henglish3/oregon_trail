package edu.gatech.cs2340.shlat.views;

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
    private JComboBox startMonthField;
    private JRadioButton rdbtnSlow;
    private JRadioButton rdbtnNormal;
    private JRadioButton rdbtnLudicrous; 
    private JRadioButton rdbtnFamished;        
    private JRadioButton rdbtnEnough;
    private JRadioButton rdbtnGluttonous;
    private JLabel lblNewCharacterScreen;
    private JLabel lblPartyLeader;
    private JTextField dateField;

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
     *Get start month
     */
    public int getStartMonth() {
        String selection =(String)(startMonthField.getSelectedItem());
        if(selection.equals("January"))
            return 0;
        else if(selection.equals("Feburary"))
            return 1;
        else if(selection.equals("March"))
            return 2;
        else if(selection.equals("April"))
            return 3;
        else if(selection.equals("May"))
            return 4;
        else if(selection.equals("June"))
            return 5;
        else if(selection.equals("July"))
            return 6;
        else if(selection.equals("August"))
            return 7;
        else if(selection.equals("September"))
            return 8;
        else if(selection.equals("October"))
            return 9;
        else if(selection.equals("November"))
            return 10;
        else if(selection.equals("Decemeber"))
            return 11;
        else
        	return 4;
    }
    /**
     * returns the start day.
     * 
     * @return dateField the start day
     */
    public String getStartDay() {
    	return dateField.getText();
    }
    /**
     *Get initial pace
     */
    public int getInitialPace() {
        if(rdbtnSlow.isSelected())
            return 1;
        else if(rdbtnNormal.isSelected())
            return 2;
        else
            return 3;
    }
    
    /**
     *Get initial rations
     */
    public int getInitialRations() {
        if(rdbtnFamished.isSelected())
            return 1;
        else if(rdbtnEnough.isSelected())
            return 2;
        else
            return 3;
    }
    
    /**
     *Clears the GUI
     *
     */
    public void clear() {
        mainCharNameField.setText("");
        mainCharNameField.setText("");
        char2NameField.setText("");
        char3NameField.setText("");
        char4NameField.setText("");
        mainCharAgeField.setText("");
        char2AgeField.setText("");
        char3AgeField.setText("");
        char4AgeField.setText("");
        dateField.setText("");
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize(ActionListener al) {
        frame = new JFrame("New Game");
        frame.setBounds(100,100, 591, 472);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //Sets the Labels for the different Category  
        JLabel lblName = new JLabel("Name");
        lblName.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblProfession = new JLabel("Profession");
        lblProfession.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblAge = new JLabel("Age");
        lblAge.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
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
        
        JLabel lblStartDate = new JLabel("Start Date");
        lblStartDate.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        dateField = new JTextField();
        dateField.setColumns(10);
        
        
        String[] months = { "January","Feburary","March","April","May","June","July","August","September","October","November","December" };
        startMonthField = new JComboBox(months);
        
        JLabel label = new JLabel("2011");

        
        //Layout Stuff DON'T TOUCH!!!!
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(116)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblName)
        						.addComponent(lblPartyLeader)
        						.addComponent(mainCharNameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
        						.addComponent(char2NameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
        						.addComponent(char3NameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
        						.addComponent(char4NameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
        					.addGap(41)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(char4AgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(char3AgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(char2AgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(mainCharAgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        								.addComponent(lblAge))
        							.addGap(50)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(mainCharJobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(lblProfession)))))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(43)
        					.addComponent(lblNewCharacterScreen))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(66)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(rdbtnNormal)
        						.addComponent(rdbtnSlow)
        						.addComponent(rdbtnLudicrous)
        						.addComponent(lblInitialPace))
        					.addGap(31)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblIntialRations)
        						.addComponent(rdbtnEnough)
        						.addComponent(rdbtnFamished)
        						.addComponent(rdbtnGluttonous))
        					.addGap(53)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(btnDone))
        						.addComponent(lblStartDate)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(dateField, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(startMonthField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addGap(36)
        							.addComponent(label)))
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addContainerGap(51, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(26)
        			.addComponent(lblNewCharacterScreen)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblName)
        				.addComponent(lblAge)
        				.addComponent(lblProfession))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblPartyLeader)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(mainCharNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(mainCharAgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(mainCharJobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(char2NameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(char2AgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(char3NameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(char3AgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(char4NameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(char4AgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(39)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(23)
        					.addComponent(rdbtnSlow)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(rdbtnNormal)
        						.addComponent(rdbtnEnough))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(rdbtnLudicrous)
        						.addComponent(rdbtnGluttonous)
        						.addComponent(btnDone)
        						.addComponent(btnReset)))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblIntialRations)
        						.addComponent(lblInitialPace)
        						.addComponent(lblStartDate))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(dateField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(rdbtnFamished)
        						.addComponent(startMonthField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(label))))
        			.addContainerGap(29, Short.MAX_VALUE))
        );
        frame.getContentPane().setLayout(groupLayout);
    }
}
