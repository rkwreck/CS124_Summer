import java.util.HashMap;
import java.util.Map;

class Test {
    
    public static Map<String, Integer> wordLengths(String sentence) {
        Map<String, Integer> lengths = new HashMap<>();  //creates a new map
        assert sentence != null; 
        for (String word : sentence.split(" ")) {       
             lengths.put(word, word.length());  //add word and its length into the map
     }
     return lengths;
}

    public static void main (String[] args){
        //System.out.println("Main function: "); 
        System.out.println(wordLengths("Wow that is amazing"));

    }

}

