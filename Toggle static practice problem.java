//yay this works!! 
//static practice problem

public class Toggler {
  boolean initial; 

  public Toggler(boolean x) {
    this.initial = x; 
  }

  public boolean toggle() {
    if (initial) {
      initial = false; 
      return initial; 
    } else {
      initial = true; 
      return initial; 
    }
  }
}

Toggler first = new Toggler(true);
System.out.println(first.toggle()); //prints false
System.out.println(first.toggle()); //prints true
System.out.println(first.toggle()); //prints false

Toggler second = new Toggler(false);
System.out.println(second.toggle()); //prints true
System.out.println(second.toggle()); //prints false
System.out.println(second.toggle()); //prints true
