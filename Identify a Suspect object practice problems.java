//yay this works!! 
//return the list of suspects as a Set<String>. a person is a suspect if their name appears in at least two parameters 

import java.util.ArrayList; 
import java.util.HashSet;
import java.util.Set; 

class Test {
    
    public static Set<String> calculateSuspects(Set<String> names1, Set<String> names2, Set<String> names3) {
        Set<String> suspects = new HashSet<>(); 

        ArrayList<String> oneAndTwo = new ArrayList<>(); 
        oneAndTwo.addAll(names1);
        oneAndTwo.retainAll(names2);
        suspects.addAll(oneAndTwo);  //keeping only the names common between the first two lists 

        ArrayList<String> oneAndThree = new ArrayList<>();
        oneAndThree.addAll(names1); 
        oneAndThree.retainAll(names3); 
        suspects.addAll(oneAndThree);  //keeping only the names common between the first and third list 

        ArrayList<String> twoAndThree = new ArrayList<>(); 
        twoAndThree.addAll(names2);
        twoAndThree.retainAll(names3); 
        suspects.addAll(twoAndThree);  //keeping only the names common between the second and third list 

        return suspects; 
    }

    public static void main (String[] args){
        Set<String> myOne = new HashSet<>();  
        Set<String> myTwo = new HashSet<>();
        Set<String> myThree = new HashSet<>(); 
        myOne.add("rini"); 
        myOne.add("d"); 
        myTwo.add("priya"); 
        myTwo.add("d"); 
        myThree.add("priya"); 
        myThree.add("rini"); 
        myThree.add("deepak"); 
        System.out.println(calculateSuspects(myOne, myTwo, myThree)); 
        
    }
}