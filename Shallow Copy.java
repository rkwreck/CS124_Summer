//References & Polymorphism practice
//return a shallow copy of the passed array 
//shallow copy = the returned array contains REFERENCES to the objects in the passed/original array
//yay this works!

public class Copier {
  private int num; 
  Copier(int number) {
    num = number; 
  }

  public static Object[] copy(Object[] original) {
    Object[] copied = new Object[original.length]; 
    for (int i = 0; i < original.length; i++) {
      copied[i] = original[i]; 
    }
    for (int i = 0; i < copied.length; i++) {
      System.out.println("This is copied --> " + copied[i]); 
    }
    return copied; 
  }
}


Copier[] myArray = new Copier[4];
myArray[0] = new Copier(0);
myArray[1] = new Copier(1);
myArray[2] = new Copier(2);
myArray[3] = new Copier(3);

Copier.copy(myArray); 

