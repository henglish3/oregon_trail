package edu.gatech.cs2340.shlat.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GamePlayInterface {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GamePlayInterface window = new GamePlayInterface();
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
    public GamePlayInterface() {
        initialize();
    }
    
    /**
     *Set visibility of the window
     */
    public void setVisibility(boolean visibility) {
        frame.setVisible(visibility);
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 727, 471);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JToolBar toolBar = new JToolBar();
        
        JButton btnMenu = new JButton("Menu");
        btnMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        toolBar.add(btnMenu);
        
        JPopupMenu popupMenu = new JPopupMenu();
        addPopup(btnMenu, popupMenu);
        
        JButton btnNew = new JButton("New");
        popupMenu.add(btnNew);
        
        JButton btnLoad = new JButton("Load");
        popupMenu.add(btnLoad);
        
        JButton btnSave = new JButton("Save");
        popupMenu.add(btnSave);
        
        JButton btnQuit = new JButton("Quit");
        popupMenu.add(btnQuit);
        
        JLabel lblPace = new JLabel("Pace");
        lblPace.setHorizontalAlignment(SwingConstants.CENTER);
        lblPace.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        
        JRadioButton rdbtnNorm = new JRadioButton("Normal");
        rdbtnNorm.setHorizontalAlignment(SwingConstants.LEFT);
        rdbtnNorm.setSelected(true);
        rdbtnNorm.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        
        JRadioButton rdbtnSlow = new JRadioButton("Slow");
        rdbtnSlow.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        rdbtnSlow.setHorizontalAlignment(SwingConstants.LEFT);
        
        JRadioButton rdbtnFast = new JRadioButton("Ludicrous ");
        rdbtnFast.setHorizontalAlignment(SwingConstants.LEFT);
        rdbtnFast.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        
        JLabel lblNewLabel = new JLabel("Rations");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        
        JRadioButton rdbtnStarved = new JRadioButton("Famished");
        rdbtnStarved.setHorizontalAlignment(SwingConstants.LEFT);
        rdbtnStarved.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("Enough");
        rdbtnNewRadioButton.setSelected(true);
        rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
        rdbtnNewRadioButton.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Gluttonous");
        rdbtnNewRadioButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.LEFT);
        
        JPanel panel = new JPanel();
        
        JLabel lblWeather = new JLabel("Weather");
        lblWeather.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel lblWeatherImg = new JLabel("");
        lblWeatherImg.setIcon(new ImageIcon("/Users/harrisonenglish/Desktop/CS 2340/img/SunCartoon.jpg"));
        
        JLabel lblNewLabel_1 = new JLabel("1 Jan 2011");
        lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        
        JButton btnGo = new JButton("GO");
        
        JButton btnMap = new JButton("Map");
        
        JButton btnStop = new JButton("Stop");
        
        JButton btnJournal = new JButton("Journal");
        
        JButton btnInventory = new JButton("Inventory");
        
        JButton btnStatus = new JButton("Status");
        
        JTextPane textPane = new JTextPane();
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addGap(26)
                                    .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                                        .addGroup(groupLayout.createSequentialGroup()
                                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                .addGroup(groupLayout.createSequentialGroup()
                                                    .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                        .addComponent(lblPace)
                                                        .addComponent(rdbtnSlow))
                                                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                            .addGap(63)
                                                            .addComponent(lblNewLabel))
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                            .addGap(45)
                                                            .addComponent(rdbtnStarved))))
                                                .addGroup(groupLayout.createSequentialGroup()
                                                    .addComponent(rdbtnNorm, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(ComponentPlacement.UNRELATED)
                                                    .addComponent(rdbtnNewRadioButton)))
                                            .addGap(13))
                                        .addGroup(groupLayout.createSequentialGroup()
                                            .addPreferredGap(ComponentPlacement.RELATED)
                                            .addComponent(rdbtnFast)
                                            .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rdbtnNewRadioButton_1)
                                            .addPreferredGap(ComponentPlacement.RELATED)))
                                    .addComponent(textPane, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(ComponentPlacement.UNRELATED, 17, Short.MAX_VALUE)
                                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                                        .addComponent(btnInventory, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGo, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnStop, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(panel, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                .addComponent(btnStatus, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMap, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnJournal, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addGap(12)
                                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                            .addGap(29)
                                            .addComponent(lblWeather))
                                        .addGroup(groupLayout.createSequentialGroup()
                                            .addGap(8)
                                            .addComponent(lblWeatherImg, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                            .addGap(18)
                                            .addComponent(lblNewLabel_1)))))))
                    .addGap(3))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addComponent(toolBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addComponent(lblWeather)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(lblWeatherImg, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(lblNewLabel_1)
                            .addGap(179)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(btnMap)
                                .addComponent(btnStop))
                            .addGap(50))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addComponent(panel, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblPace)
                                        .addComponent(lblNewLabel))
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(rdbtnStarved)
                                        .addComponent(btnStatus)
                                        .addComponent(rdbtnSlow, GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
                                        .addComponent(btnGo))
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(rdbtnNorm)
                                        .addComponent(rdbtnNewRadioButton))
                                    .addGap(12)
                                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnInventory)
                                        .addComponent(rdbtnFast)
                                        .addComponent(btnJournal)
                                        .addComponent(rdbtnNewRadioButton_1)))
                                .addComponent(textPane, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
                            .addGap(15))))
        );
        frame.getContentPane().setLayout(groupLayout);
    }

    private static void addPopup(Component component, final JPopupMenu popup) {
        component.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showMenu(e);
                }
            }
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showMenu(e);
                }
            }
            private void showMenu(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });
    }
}
