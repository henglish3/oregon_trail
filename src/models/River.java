package edu.gatech.cs2340.shlat.models;
import edu.gatech.cs2340.shlat.models.*;
import java.lang.Math;

/**
 * Class that represents a River location.
 * @author S.H.L.A.T.
 * @version 0.6 11/05/11
 */
public class River extends Location {
    private int depth;
    
    public River() {
    }

    /**
     * Constructor that creates a River object taht extends Location and also has depth.
     * 
     * @param name The name of this Location object
     * @param landmark The name of the next traveling point
     * @param distance The starting value of the distance traveled by the player
     * @param depth The depth of the river.
     */
    public River(String name, String landmark, int distance, int depth){ 
        super(name, landmark, distance, Boolean.FALSE);
        this.depth = depth;
    } //ends River constructor.
    
    /**
     * Method that runs the one of the three methods chosen by the player when they encounter a river.
     * 
     * @param choice The player's choice.
     * @param player The player.
     */
    public String crossRiver(int choice, Player player, Party party) {
        String message = "";        
        if(choice == 0 && player.getMoney() >= 50) {
            payRiver(player);
            message = "You pay 50$ to cross on a ferry";
        }
        else if(choice == 1 && depth < 3) {
            message = fordRiver(player, party);
        }
        else {
            message = caulkRiver(player, party);
        }
        return message;
    } //ends choiceRiver method.
    
    /**
     * Player pays 50$ to cross the river on a ferry
     * 
     * @param player The player.
     */
    public void payRiver(Player player) {
        player.setMoney(player.getMoney() - 50);
    } //ends payRiver method.
    
    /**
     * Method that runs the river fording event and then adds 10 miles traveled.
     * 
     * @param player The player.
     * @param party The party.
     */
    public String fordRiver(Player player, Party party) {
        //Check if fording the river is successful
        double r, s, t;
        r = Math.random();
        s = Math.random();
        t = Math.random();
        int temp, orig;
        Item lostItem;
        if(r > 0.3) {
            return "Attempt to ford the river was successful!";
        } else {
            //Choose whether to kill a party member or lose an item
            if(s > 0.4) {
                //Wagon loses an item
                temp = (int)(t * player.getInventory().getList().size());
                lostItem = (Item)(player.getInventory().getList().get(temp));
                
                //Item must be present in inventory
                orig = temp;
                while(lostItem.getAmount() < 1) {
                    if(temp == player.getInventory().getList().size())
                        temp = 0;
                    else
                        temp++;
                        
                    if(temp == orig)
                        return "Attempt to ford the river was unsuccessful, but wagon is empty, nothing was lost.";
                        
                    lostItem = (Item)(player.getInventory().getList().get(temp));
                }
                
                lostItem.changeAmount(lostItem.getAmount() - 1);
                return ("Attempt to ford the river was unsuccessful. You lost a " + lostItem.getName());
            } else {
                //Party loses a member
                temp = (int)(t * (party.getNumCharacters() - 1)) + 1;
                
                while(temp != 0) {
                    if(party.getCharacter(temp).getStatus() != Status.DEAD) {
                        party.getCharacter(temp).setStatus(Status.DEAD);
                        return ("Attempt to ford the river was unsuccessful. You lost " + party.getCharacter(temp).getName());
                    } else {
                        temp++;
                        if(temp == party.getNumCharacters());
                            temp = 0;
                    }
                }
                
                //All other characters dead. Player dies. Game over.
                party.getCharacter(temp).setStatus(Status.DEAD);
                
                return "Attempt to ford the river was unsuccessful. You have died. GAME OVER!";
            }
        }
    } //ends fordRiver method.
    
    /**
     * Method that runs the caulking the wagon to float across the river and event then adds 10 miles traveled.
     * 
     * @param player The player.
     * @param party The party.
     */
    public String caulkRiver(Player player, Party party) {
        //Check if fording the river is successful
        double r, s, t;
        r = Math.random();
        s = Math.random();
        t = Math.random();
        int temp, orig;
        Item lostItem;
        if(r > 0.6) {
            return "Attempt to caulk the river was successful!";
        } else {
            //Choose whether to kill a party member or lose an item
            if(s > 0.4) {
                //Wagon loses an item
                temp = (int)(t * player.getInventory().getList().size());
                lostItem = (Item)(player.getInventory().getList().get(temp));
                
                //Item must be present in inventory
                orig = temp;
                while(lostItem.getAmount() < 1) {
                    if(temp == player.getInventory().getList().size())
                        temp = 0;
                    else
                        temp++;
                        
                    if(temp == orig)
                        return "Attempt to ford the river was unsuccessful, but wagon is empty, nothing was lost.";
                        
                    lostItem = (Item)(player.getInventory().getList().get(temp));
                }
                
                lostItem.changeAmount(lostItem.getAmount() - 1);
                return ("Attempt to ford the river was unsuccessful. You lost a " + lostItem.getName());
            } else {
                //Party loses a member
                temp = (int)(t * (party.getNumCharacters() - 1)) + 1;
                
                while(temp != 0) {
                    if(party.getCharacter(temp).getStatus() != Status.DEAD) {
                        party.getCharacter(temp).setStatus(Status.DEAD);
                        return ("Attempt to ford the river was unsuccessful. You lost " + party.getCharacter(temp).getName());
                    } else {
                        temp++;
                        if(temp == party.getNumCharacters());
                            temp = 0;
                    }
                }
                
                //All other characters dead. Player dies. Game over.
                party.getCharacter(temp).setStatus(Status.DEAD);
                
                return "Attempt to ford the river was unsuccessful. You have died. GAME OVER!";
            }
        }
    } //ends caulkRiver method.
} //ends River class.
