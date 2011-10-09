public class Wagon {
    
    //private Inventory inventory = new Inventory();
    private boolean wheel;
    private boolean axle;
    private boolean tongue;
    private boolean yoke;
    
    public Wagon() {
        wheel = true;
        axle = true;
        tongue = true;
        yoke = false; //player needs to buy it
    } //ends Wagon constructor.
    
    //alwayr run this method when player clicks to move.
    public void checkWagon() {
        if(wheel == true && axle == true && tongue == true && yoke == true) {
            //run method that allows wagon to move. 
            //we could also add weight check, food check and ability to drop/sell items anywhere.
        }
        else if(wheel == false) {
            System.out.println("A wheel on your Wagon is broken and needs repairs.");
        }
        else if(axle == false) {
            System.out.println("An axle on your Wagon is broken and needs repairs.");
        }
        else if(tongue == false) {
            System.out.println("The tongue on your Wagon is broken and needs repairs.");
        }
        else {
            System.out.println("You need a yoke to move the wagon.");
        }   
    } //ends checkWagon method.
} //ends Wagon class.