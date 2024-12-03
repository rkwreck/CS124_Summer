//implementing interfaces practice
//yay this works!! 

// One interface naming convention is to prefix with "I"
public interface IRunningTotal {
  // Return the current total, initially 0
  int currentTotal();

  // Add value to the total
  void add(int value);

  // Subtract value from the total
  void subtract(int value);
}


public class RunningTotal implements IRunningTotal{
    private int count = 0; 
    public int currentTotal(){
        return count; 
    }

    public void add(int value){
        count += value; 
    }

    public void subtract(int value){
        count -= value; 
    }
}

IRunningTotal myCount = new RunningTotal(); 
System.out.println(myCount.currentTotal());  //should return 0 
myCount.add(4);
System.out.println(myCount.currentTotal());  //should return 4 
myCount.subtract(2); 
System.out.println(myCount.currentTotal());  //should return 2 

