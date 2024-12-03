//anonymous classes practice

//IT WORKS IT WORKS I FINALLY MADE IT WORK 

public interface IBothWays {
  // Return the String in forward order
  String forward();
  // Return the String in reverse order
  String backward();
}

public class BothWays implements IBothWays {
  private String thisString; 

  public BothWays(String s) {
    thisString = s; 
  }
    
  public static BothWays create(String s) {
    if (s == null) {
      throw new IllegalArgumentException("The passed string cannot be null"); 
    }
    return new BothWays(s); 
  } 

  public String forward() {
    return thisString; 
  }

  public String backward() {
    char[] stringArray = thisString.toCharArray(); 
    String newStr = ""; 
    for (int i = stringArray.length - 1; i >= 0; i--) {
      newStr += stringArray[i]; 
    }
    return newStr; 
  }
}




IBothWays first = BothWays.create("gracie");
IBothWays second = BothWays.create("chuchu");
System.out.println(first.forward()); // prints gracie
System.out.println(second.forward()); // prints chuchu
System.out.println(second.backward()); // prints uhcuhc
System.out.println(first.backward()); // prints eicarg