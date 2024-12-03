//polymorphism practice problems
//yay this works!! 

public class Restaurant {
  private String name; 
  public void setName(String x) {
    this.name = x; 
  }
  public String getName() {
    return name; 
  }
}

public class Fancy extends Restaurant {}

public class FastFood extends Restaurant {}

public class Vegan extends Restaurant {
  private String cuisine;
  public void setCuisine(String x) {
    this.cuisine = x; 
  }
  public String getCuisine() {
    return cuisine; 
  }
}

public class Orderer {
  public String order(Restaurant rest) {
    if (rest instanceof Fancy fancy) {
      return ("At " +  fancy.getName() + " I'll order something inexpensive."); 
    } else if (rest instanceof FastFood fast) {
      return ("At " +  fast.getName() + " I'll order something healthy."); 
    } else if (rest instanceof Vegan vegan) {
      return ("At " +  vegan.getName() + " I'll order delicious " + vegan.getCuisine()); 
    }
    return null; 
  }
}

Fancy r = new Fancy(); 
r.setName("MIGA"); 

FastFood f = new FastFood(); 
f.setName("Chipotle"); 

Vegan v = new Vegan(); 
v.setName("Vegan Delight"); 
v.setCuisine("Thai"); 

Orderer h = new Orderer(); 

System.out.println(h.order(r)); 
System.out.println(h.order(f)); 
System.out.println(h.order(v)); 