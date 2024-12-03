//exceptions practice problems 

public class Faulter {
    private int value; 
    public int getValue(){
        return value; 
    }
}


public class Catcher {
    public static int retrieveValue(Faulter fault){ 
        try {
            return fault.getValue(); 
        } catch (Exception e) {
            return fault.getValue(); 
        }
        
    }
}