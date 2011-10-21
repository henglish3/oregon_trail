/**
 * Class that represents the wagon's party. It holds all the characters except the player into an array
 * 
 * @author S.H.L.A.T.
 * @version 0.3 10/16/11
 */

package edu.gatech.cs2340.shlat.models;
import java.awt.event.*;
import java.awt.EventQueue;
import edu.gatech.cs2340.shlat.models.Character;
public class Party {
    private Character[] characters;
    
    /**
     * Constructor that assigns the four characters to the party.
     * The player is not added to the party.
     * 
     * @param char0 The first character in the party.
     * @param char1 The second character in the party.
     * @param char2 The thrid character in the party.
     * @param char3 The fourth character in the party.
     */
    public Party(Character char0, Character char1, Character char2, Character char3) {
        characters = new Character[4];
        characters[0] = char0;
        characters[1] = char1;
        characters[2] = char2;
        characters[3] = char3;
    } //ends Party constructor.
    
    /**
     * Method that gets the characters in the party.
     * 
     * @return The characters in the party.
     */
    public Character[] getCharacters() {
        return characters;
    } //ends getCharacters method.
    
    /**
     * Method that sets the characters in the party.
     * 
     * @param characters The characters in the party.
     */
    public void setCharacters(Character characters[]) {
        this.characters = characters;
    } //ends setCharacters method.
    
    /**
     * Method that gets a certain character's status in the party.
     * 
     * @return The character's status.
     */
    public Status getCharacterStatus(int charNum) {
        return characters[charNum].getStatus();
    } //ends getCharacterStatus method.

    /**
     * Method that sets a certain character's status in the party.
     * 
     * @param charNum The character who's status will change.
     * @param statChange The status the character will now have.
     */
    public void setCharacterStatus(int charNum, Status statChange) {
        characters[charNum].setStatus(statChange);
    } //ends setCharacterStatus method.
    
    /**
     * Listener class implements ActionListener.
     */
    private class Listener implements ActionListener {
        
        /**
         * Method...
         * 
         * @param e The event being taken by the method.
         */
        public void actionPerformed(ActionEvent e) {
            //if(e.getSource() == ???)
        } //ends actionPerformed method.
    } //ends Listener class.
} //ends Party class.
    

    