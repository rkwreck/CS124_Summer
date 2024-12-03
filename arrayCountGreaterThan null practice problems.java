 //yay this works!! 
 //counts how many values in the array are strictly greater than the second parameter

 class Test {
    
    public static int arrayCountGreaterThan(int[] numbers, int value) {
        assert numbers != null;  //asserting that the passed array isn't null
        int counter = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > value) {  //count how many values in array are greater 
                counter++;
            }
        }
        return counter; 
    
    }

    public static void main (String[] args){
        int[] myArray = {}; 
        System.out.println(arrayCountGreaterThan(myArray, 5)); 
    }

}

