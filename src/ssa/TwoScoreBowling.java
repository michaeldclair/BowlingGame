package ssa;

public class TwoScoreBowling {
	
	int i = 1;
	int gamesIn;
	public int firstBowl;
	public int secondBowl;
	public boolean isStrike = false;
	public boolean isSpare = false;
	static java.util.Random rnd = new java.util.Random((new java.util.Date()).getTime());
	
	int getPinsKnockedDown() {
		  int randomInt = rnd.nextInt(11); // zero to ten
		  return randomInt;
	}
	
public TwoScoreBowling() {
	gamesIn = 3;
}

public TwoScoreBowling(int aGamesIn) {
	gamesIn = aGamesIn;
}


public int play() {
		firstBowl = this.getPinsKnockedDown();
//		System.out.println(firstBowl);
		
		if (firstBowl == 10) {
//			return 10;    // Basic method
			return 15;    // Advanced method


		}else {
			secondBowl = this.getPinsKnockedDown();
//			System.out.println(secondBowl);
			if (firstBowl + secondBowl >= 10)  {
//				return 10;  // Basic method
				return 12;  // Advanced method 
			}else 
				return firstBowl + secondBowl;
		}
		  }
		
	

public void bowl(){
	System.out.println("Frames     1    2    3    4    5    6    7    8    9   10     Total");
	int[][] bowlingScores = new int[gamesIn][10];
	int totalGameCounter = 0;
	for (int[] game : bowlingScores) {
		System.out.print("Game" + String.format("%3d",i) + " ");
		i++;
		int gameCounter = 0;
		for (int j=0; j<game.length; j++){
				game[j] = play();
			gameCounter += game[j];
			totalGameCounter += game[j];
			System.out.printf(String.format("%4d", game[j]) + " (" + firstBowl + " + " + secondBowl + ")");

		}
		System.out.print("     " + String.format("%4d",gameCounter));
		System.out.println(" ");
	}
	System.out.print("Total Series                                                   " + String.format("%4d", totalGameCounter));
}
}

