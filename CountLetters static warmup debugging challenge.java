//returns counts based on the first letter 
//fix this majorly 

import java.util.Map; 
import java.util.HashMap; 

public class CountLetters {
    public static Map<String, Integer> countLetters(String[] words) {
        Map<String, Integer> letters = new HashMap<>(); 
        for (int i = 0; i < words.length; i++) {
            int counter = 0; 
            if (letters.get(words[i]) != null) {  //if the letter is not already in the map
                for (int j = 0; j < words.length; j++) {
                    if (words[j].equals(words[i])) {  
                        counter++;  
                    }
                letters.put(words[i], counter); 
                }
            }   
        }
        return 
    }
 
}

/*public class Math {
    public static int add(int x, int y) {
        return (x + y); 
    }
}*/