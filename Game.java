import java.awt.Rectangle;
//The Main class of the project that calls on all other classes and actually runs the main game
public class Game {
	//First import needed objects
	public Player playerOne = new Player();
	public Player playerTwo = new Player();
	
	public Score playerScore = new Score();
	
	//TODO: Need to determine the optimal hitbox (should be measured w/ pixels?)
	public final int hitboxLength = 0;
	public final int hitboxWidth = 0;
	//TODO: plug in four variables later - x,y, (the coordinates of the upper left corner), width, height (of hitbox)
	
	//determines if the player hits an obstacle -> collision detection using the java Rectangle library 
	public boolean collision(int playerX, int playerY, int obstacleX, int obstacleY) {
		//Rectangle(x coordinate of upper left corner of rectangle, y coordinate of upper left corner, width of rectangle, length of rectangle)
		Rectangle playerHitbox = new Rectangle(playerX, playerY, hitboxWidth, hitboxLength);
		Rectangle obstacleHitbox = new Rectangle(obstacleX, obstacleY, hitboxWidth, hitboxLength);
		//boolean -> true if they intersect
		return playerHitbox.intersects(obstacleHitbox);
	}
	
	//collision detection needed to set up the conditional of the runner game 
	public void runGame(Player runner) {
		Obstacle obstruction = new Obstacle();
		// it runs until there is a collision detected
		//TODO: figure out Score
		while(!(collision(runner.getX(), runner.getY(), obstruction.getX(), obstruction.getY()))) {
			//if there is a jump input, then jump
			if(runner.getJumpInput())
				runner.jump();
			//else if so there can't be a simultaneous state of jumping and ducking
			else if(runner.getDuckInput())
				runner.duck();
			//generate and change the obstacle once the obstacle is behind the runner so the obstacle constantly gets updated
				//RIGHT NOW THIS MEANS YOU CAN ONLY GENERATE ONE NEW OBSTACLE PER FRAME
			if(obstruction.getX() < runner.getX())
				obstruction = obstruction.generateObstacle();
			//moves the obstacle one pixel closer to the character each frame 
			//TODO: Switch the 1 to a better integer later
			else
				obstruction.setX(obstruction.getX() - 1);
			//change frames here ideally - demo 2
		}
		
		System.out.println("Hit an obstacle!");
		System.out.println("Game Over");
		System.out.println("Score: " + playerScore.getCurrentScore);
	}
	
	public static void main(String[] args) {
		//Start only when the user starts inputting right keys (up, down, space?)
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
