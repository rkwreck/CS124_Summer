//(catching) exceptions practice 
//i think this works 

import java.util.Random; 

public class Faulter {
    Random random = new Random();

    public int fault(){
        int someNumber = random.nextInt(101); 
        try {
            if (someNumber > 50 ) {
                return 0;    
            } 
            else {
                int num = Integer.parseInt("false"); 
            }
        } catch (NullPointerException e) {
            return 1; 
        } catch (IllegalArgumentException e) {
            return 2; 
        } catch (IllegalStateException e) {
            return 3; 
        } catch (ArrayIndexOutOfBoundsException e) {
            return 4; 
        } 
    } 
} 

public class Catcher {
    public int catcher(Faulter x){
        return (x.fault());
    }
}