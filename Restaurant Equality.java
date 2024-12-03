//equality and object copying practice problem
//yay this works!! 

public class Restaurant {
  private String name;
  private String cuisine; 
  private int capcity; 
  Restaurant(String n, String c, int num) {
    assert (n != null) && (c != null) && (num >= 0) 
    : "The name, cuisine, or capcity of the restaurant cannot be null"; 
    this.name = n; 
    this.cuisine = c; 
    this.capcity = num; 
  }
  //@Override; 
  public boolean equals(Object o) {
    assert o != null : "The object cannot be null"; 
    if (o instanceof Restaurant r && r.name.equals(this.name) && r.cuisine.equals(this.cuisine)) {
      return true; 
    }
    return false; 
  }
}


Restaurant r1 = new Restaurant("Chipotle", "Mexican", 24);  
Restaurant r2 = new Restaurant("Curry & More", "Indian", 50); 
Restaurant r3 = new Restaurant("CPK", "American", 100); 
Restaurant r4 = null; 

System.out.println("r1.equals(r2): " + (r1.equals(r2)));
System.out.println("r1.equals(r3): " + (r1.equals(r3)));
System.out.println("r2.equals(r3): " + (r2.equals(r3)));
System.out.println("r1.equals(r4): " + (r1.equals(r4)));