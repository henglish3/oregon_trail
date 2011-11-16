/**
 * Class that represents the wagon's party. It holds all the characters except the player into an array
 * 
 * @author S.H.L.A.T.
 * @version 0.3 10/16/11
 */

package edu.gatech.cs2340.shlat.models;

import java.awt.event.*;
import java.awt.EventQueue;
import java.io.Serializable;

public class Party implements Serializable {
    private Character[] characters;

    public Party() {}
    
    /**
     * Constructor that assigns the four characters to the party.
     * The player is not added to the party.
     * 
     * @param char0 The first character in the party.
     * @param char1 The second character in the party.
     * @param char2 The thrid character in the party.
     * @param char3 The fourth character in the party.
     */
    public Party(Player char0, Character char1, Character char2, Character char3) {
        characters = new Character[4];
        characters[0] = (Character)char0;
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
     * Method that gets a character based on index
     * 
     * @param index The index of the character to get. 0 is the player
     * @return The characters in the party.
     */
    public Character getCharacter(int index) {
        return characters[index];
    } //ends getCharacters method.
    
    /**
     * Method that gets the player character
     * 
     * @return The characters in the party.
     */
    public Player getPlayer() {
        return (Player)characters[0];
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
     * @param charNum The character who's status will be read.
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
     * Method that gets a certain character's name in the party.
     * 
     * @param charNum The character who's name will be read.
     * @return The character's name.
     */
    public String getCharacterName(int charNum) {
        return characters[charNum].getName();
    } //ends getCharacterName method.

    /**
     * Method that sets a certain character's name in the party.
     * 
     * @param charNum The character who's sname will change.
     * @param nameChange The name the character will now have.
     */
    public void setCharacterName(int charNum, String nameChange) {
        characters[charNum].setName(nameChange);
    } //ends setNameStatus method.
    
    /**
     * Method that gets a certain character's age in the party.
     * 
     * @param charNum The character who's age will be read.
     * @return The character's age.
     */
    public int getCharacterAge(int charNum) {
        return characters[charNum].getAge();
    } //ends getCharacterAge method.
    
    /**
     * Gets the number of characters in the party
     *
     * @return number of characters in the party
     */
    public int getNumCharacters() {
        return 4;
    }

    /**
     * Method that sets a certain character's age in the party.
     * 
     * @param charNum The character who's age will change.
     * @param ageChange The age the character will now have.
     */
    public void setCharacterAge(int charNum, int ageChange) {
        characters[charNum].setAge(ageChange);
    } //ends setCharacterAge method.
} //ends Party class.
