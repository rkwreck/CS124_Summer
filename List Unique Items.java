//references and polymorphism practice problems
//returns a count of how many of the objects in the list are unique
//yay this works!! 

import java.util.List; 
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;  

public class Unique {

  public int uniqueItems(List<Object> myList) {
    Set<Object> countSet = new HashSet<>(); 
    for (int i = 0; i < myList.size(); i++) {
      countSet.add(myList.get(i)); 
    }
    return countSet.size(); 
  }
}

Unique test1 = new Unique(); 

List<Object> x = new ArrayList<>(); 
x.add(1);
x.add(2);
x.add(4); 

System.out.println(test1.uniqueItems(x)); 

List<Object> y = new ArrayList<>(); 
y.add(2);
y.add(2);
y.add(5); 

System.out.println(test1.uniqueItems(y));  

