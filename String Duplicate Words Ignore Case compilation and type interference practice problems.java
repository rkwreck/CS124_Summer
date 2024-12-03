//yay this works!! 
//return true if any word appears twice in the string. do not use iterated loops
//preferably use set to solve this problem, can use map

import java.util.HashSet;
import java.util.Set; 

class Test {
    
    public static boolean hasDuplicateWords(String words) {
        assert words != null; 
        String[] wordArray = words.split(" ");   //convert the string to an array 
        Set<String> wordSet = new HashSet<>(); 
        for (int i = 0; i < wordArray.length; i++) {
            if (wordSet.contains(wordArray[i].toLowerCase())) {
                return true; 
            }
            else {
                wordSet.add(wordArray[i].toLowerCase()); 
            }
        }
       return false;  //default, found no word that occurs twice
    }

    public static void main (String[] args){
        String myString = "Chuchu chuchu xyz"; 
        //"Chuchu chuchu xyz" 
        //"Wow that is amazing"
        System.out.println(hasDuplicateWords(myString)); 
    }

}

