/**
 * Class that keeps track of the party's rations and job.
 * It also keeps track of every member in the party.
 * 
 * @author S.H.L.A.T.
 * @version 0.1 10/01/11
 */
public class Party {
  private int rations;
  public final int MAX_RATIONS = 2000;
  private String job; 
  private member[] members;
  
  /**
   * Method that gets the value of rations.
   * 
   * @return The amount of rations the party has. 
  */
  public int getRations() {
    return rations;
  }
  
  /**
   * Method that sets the value of rations.
   * 
   * @param rations Sets the rations the party has to this value. 
  */
  public void setRations(int rations) {
    this.rations = rations;
  }
    
  /**
   * Method that gets the name of the job.
   * 
   * @return The name of the job the wagon leader has. 
  */
  public String getJob() {
    return job;
  }
  
  /**
   * Method that sets the name of the job.
   * 
   * @param job The name of the job the wagon leader will have. 
  */
  public void setJob(String job) {
    this.job = job;
  }
  
  /**
   * Method that gets the members of the party.
   * 
   * @return The members of the party. 
  */
  public members[] getMembers() {
    return members;
  }
  
  /**
   * Method that sets the changes to the members.
   *
   * @param members The changes the members will have.
   */
  public void setMembers(member[] members) { 
    this.members = members;  
  }

}