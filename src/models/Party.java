/**
 * Class that represents the wagon's party. It holds all the characters except the player into an array
 * 
 * @author S.H.L.A.T.
 * @version 0.3 10/16/11
 */

package edu.gatech.cs2340.shlat.models;
import java.awt.event.*;
import java.awt.EventQueue;

public class Party {
    private Character[] characters;
    
    /*
     * Constructor that assigns the size of the party and adds the characters to the party. 
     * The player is not added to the party.
     * 
     * @param charAmount The amount of characters that will be in the party.
     * @param char0 The first character in the party.
     * @param char1 The second character in the party.
     * @param char2 The thrid character in the party.
     * @param char3 The fourth character in the party.
     *
    public Party(int charAmount, Character char0, Character char1, Character char2, Character char3) {
        characters = new Character[charAmount];
        int i = 0;
        if(i < characters.length) {
            characters[i] = char0;
            i++;
        }
        if(i < characters.length) {
            characters[i] = char1;
            i++;
        }
        if(i < characters.length) {
            characters[i] = char2;
            i++;
        }
        if(i < characters.length) {
            characters[i] = char3;
            i++;
        }
    } //ends Party constructor.
    */
    
    /**
     * Constructor that assigns the size of the party and adds the characters to the party. 
     * The player is not added to the party.
     * 
     * @param characters The characters that will be added to the characters array.
     */
    public Party(Character ... characters) {
        this.characters = new Character[characters.length];
        for (int i = 0; i < characters.length; i++) {
            this.characters[i] = characters[i];
        }
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
     * Listener class implements ActionListener.
     */
    private class Listener implements ActionListener {
        
        /**
         * actionPerformed method...
         * 
         * @param e The event being taken by the method.
         */
        public void actionPerformed(ActionEvent e) {
            //if(e.getSource() == ???)
        } //ends actionPerformed method.
    } //ends Listener class.
} //ends Party class.
    

    