//inheritance practice problems
//yay this works!! 

public class ScoreTracker {
  private int player1Score = 0; 
  private int player2Score = 0; 

  private int player1Counter = 0; 
  private int player2Counter = 0; 

  private int getTurn() { 
    //keep track of whose turn it is. player 1 always goes first. 
    if (player1Counter == player2Counter) {
      player1Counter += 1; 
      return 1; // it is player 1's turn
    }
    player2Counter += 1; // it is player 2's turn 
    return 2; 
  }

  public int score(int points) {
    //add the points to the player's points 
    if (this.getTurn() == 1) {      //if it's player 1's turn
      player1Score += points;
      return player1Score;
    }
    player2Score += points; 
    return player2Score; 
  }

  public int currentlyAhead() {  //tells you who is ahead in the game 
    if (player1Score > player2Score) {
      return 1;
    } else if (player2Score > player1Score) {
      return 2;
    }
    return 0;  //if it's a tie 
  }

}

ScoreTracker first = new ScoreTracker(); 
System.out.println(first.currentlyAhead()); //prints 0 since both players start with 0
first.score(10);
System.out.println(first.currentlyAhead()); //prints 1
first.score(20); 
System.out.println(first.currentlyAhead()); //prints 2
first.score(10); 
System.out.println(first.currentlyAhead()); //prints 0

ScoreTracker second = new ScoreTracker();
second.score(-10);
System.out.println(second.currentlyAhead()); //prints 2
System.out.println(first.currentlyAhead()); //prints 0