//practice with interfaces practice
//yay this works!! 

public class MyString implements Comparable<MyString> {
  private String theString; 

  public MyString(String s) {
    assert (s != null) : "The string cannot be null"; 
    this.theString = s; 
  }

  //given: string passed to compareTo will not be null
  public int compareTo(MyString s) {
    if (this.theString.length() > s.theString.length()) {
      return 1; 
    } else if (this.theString.length() < s.theString.length()) {
      return -1; 
    } else {
      return 0; 
    }
  }
}

MyString xyz = new MyString("xyz"); 
MyString x = new MyString("z"); 
System.out.println(xyz.compareTo(x));  //should print 1 

MyString abc = new MyString("abc"); 
System.out.println(xyz.compareTo(abc)); //should print 0 

MyString abcd = new MyString("abcd"); 
System.out.println(xyz.compareTo(abcd)); //should print -1