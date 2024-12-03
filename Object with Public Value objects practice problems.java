//given a passed instance of an Example, return that Examples value property, which is an int.
//yay this works (in cs 124 playground)
class Example {
    int value; 
}

class Test {
    
    public static int getExampleValue(Example object) {
        assert object != null; 
        return object.value; 
    }

    public static void main (String[] args){
        Example myPerson = new Example(); 
        myPerson.value = 5; 
        System.out.println(getExampleValue(myPerson));  
    }

}
