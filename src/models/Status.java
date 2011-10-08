public enum Status {
    IMMORTAL("Normal", 0),
    NORMAL("Normal", 1),
    SICK("Sick", 2),
    DEAD("Dead", 3);
    
    private final String statusName;
    private final int statusNumber;
    
    Status(String statusName, int statusNumber) {
        this.statusName = statusName;
        this.statusNumber = statusNumber;
    }
    
    public String getstatusName() {
        return statusName;
    }
    
    public int getstatusNumber() {
        return statusNumber;
    }
    
    public String toString() {
        return "";
    }
}