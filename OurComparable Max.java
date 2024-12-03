//using interfaces practice
//idk 

interface OurComparable {
    int compareTo(Object other); 
}

public class Max implements OurComparable {
    //private Object max; 
    
    public OurComparable max(OurComparable[] items){
        //initialize the maximum
        OurComparable maximum = items[0]; 
        
        assert (items != null || items.length == 0): "The array cannot be null or empty"; 
        
        for (int i = 0; i < items.length; i++){
            if (items[i].compareTo(maximum) > 0){
                maximum = items[i]; 
            }
        }
        return maximum; 
    }
    //public int compareTo(Object thing){ }
}

Max test = new Max(); 

OurComparable[] myArray = new OurComparable[4]; 
myArray[0] = 3;
myArray[1] = 4;
myArray[2] = 3;
myArray[3] = 10; 

System.out.println(test.max(myArray)); 