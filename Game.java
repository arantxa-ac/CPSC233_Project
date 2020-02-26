import java.awt.Rectangle;
import java.util.ArrayList;

public class Demo1Game {
	//First import needed objects
	Player runner = new Player();	
	
	public void runGame(Player runner) {
		Obstacle obstruction = new Obstacle();
		ArrayList<String> textDemo = new ArrayList<String>(10);
		textDemo.add(0, "p");
		
		for(int i = 1; i <= textDemo.size();i++)
			textDemo.add(i, obstruction.getNewObstacles());
		
		// it runs until the player doesnt jump when the index of obstacles aren't 0
		do {
			for(int i =0; i <= textDemo.size(); i++)
				System.out.print(textDemo.get(i));
			//remove the first bit of land/the screen
			textDemo.remove(1);
			//add one at the end so the screen is constantly running
			textDemo.add(obstruction.getNewObstacles());
			
			if(runner.getJumpInput())
				System.out.println("Player jumped!");
			
			System.out.println();
		}while();
		
		
		System.out.println("Hit an obstacle!");
		System.out.println("Game Over");
		System.out.println("Score: " + playerScore.getCurrentScore);
	}
	
	public static void main(String[] args) {
		if(runner.getKeyInput().getKeyCode() == 32 || runner.getKeyInput.getKeyCode() == 38) {
			runGame(runner);
			System.out.println("Starting Player Two in:");
			System.out.println("3...");
			System.out.println("2...");
			System.out.println("1...");
			runGame(runner);
		}
	}
}
