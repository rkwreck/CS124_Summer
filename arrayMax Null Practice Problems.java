//yay this works! 
class Test {
    
    public static double arrayMax(double[] numbers) {
        double max = 0.0;   //max value
        if (numbers == null || numbers.length == 0) {   //check that we don't have a null problem
            return max; 
        }
        for (int i = 0; i < numbers.length; i++) {  //iterate through array  
            if (numbers[i] > max) {   //if we found a new maximum then store it 
                max = numbers[i]; 
            }
        }
        return max; 
    }

    public static void main (String[] args){
        //double[] myArray = {0.0, 0.1, 10.5, 10.6, 100.8, 0.3, 4.4, 7.77, 100.8}; 
        double[] myArray = {0};
        System.out.println(arrayMax(myArray)); 
    }

}

