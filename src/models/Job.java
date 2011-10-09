public enum Job {
    BANKER("Banker", 0),
    CARPENTER("Carpenter", 1),
    FARMER("Farmer", 2);
    
    private final String jobName;
    private final int jobNumber;
    
    Job(String jobName, int jobNumber) {
        this.jobName = jobName;
        this.jobNumber = jobNumber;
    }
    
    public String getJobName() {
        return jobName;
    }
    
    public int getJobNumber() {
        return jobNumber;
    }
    
    public String toString() {
        return "";
    }
}