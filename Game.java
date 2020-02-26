import java.awt.Rectangle;
import java.util.ArrayList;

public class Game {
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
			//Print out
			for(int i =0; i <= textDemo.size(); i++)
				System.out.print(textDemo.get(i));
			
			//Remove the character closest to player and replace it with a new generated one at the end
			textDemo.remove(1);
			textDemo.add(obstruction.getNewObstacles());
			
			//Print out for first demo, delete later
			if(runner.getJumpInput())
				System.out.println("Player jumped!");
			
			System.out.println();
		}while((textDemo.get(1) != "_" && !runner.getJumpInput()) || runner.getKeyInput() == 8);
		
		
		System.out.println("Hit an obstacle!");
		System.out.println("Game Over");
	}
	
	public static void main(String[] args) {
		//Start game with space bar and up arrow 
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
