 /**
 * Main controller object
 * 
 * @author S.H.L.A.T.
 * @version 0.1 10/04/11
 */

public class Game implements ActionListener {
    public Game() {
        //TODO: Implement constructor
    }

    public void actionPerformed(ActionEvent e) { 
        //Use the action command to determine appropriate reaction
        String action_command = e.getActionCommand();
        if(action_command.equals("action1")) {
            //Do something
        } else if(action_command.equals("action2")) {
            //Do something else
        }
        //... 
    }

    public static void main(String[] args) {
        //Entry point
    }

}
