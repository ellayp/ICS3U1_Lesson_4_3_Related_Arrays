class Practice extends ConsoleProgram {

  /**
  * Program Practive.java outputs player names and corresponding score in a table
  * then finds and outputs the name and score of the player with the highest score.
  * @author: E. Yap
  */

  public void run() {

    // Initialize player and scores arrays
    String [] players = {"Player 1", "Player 2", "Player 3", "Player 4", "Player 5"};
    int [] scores = {1, 2, 3, 4, 5};

    // Output player names and corresponding scores
    for (int i = 0; i < players.length; i++) {
      System.out.println(players[i] + ": " + scores[i]);
    }

    // Initialize variables
    int maxValueIndex = 0;
    int currentMax = scores[0];

    for (int i = 1; i < players.length; i++) {
      if (scores[i] > currentMax) {
        maxValueIndex = i;
        currentMax = scores[i];
      }
    }
    System.out.println ("The max score is: " + currentMax + " and " + players[maxValueIndex] + " has the highest score.");
  }
}
