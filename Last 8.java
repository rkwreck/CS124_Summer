//data modeling 2 practice 
//returns the last 8 values that were added in any order
//YAY THIS WORKS FINALLY MY BLOOD SWEAT AND TEARS 

import java.util.Arrays;
import java.util.Collections;
import java.util.List;    
import java.util.Map; 
import java.util.HashMap; 

public class Last8 {
    private Map<Integer, Integer> numsMap; 
    private int counter = 0;  // ~ magic number

    public Last8() {
        numsMap = new HashMap<>(); //create the map
    }

    public void add(int num) {  //add a number to the map 
        numsMap.put(counter, num); 
        counter++; 
    }

    public int[] last() {
        //int[] numsArray = new int[8]; 
        List<Integer> numsList = new ArrayList<>(); 
        int lastNum = numsMap.size();

        for (int i = 0; i < 8; i++){
            if (lastNum - 1 - i < 0) {  //if we ran out of values (map doesn't have 8 values)
                numsList.add(0); 
            } else {
                numsList.add(numsMap.get(lastNum - 1 - i));  //otherwise keep eating from the map
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
    }
 
}

Last8 example = new Last8(); 
System.out.println(Arrays.toString(example.last())); //prints [0, 0, 0, 0, 0, 0, 0, 0]
example.add(1); 
System.out.println(Arrays.toString(example.last())); //prints [1, 0, 0, 0, 0, 0, 0, 0] in some order
example.add(8); 
System.out.println(Arrays.toString(example.last())); //prints [8, 1, 0, 0, 0, 0, 0, 0] in some order



