//anonymous classes practice
//IT WORKS IT WORKS IT WORKS !! YAY !! 

public interface Bracket {
  int top(); 
  int bottom(); 
}

public class Bracketer implements Bracket {
  private int num; 

  public Bracketer(int number) {
    this.num = number; 
  }

  public static Bracketer create(int x) {
    return new Bracketer(x); 
  }

  public int top() {
    return num;
  }

  public int bottom() {
    return (num * (-1)); 
  }
}

Bracket first = Bracketer.create(-10);
Bracket second = Bracketer.create(5);
System.out.println(first.top()); // prints -10
System.out.println(second.top()); // prints 5
System.out.println(second.bottom()); // prints -5
System.out.println(first.bottom()); // prints 10