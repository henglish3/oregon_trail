/**
 * Class that represents a character.
 * 
 * @author S.H.L.A.T.
 * @version 0.1 10/03/11
 */
 
package edu.gatech.cs2340.shlat.models;
 
public class Character {

    /**
     * Enumerated type which identifies the character's status.
     */
    public enum Status {
        IMMORTAL, NORMAL, SICK, DEAD;
    } //ends Status enum.
 
    private Status status;
    private int age;
    private int sex; //female = 0, male = 1
    private String name;
 
    /**
     * Constructor that make instantiates the character's variables.
     * 
     * @param age The character's age.
     * @param sex The character's sex.
     * @param name The character's name.
     */    
    public Character(int age, int sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
        status = Status.NORMAL;
    } //ends Character constructor.
    
    /**
     * Constructor that make instantiates the character's variables.
     * 
     * @param age The character's age.
     * @param sex The character's sex.
     * @param name The character's name.
     * @param status The character's status.
     */ 
    public Character(int age, int sex, String name, Status status) {
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.status = status;
    } //ends Character constructor.
    
    /**
     * Method that gets the character's status.
     * 
     * @return The status of the character.
     */
    public Status getStatus() {
        return status;
    } //ends getStatus method.
 
    /**
     * Method that sets the character's status.
     * 
     * @param status The status the character will have. 
     */
    public void setStatus(Status status) {
        this.status = status;
    } //ends setStatus method.
    
    /**
     * Method that gets the character's name.
     * 
     * @return The name of the character.
     */
    public String getName() {
        return name;
    } //ends getName method.
 
    /**
     * Method that sets the character's name.
     * 
     * @param name The name the character will have. 
     */
    public void setName(String name) {
        this.name = name;
    } //ends setName method.
  
    /**
     * Method that gets the character's age.
     * 
     * @return The age of the character.
     */
    public int getAge() {
        return age;
    } //ends getAge method.
  
    /**
     * Method that sets the character's age.
     * 
     * @param age The age the character will have. 
     */
    public void setAge(int age) {
        this.age = age;
    } //ends setAge method.
  
    /**
     * Method getSex gets the character's sex.
     * 
     * @return The sex of the character.
     */
    public int getSex() {
        return sex;
    } //ends getSex method.
  
    /**
     * Method that sets the character's sex.
     * 
     * @param sex The sex the character will have. 
     */
    public void setSex(int sex) {
        this.sex = sex;
    } //ends setSex method.
} //ends Character class.
