import java.awt.Rectangle;
//The Main class of the project that calls on all other classes and actually runs the main game
public class Game {
	//First import needed objects
	Player playerOne = new Player();
	Player playerTwo = new Player();
	
	Score playerScore = new Score();
	
	//TODO: Need to determine the optimal hitbox (should be measured w/ pixels?)
	final int hitboxLength = 0;
	final int hitBoxWidth = 0;
	//TODO: plug in four variables later - x,y, (the coordinates of the upper left corner), width, height (of hitbox)
	Rectangle playerHitbox = new Rectangle();
	
	//TODO: Might need to make hitbox generation/tracker its own methods 
	public void collision(Player runner, Rectangle playerHitbox) {
		
	}
	
	//collision detection needed to set up the conditional of the runner game 
	public void runGame(Player runner) {
		//Start only when the user starts inputting right keys (up, down, space?)
		while() {
			//Generate obstacles every time?
			//run through frame
			//Increase score 
			//print out score
		}
		
		System.out.println("Game Over");
		System.out.println("Score: " + playerScore.getCurrentScore);
	}
	
	public static void main(String[] args) {
		runGame(playerOne);
		System.out.println("Starting Player Two in:");
		System.out.println("3...");
		System.out.println("2...");
		System.out.println("1...");
		runGame(playerTwo);
		
		//First player's score is higher than the second
		// TODO: Score method change --> make more efficient later
		if(playerScore.getPlayerOneScore > playerScore.getPlayerTwoScore)
			System.out.println("Player one won with a score of: " + playerScore.getPlayerOneScore);
		//Second player's score is higher
		else if(playerScore.getPlayerOneScore < playerScore.getPlayerTwoScore)
			System.out.println("Player two won with a score of: " + playerScore.getPlayerTwoScore);
		//Both got the same score 
		else
			System.out.println("Its a tie with the score: " + playerScore.getPlayerOneScore);
	}
}

