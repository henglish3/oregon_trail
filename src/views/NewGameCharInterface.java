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
		frame.setBounds(100,100, 589, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		JLabel lblProfession = new JLabel("Profession");
		lblProfession.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		JLabel lblMainCharPic = new JLabel("");
		lblMainCharPic.setIcon(new ImageIcon("/Users/harrisonenglish/Desktop/face.png"));
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		JLabel lblChar2Pic = new JLabel("");
		lblChar2Pic.setIcon(new ImageIcon("/Users/harrisonenglish/Desktop/face.png"));
		
		JLabel lblChar3Pic = new JLabel("");
		lblChar3Pic.setIcon(new ImageIcon("/Users/harrisonenglish/Desktop/face.png"));
		
		JLabel lblChar4Pic = new JLabel("");
		lblChar4Pic.setIcon(new ImageIcon("/Users/harrisonenglish/Desktop/face.png"));
		
		JButton btnDone = new JButton("Done");
		
		mainCharNameField = new JTextField();
		mainCharNameField.setColumns(10);
		
		char2NameField = new JTextField();
		char2NameField.setColumns(10);
		
		char3NameField = new JTextField();
		char3NameField.setColumns(10);
		
		char4NameField = new JTextField();
		char4NameField.setColumns(10);
		
		mainCharAgeField = new JTextField();
		mainCharAgeField.setColumns(10);
		
		char2AgeField = new JTextField();
		char2AgeField.setColumns(10);
		
		char3AgeField = new JTextField();
		char3AgeField.setColumns(10);
		
		char4AgeField = new JTextField();
		char4AgeField.setColumns(10);
		
		
		String[] professions = { "Banker","Carpenter","Farmer" };
		JComboBox mainCharJobField = new JComboBox(professions);
		
		JComboBox char2JobField = new JComboBox(professions);
		
		JComboBox char3JobField = new JComboBox(professions);
		
		JComboBox char4JobField = new JComboBox(professions);
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMainCharPic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblChar2Pic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblChar3Pic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblChar4Pic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName)
								.addComponent(mainCharNameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(char2NameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(char3NameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(char4NameField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(mainCharAgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAge)
								.addComponent(char2AgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(char3AgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(char4AgeField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(40)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(char4JobField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
								.addComponent(char3JobField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
								.addComponent(char2JobField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblProfession)
								.addComponent(mainCharJobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(144))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnDone)
							.addContainerGap())))
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
								.addComponent(lblAge))
							.addGap(15)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(mainCharNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(mainCharJobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(mainCharAgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(67)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(char2NameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char2AgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char2JobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(71)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(char3NameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char3AgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char3JobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(char4NameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char4AgeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(char4JobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(29)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnDone)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
