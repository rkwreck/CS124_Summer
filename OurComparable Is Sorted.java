//Using interfaces practice 
//returns true if the list is sorted in ascending order 
//i think this works? idk what to do for test cases 

import java.util.List; 

interface OurComparable {
  int compareTo(Object other);
}

public class Sorted implements OurComparable {

    public boolean isSorted(List<OurComparable> myList){
        for (int i = 0; i < myList.size(); i++){
            if (myList.get(i).compareTo(myList.get(i + 1)) > 0){
                return false; 
            }
        }
        return true;
    }
}




