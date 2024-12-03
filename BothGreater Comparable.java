//practice with interfaces practice

//the <BothGreater> type parameter lets us pass the type parameter BothGreater 
//to the compareTo method later

//yay this works!! 

public class BothGreater implements Comparable<BothGreater> {  
  private int numOne; 
  private int numTwo; 

  public BothGreater(int one, int two) {
    numOne = one;
    numTwo = two; 
  }

  public int compareTo(BothGreater x) {  
    if (this.numOne > x.numOne && this.numTwo > x.numTwo) {
      return 1; 
    } else if (this.numOne < x.numOne && this.numTwo < x.numTwo) {
      return -1;
    } else {
      return 0; 
    }
  }
}

BothGreater first = new BothGreater(3, 4); 
BothGreater greater = new BothGreater(6, 6);
BothGreater same = new BothGreater(3, 4);  
BothGreater lesser = new BothGreater(1, 2); 

System.out.println(first.compareTo(greater)); //should return -1 
System.out.println(first.compareTo(same)); //should return 0 
System.out.println(first.compareTo(lesser)); //should return 1