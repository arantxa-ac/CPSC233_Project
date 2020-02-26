package codes;
import java.util.ArrayList;

public class Score {
	private ArrayList<Integer> savedScores;
	
	
	
	public void addScore(int tempScore) {
		savedScores.add(tempScore);
	}
	
	public int getHighestScore() {
		int highestScore = 0;
		for(int i = 0; i < savedScores.size(); i++) {
			if(savedScores.get(i) > highestScore)
				highestScore = savedScores.get(i);
		}
		return highestScore;
	}
	
	public void declareWinner(int highestScore) {
		//Due to the back and forth nature of having two players, the first player's scores will always be saved in the ArrayList with an index that is an even number
		// This means if the index is an odd number, it's player two's score
		//0 is the only exception, but it would be the first score saved, meaning that it will always belong to the first player
		int counter = 0;
		for(int i = 0; i < savedScores.size(); i++)
			if(savedScores.get(i) == highestScore)
				counter++;
		
		if(counter == 1) {
			if(savedScores.indexOf(highestScore)%2 == 0)
				System.out.println("Player one won with a score of: " + highestScore);
			else
				System.out.println("Player two won with a score of: " + highestScore);
		}
		else
			System.out.println("It is a tie with a score of: " + highestScore);
	}
}
