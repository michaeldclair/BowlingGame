package ssa;

public class RealBowling {
	
	int i = 1;
	int gamesIn;
	public boolean isStrike = false;
	public boolean wasStrike1 = false;
	public boolean wasStrike2 = false;
	public boolean isSpare = false;
	public boolean wasSpare = false;
	public int firstBowl;
	public int secondBowl;
	public int spareScore;
	public int strikeScore1;
	public int strikeScore2;
	static java.util.Random rnd = new java.util.Random((new java.util.Date()).getTime());
	
	int getPinsKnockedDown() {
		  int randomInt = rnd.nextInt(11); // zero to ten
		  return randomInt;
	}
	
public RealBowling() {
	gamesIn = 3;
}

public RealBowling(int aGamesIn) {
	gamesIn = aGamesIn;
}



//public int middleMan() {
//	int score;
//	score = play();
//	if (isStrike == false) {
//		if (isSpare == false) {
//		return score; }
//		
//	}

//}
	
//public int play() {
//		firstBowl = this.getPinsKnockedDown();
////		System.out.println(firstBowl);
//		
//		if (firstBowl == 10) {
////			return 10;    // Basic method
////			return 15;    // Advanced method
//			isStrike = true;
//			return 10; }
////		else 
////			{
////			int secondBowl = this.getPinsKnockedDown();
//////			if ((firstBowl + secondBowlA) > 10 ) {
//////				secondBowl = (10-firstBowl);
//////			} else {
//////				secondBowl = secondBowlA;
//////			}
//////			
//////			System.out.println(secondBowl);
////		
////			if (firstBowl + secondBowl >= 10)  {
//////				return 10;  // Basic method
//////				return 12;  // Advanced method
////				isSpare = true;
////				return 10;  
////			}else {
////				return firstBowl + secondBowl;}
////
////			}
////}
////

//}else {
//	int secondBowl = this.getPinsKnockedDown();
////	System.out.println(secondBowl);
//	if (firstBowl + secondBowl >= 10)  {
////		return 10;  // Basic method
//		return 12;  // Advanced method 
//	}else 
//		return firstBowl + secondBowl;
//}
//  }


public int play() {
	int firstBowl = this.getPinsKnockedDown();
//	System.out.println(firstBowl);
	
	if (firstBowl == 10) {
//		return 10;    // Basic method
		return 15;    // Advanced method


	}else {
		int secondBowl = this.getPinsKnockedDown();
//		System.out.println(secondBowl);
		if (firstBowl + secondBowl >= 10)  {
//			return 10;  // Basic method
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
			int temporary = play();
			
				//No spares coming in, no strikes coming in
				if (wasStrike1 == false && wasStrike2 == false && wasSpare == false) {
				if (isStrike == false && isSpare == false) {
					game[j] = play();
				}
				if (isStrike = false && isSpare == true) {
					wasSpare = true;
				}
				if (isStrike = true && isSpare == false) {
					wasStrike1 = true;
					wasStrike2 = true;
				}
				} // End of no spare no strike
				
				
				//Spare coming in, no strike
				if (wasStrike1 == false && wasStrike2 == false && wasSpare == true) {
				if (isStrike == false && isSpare == false) {
					int thisScore = play();
					game[j] = thisScore;
					game[j-1] = 10 + firstBowl;
					wasSpare=false;
				}
				if (isStrike = false && isSpare == true) {
					int thisScore = play();
					game[j-1] = 10 + firstBowl;
					wasSpare = true;
				}
				if (isStrike = true && isSpare == false) {
					int thisScore = play();
					game[j-1] = 10 + firstBowl;
					wasStrike1 = true;
					wasStrike2 = true;
				}
			
				
				if (wasStrike1 == true && wasStrike2 == true && wasSpare == false) {
					if (isStrike == false && isSpare == false) {
						int thisScore = play();
						game[j] = thisScore;
						game[j-1] = 10 + firstBowl + ();
						spareScore = 0;
						wasSpare=false;
				}
			
			gameCounter += game[j];
			totalGameCounter += game[j];
			System.out.printf(String.format("%4d", game[j]) + " ");
		}
		System.out.print("     " + String.format("%4d",gameCounter));
		System.out.println(" ");
	}
	System.out.print("Total Series                                                   " + String.format("%4d", totalGameCounter));
}
}
}
}
