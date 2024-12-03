//throwing exceptions practice
//unchecked error = unrecoverable condition or programming error 
//yay this works !! 

public class PartyTooLarge extends RuntimeException { //extending RunTimeException b/c it's an unchecked error 
  private static final long serialVersionUID = 1L; 
  public PartyTooLarge() {
    super("The party size is too large now"); 
  }
}

public class CapacityManager {
  private int capacity;  //abstract number that the restaurant can hold
  private int numGuests = 0;  //actual number of people in the restaurant for this instance

  public CapacityManager(int cap) {
    this.capacity = cap;  //set the capacity
  }

  public int enter(int num) throws Exception {
    if (num <= 0) {  //if you don't add ppl, which doesn'tmake sense 
      throw new IllegalArgumentException("The number of guests must be greater than 0"); 
    } else if (num > 8) {  
      throw new PartyTooLarge(); 
    } else if ((numGuests + num) > capacity) {  //if you exceed the capacity of the restaurant
      throw new IllegalStateException("The restaurant's capcity has been exceeded"); 
    } 
    this.numGuests += num; 
    return this.numGuests; 
  }

  public int leave(int num) throws Exception {
    if (numGuests - num <= 0 || num > 8) {
      throw new IllegalStateException("The restaurant has already reached its minimum number of diners.");
    }
    numGuests -= num; 
    return numGuests; 
  }
}

CapacityManager capacityManager = new CapacityManager(14);
System.out.println(capacityManager.enter(8)); // prints 8, WORKS
System.out.println(capacityManager.enter(-1)); // throws IllegalArgumentException WORKS
System.out.println(capacityManager.enter(8)); // throws IllegalStateException WORKS
System.out.println(capacityManager.leave(4)); // prints 4 WORKS
System.out.println(capacityManager.leave(6)); // throws IllegalStateException WORKS
System.out.println(capacityManager.enter(8)); // prints 12 WORKS
System.out.println(capacityManager.leave(10)); // throws IllegalStateException WORKS
System.out.println(capacityManager.enter(10)); // throws PartyTooLarge WORKS
