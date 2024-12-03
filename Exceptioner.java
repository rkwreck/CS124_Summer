//throwing exceptions practice
//yay this works!! 

public class Exceptioner {
  public static void exceptionable(int num) {
    assert (0 <= num && num <= 3) : "The number needs to be between 0 and 3"; 
    if (num == 0) {
      throw new IllegalStateException("Input num is 0");
    } else if (num == 1) {
      throw new NullPointerException("Input num is 1"); 
    } else if (num == 2) {
      throw new ArithmeticException("Input num is 2");
    } else if (num == 3) {
      throw new IllegalArgumentException("Input num is 3"); 
    }
  }
}

int x = -21; 
Exceptioner.exceptionable(x); 
