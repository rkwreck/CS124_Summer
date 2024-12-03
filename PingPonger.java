//working with exceptions practice
//YAY THIS WORKS !! i am awesomesauce 

public class PingPonger {
  //private boolean tracker; 
  private int pongCounter; 
  private int pingCounter; 
  private String state; 

  public PingPonger(String s) {
    if (s.equalsIgnoreCase("ping") || s.equalsIgnoreCase("pong")) {
      this.state = s; 
    } else {
      throw new IllegalArgumentException("The input must be 'ping' or 'pong'."); 
    }
  }

  public boolean ping() {
    pingCounter += 1; 
    if (pingCounter + 2 == pongCounter || pongCounter + 2 == pingCounter) {
      throw new IllegalStateException("You have called ping out of order"); 
    }
    return true; 
  }

  public boolean pong() {
    pongCounter += 1; 
    pingCounter += 1; 
    if (pingCounter + 2 == pongCounter || pongCounter + 2 == pingCounter) { 
      throw new IllegalStateException("You have called ping out of order"); 
    }
    return false; 
  }
}

PingPonger first = new PingPonger("ping"); // starts as ping
first.pong(); // returns false
first.ping(); // return true
first.ping(); // throws IllegalStateException 

PingPonger second = new PingPonger("pong"); // starts as pong
second.ping(); // returns true
second.ping(); // throws IllegalStateException

PingPonger third = new PingPonger("whoops"); // throws IllegalArgumentException