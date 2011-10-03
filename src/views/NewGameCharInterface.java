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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the application.
	 */
	public NewGameCharInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100,100, 589, 574);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Sets the Labels for the different Category  
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		JLabel lblProfession = new JLabel("Profession");
		lblProfession.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
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
		JComboBox mainCharJobField = new JComboBox(professions);		
		JComboBox char2JobField = new JComboBox(professions);	
		JComboBox char3JobField = new JComboBox(professions);		
		JComboBox char4JobField = new JComboBox(professions);
		
		String[] sex = { "Male","Female" };
		JComboBox mainCharSexField = new JComboBox(sex);
		JComboBox char2SexField = new JComboBox(sex);
		JComboBox char3SexField = new JComboBox(sex);
		JComboBox char4SexField = new JComboBox(sex);
		
		JLabel lblInitialPace = new JLabel("Initial Pace");
		lblInitialPace.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		JRadioButton rdbtnSlow = new JRadioButton("Slow");
		JRadioButton rdbtnNormal = new JRadioButton("Normal");
		rdbtnNormal.setSelected(true);
		JRadioButton rdbtnLudicrous = new JRadioButton("Ludicrous");
		
		ButtonGroup paceGroup = new ButtonGroup();
			paceGroup.add(rdbtnSlow);
			paceGroup.add(rdbtnNormal);
			paceGroup.add(rdbtnLudicrous);
	
			
		JLabel lblIntialRations = new JLabel("Intial Rations");
		lblIntialRations.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		JRadioButton rdbtnFamished = new JRadioButton("Famished");		
		JRadioButton rdbtnEnough = new JRadioButton("Enough");
		rdbtnEnough.setSelected(true);
		JRadioButton rdbtnGluttonous = new JRadioButton("Gluttonous");
		
		ButtonGroup rationGroup = new ButtonGroup();
			rationGroup.add(rdbtnFamished);
			rationGroup.add(rdbtnEnough);
			rationGroup.add(rdbtnGluttonous);
		
		JButton btnReset = new JButton("Reset");
		JButton btnDone = new JButton("Done");
		

		
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
									.addContainerGap(273, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rdbtnGluttonous)
									.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
									.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnDone)
									.addGap(29))))))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMainCharPic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblChar2Pic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblChar3Pic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblChar4Pic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblName)
						.addComponent(char2NameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(char3NameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(char4NameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
						.addComponent(mainCharNameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAge)
						.addComponent(char2AgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(char3AgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(char4AgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(mainCharAgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblProfession)
						.addComponent(char4JobField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addComponent(char3JobField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addComponent(char2JobField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addComponent(mainCharJobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSex)
						.addComponent(mainCharSexField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(char2SexField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(char3SexField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(char4SexField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(34)
							.addComponent(lblMainCharPic, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblChar2Pic, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblChar3Pic, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblChar4Pic, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblName)
								.addComponent(lblProfession)
								.addComponent(lblAge)
								.addComponent(lblSex))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(mainCharNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(mainCharAgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(mainCharJobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(mainCharSexField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(65)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(char2NameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char2AgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char2JobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char2SexField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(char3NameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char3AgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char3JobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char3SexField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(62)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(char4NameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char4AgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char4JobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char4SexField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
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
					.addContainerGap(13, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
