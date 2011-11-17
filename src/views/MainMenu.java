package edu.gatech.cs2340.shlat.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;


public class MainMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
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
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Main Menu");
		frame.setBounds(100, 100, 426, 255);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewGame = new JButton("New Game");
		
		JButton btnLoadGame = new JButton("Load Game");
		
		JLabel lblPimpsTrail = new JLabel("Pimps Trail");
		lblPimpsTrail.setForeground(new Color(147, 112, 219));
		lblPimpsTrail.setFont(new Font("Impact", Font.BOLD, 34));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(150)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnLoadGame)
								.addComponent(btnNewGame)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(126)
							.addComponent(lblPimpsTrail)))
					.addContainerGap(145, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(42, Short.MAX_VALUE)
					.addComponent(lblPimpsTrail)
					.addGap(18)
					.addComponent(btnNewGame)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnLoadGame)
					.addGap(60))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
