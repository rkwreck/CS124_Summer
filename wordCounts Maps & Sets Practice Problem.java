import java.util.HashMap;
import java.util.Map; 

class Test {
    public static Map<String, Integer> wordCounts(String sentence) {
        Map<String, Integer> occurences = new HashMap<>();  
        String[] parts = sentence.split("_");  //create an array of all the words in sentence
        for(int i = 0; i < parts.length; i++) { // for each item in parts
            int counter = 0;    //number of times the word occurs in the sentence 
            for (int j = 0; j < parts.length; j++) { //compare one word in sentence with all other words
                if (parts[i].equals(parts[j])){
                    counter++;     //if there's a match then increase the counter
                }
            }
            occurences.put(parts[i], counter); 
        } 
        return occurences;       
    }

    public static void main (String[] args) {
        System.out.println(wordCounts("Xyz_Chuchu_Chuchu_Xyz_Ferdie"));
    }

}