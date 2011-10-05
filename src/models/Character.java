/**
 * Class that represents a character.
 * 
 * @author S.H.L.A.T.
 * @version 0.1 10/03/11
 */
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
 
    public Character(int age, int sex) {
        this.age = age;
        this.sex = sex;
        status = Status.NORMAL;
    }
    
    public Character(int age, int sex, Status status) {
    	this.age = age;
    	this.age = sex;
    	this.status = status;
    }
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
