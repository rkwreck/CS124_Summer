//polymorphism practice problems
//greet person differentlyd epending on what kind of person it is 
//yay this works 

public class Person {    //parent class 
  private String name; 
  public String getName() {  //retrive the person's name 
    return this.name;  
  }
  public void setName(String x) {
    name = x; 
  }
}

public class Professor extends Person {}

public class Student extends Person {} 

public class Staff extends Person {
  private String role; 
  public String getRole() {
    return role; 
  } 
}

public class Greeter {
  public String greet(Person indiv) {
    if (indiv instanceof Professor) {
      return ("Hi " + indiv.getName());
      
    } else if (indiv instanceof Student) {
      return ("Hey " + indiv.getName() + " you are not alone!");
      
    } else if (indiv instanceof Staff worker) {
      return ("Thanks " + worker.getName() + " for all your help with " + worker.getRole()); 
      
    } else {
      return null; 
    }
  }
}


Professor g = new Professor(); 
g.setName("Geoff"); 

Student r = new Student();
r.setName("Rini"); 

Staff c = new Staff();
c.setName("Chu"); 
Greeter h = new Greeter(); 

System.out.println(h.greet(g)); 
System.out.println(h.greet(r)); 
System.out.println(h.greet(c)); 