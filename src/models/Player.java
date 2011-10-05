    /**
 * Class that represents the player.
 * 
 * @author S.H.L.A.T.
 * @version 0.1 10/04/11
 */
public class Player extends Character {
    public Player(int age, int sex, Job job) {
        super(age, sex);
        this.job = job;
    }
    /**
    * Enumerated type which identifies the character's job.
    */
    public enum Job {
        BANKER, FARMER, CARPENTER;
    } //ends Job enum.
    
    private Job job;

    /**
    * Method that gets the job of the character.
    * 
    * @return The job of the character.
    */
    public Job getJob() {
        return job;
    } //ends getJob method.
 
    /**
    * Method that sets the character's job.
    * 
    * @param job The job the character will have. 
    */
    public void setJob(Job job) {
        this.job = job;
    } //ends setJob method.
} //ends Player class.
