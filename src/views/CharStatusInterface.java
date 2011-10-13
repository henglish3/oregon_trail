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


public class CharStatusInterface {

    private JFrame frame;
    private String[] name;
    private String[] age;
    private String[] sex;
    private String[] lblStatus;
    private String job;
    private String lblPace;
    private String lblRations;
    private JLabel lblCurrentRations;
    private JLabel lblCurrentPace;

    /**
    *set visibility of the window
    */
    public void setVisibility(boolean visibility) {
    	frame.setVisible(visibility);
    }
    /**
     * Create the application.
     */
    public CharStatusInterface(String[] name, String[] age, String[] sex, String job) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.job = job;
        initialize();
    }
    
    /**
    * Set the Status for the characters in window
    */
    public void setStatus(int charId, String status) {
    	switch(charId) {
    		case 0:
                lblStatus[0] = status;
                break;
            case 1:
                lblStatus[1] = status;
                break;
            case 2:
                lblStatus[2] = status;
                break;
            case 3:
                lblStatus[3] = status;
                break;
        }
    }
    
    /**
    * Set the Pace for the wagon in window
    */
    public void setPace(int pace) {
    	switch(pace) {
            case 0:
                lblPace = "Slow";
                break;
            case 1:
                lblPace = "Normal";
                break;
            case 2:
                lblPace = "Ludicrous";
                break;
        }
        lblCurrentPace.setText(lblPace);
    }
    /**
    * Set Rations for the wagon in stat window
    */
    public void setRations(int ration) {
    	switch(ration) {
            case 0:
                lblRations = "Famished";
                break;
            case 1:
                lblRations = "Enough";
                break;
            case 2:
                lblRations = "Gluttonous";
                break;
        }
        lblCurrentRations.setText(lblRations);
    }
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100,100, 625, 466);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lblName = new JLabel("Name");
        lblName.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblStatus = new JLabel("Status");
        lblStatus.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblProfession = new JLabel("Profession");
        lblProfession.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblMainCharName = new JLabel(name[0]);
        
        JLabel lblMainCharStatus = new JLabel("Well");
        
        JLabel lblMainCharJob = new JLabel(job);
        
        JLabel lblMainCharPic = new JLabel("");
        lblMainCharPic.setIcon(new ImageIcon("/Users/harrisonenglish/Desktop/face.png"));
        
        JLabel lblAge = new JLabel("Age");
        lblAge.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        
        JLabel lblMainCharAge = new JLabel(age[0]);
        
        JLabel lblChar2Name = new JLabel(name[1]);
        
        JLabel lblChar2Age = new JLabel(age[1]);
        
        JLabel lblChar2Status = new JLabel("Well");
        
        JLabel lblChar2Job = new JLabel("Banker");
        
        JLabel lblChar2Pic = new JLabel("");
        lblChar2Pic.setIcon(new ImageIcon("/Users/harrisonenglish/Desktop/face.png"));
        
        JLabel lblChar3Pic = new JLabel("");
        lblChar3Pic.setIcon(new ImageIcon("/Users/harrisonenglish/Desktop/face.png"));
        
        JLabel lblChar4Pic = new JLabel("");
        lblChar4Pic.setIcon(new ImageIcon("/Users/harrisonenglish/Desktop/face.png"));
        
        JLabel lblChar3Name = new JLabel(name[2]);
        
        JLabel lblCha3Age = new JLabel(age[2]);
        
        JLabel lblChar3Status = new JLabel("Well");
        
        JLabel lblChar3Job = new JLabel("Banker");
        
        JLabel lblChar4Name = new JLabel(name[3]);
        
        JLabel lblChar4Age = new JLabel(age[3]);
        
        JLabel lblChar4Status = new JLabel("Well");
        
        JLabel lblChar4Job = new JLabel("Banker");
        
        JButton btnDone = new JButton("Done");
        
        JLabel lblPace = new JLabel("Pace");
        lblPace.setFont(new Font("Lucida Grande", Font.BOLD, 15));
        
        lblCurrentPace = new JLabel("Normal");
        lblCurrentPace.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        
        JLabel lblRations = new JLabel("Rations");
        lblRations.setFont(new Font("Lucida Grande", Font.BOLD, 15));
        
        lblCurrentRations = new JLabel("Enough");
        
        
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblMainCharPic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblChar2Pic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblChar3Pic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblChar4Pic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(26)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(lblName)
        						.addComponent(lblMainCharName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lblChar2Name, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lblChar3Name, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        						.addComponent(lblChar4Name, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(lblChar4Age, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(lblChar2Age, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(lblCha3Age, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(lblMainCharAge, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        						.addComponent(lblAge)))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(37)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblPace)
        						.addComponent(lblCurrentPace, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(lblRations, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
        						.addComponent(lblCurrentRations, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))))
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(24)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(lblProfession)
        						.addComponent(lblMainCharJob, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        						.addComponent(lblChar2Job, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lblChar3Job, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lblChar4Job, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblMainCharStatus)
        						.addComponent(lblStatus)
        						.addComponent(lblChar2Status, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblChar3Status, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblChar4Status, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        					.addGap(89))
        				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        					.addComponent(btnDone)
        					.addContainerGap())))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(34)
        			.addComponent(lblMainCharPic, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(lblChar2Pic, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(lblChar3Pic, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(lblChar4Pic, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
        			.addComponent(btnDone)
        			.addContainerGap())
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(19)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblName)
        				.addComponent(lblProfession)
        				.addComponent(lblStatus)
        				.addComponent(lblAge))
        			.addGap(15)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblMainCharName)
        				.addComponent(lblMainCharStatus)
        				.addComponent(lblMainCharJob)
        				.addComponent(lblMainCharAge))
        			.addGap(77)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblChar2Name)
        				.addComponent(lblChar2Job)
        				.addComponent(lblChar2Status)
        				.addComponent(lblChar2Age))
        			.addGap(79)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblChar3Name)
        				.addComponent(lblChar3Job)
        				.addComponent(lblChar3Status)
        				.addComponent(lblCha3Age, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
        			.addGap(84)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblChar4Name)
        				.addComponent(lblChar4Job)
        				.addComponent(lblChar4Status)
        				.addComponent(lblChar4Age))
        			.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblPace)
        				.addComponent(lblRations, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblCurrentPace)
        				.addComponent(lblCurrentRations))
        			.addGap(11))
        );
        frame.getContentPane().setLayout(groupLayout);
    }
}
