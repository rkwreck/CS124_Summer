 //yay this works !! 
 //returns the sum of the values in the array as a double 

 class Test {
    
    public static double arraySum(double[][] values) {
        double sum = 0.0; 
        if (values == null){
            return 0; 
        }
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                sum += values[i][j]; 
            }
        }
        return sum; 
    }

    public static void main (String[] args){
        double[][] myArray = {{0.0}, {0.1}, {0.2}, {0.3}, {0.4}}; 
        System.out.println(arraySum(myArray)); 
    }

}

