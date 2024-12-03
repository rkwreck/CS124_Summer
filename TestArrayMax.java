//lambda expressions practice

import java.util.Arrays; 

public interface IncludeValue {
    boolean include(int value); 
}

public class ArrayMax implements IncludeValue{
    public int max(int[] intArray, IncludeValue include){
        if (intArray == null || intArray.length == 0 || !(intArray instanceof int[])){
            throw new IllegalArgumentException("Array cannot be null or of length 0"); 
        }
        int max = 0; 
        for (int i = 0; i < intArray.length; i++){
            if (includeValue.include(value)){
                max = intArray[i]; 
            }
        }
        return max; 
    }
}

public class TestArrayMax{
    private int[] intArray; 

    public TestArrayMax(int[] array){
        this.intArray = array; 
    }
    
    public void test(ArrayMax arrayMax){
        arrayMax.new()
        max(arrayMax, v -> arrayMax[i]); 
    }

}