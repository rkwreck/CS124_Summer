//data modeling 2 practice 
//returns the last 4 values that were added in order
//return 0's in place of values if there aren't 4 values yet 
//unsolved !!!!!!!!!

import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;    
import java.util.Map; 
import java.util.HashMap; 

public class Last4 {
    private Map<Integer, Integer> numsMap; 
    private int counter = 0; 


    public void add(int num) {  //add a number to the map 
        numsMap.put(counter, num); 
        counter++; 
    }

    public int[] last() {
    int[] numsArray = new int[4]; 
    int length = 0; 
    if (numsMap.size() >= 0) {
      length = numsMap.size(); //size of the map 
    } 
    if (length > 4) {
      for (int i = 0; i < 4; i++) {
        numsArray[i] = numsMap.get(length - 4);  //if we have more than four values 
      }
    } else {
      for (int i = 0; i < length; i++) {
        numsArray[i] = numsMap.get(i);
      }
      for (int i = numsArray.length; i < 4; i++) {
        numsArray[i] = 0; 
      }
    }
    return numsArray; 
  }

}

Last4 example = new Last4(); 
System.out.println(Arrays.toString(example.last())); //prints [0, 0, 0, 0]
example.add(1); 
System.out.println(Arrays.toString(example.last())); //prints [1, 0, 0, 0]
example.add(2); 
System.out.println(Arrays.toString(example.last())); //prints [1, 2, 0, 0]
example.add(3); 
example.add(4); 
example.add(5);
System.out.println(Arrays.toString(example.last())); //prints [2, 3, 4, 5]


/*public int[] last() {
        //array only method
        //returns an array containing the last 8 values that were added, in static order
        //if there are not 8 values in the map then return 0's in their place 
        int[] numsArray = new int[4]; 
        int lastNum = numsMap.size();  //size of the map 
        
        for (int i = 4; i < -1; i--) {
            if (lastNum - 1 - i < 0) {   //if we ran out of values (map has less than 8 values)
                numsArray[4-i] = 0; 
            } else {
                numsArray[4-i] = numsMap.get(lastNum - 1 - i); //otherwise keep adding from the map 
            }
        }
        return numsArray; 
    } */


/*public int[] last() {
        //int[] numsArray = new int[8]; 
        List<Integer> numsList = new ArrayList<>(); 
        int lastNum = numsMap.size();

        for (int i = 0; i < 8; i++){
            if (lastNum - 1 - i < 0) {
                numsList.add(0); 
            } else {
                numsList.add(numsMap.get(lastNum - 1 - i)); 
            }
        }

        //shuffle the list
        Collections.shuffle(numsList); 

        //convert list to array
        int[] numsArray = new int[8]; 
        for (int i = 0; i < numsList.size(); i++){
            numsArray[i] = numsList.get(i); 
        }

        return numsArray; 
    }*/ 

