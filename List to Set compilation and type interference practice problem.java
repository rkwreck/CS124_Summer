//converts a list of strings to a set of those strings 
//yay this works !! 
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set; 

class Test {
    
    public static Set<String> toSet(List<String> stringList) {
        assert stringList != null; 
        Set<String> stringSet = new HashSet<>(); 
        for (int i = 0; i < stringList.size(); i++) {
            stringSet.add(stringList.get(i)); 
        } 

        return stringSet; 
    }

    public static void main (String[] args){
        List<String> myList = new ArrayList<>();
        myList.add("test"); 
        myList.add("me");
        myList.add("test"); 
        System.out.println(toSet(myList)); 
    }

}

