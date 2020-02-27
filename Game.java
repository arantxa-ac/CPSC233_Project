
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	//First import needed objects
	static Player runner = new Player();	
	static Scanner userInput = new Scanner(System.in);
	
	public static void runGame(Player runner) {
		ArrayList<String> textDemo = new ArrayList<String>(10);
		textDemo.add(0, "p");
		String nextLine = "run";
		String jump = "";
		
		//Generate the initial frame first
		for(int i = 1; i < 10;i++)
			textDemo.add(i, Obstacle.getNewObstacles());
		
		//Print out first frame
		for(int i =0; i < textDemo.size(); i++)
			System.out.print(textDemo.get(i));
		

		// it runs until the player doesnt jump when the index of obstacles are(aka where the player is at)
		do {
			System.out.println("Click 'j' to jump!");
			
			//Removes the character closest to the player and adds a new one at the end
			
			//print out new frame 
			for(int i =0; i < textDemo.size(); i++)
				System.out.print(textDemo.get(i));
			
			//get the users possible jump input
			System.out.println();
			jump = userInput.next();
			runner.setInput(jump);
			System.out.println();
			
			if(runner.getJumpInput()) {
				System.out.println("Player jumped!");
			}
			
			// If a player 'jumps' over the obstacle right in front of it, it vanishes on the screen and 
			// a new character generated at the end of the list
			if(textDemo.get(1) == "|" && runner.getJumpInput()) {
				textDemo.remove(1);
				textDemo.add(Obstacle.getNewObstacles());
				System.out.println("The obstacle in front of you vanished!");
			}
			// This needs to be an else, otherwise the characters at both index 1 and 2 will be deleted if 
			// index 1 = '|'
			else {
				textDemo.remove(1);
				textDemo.add(Obstacle.getNewObstacles());
			}
			
			System.out.println("Type 'run' to run new frame/change");
			nextLine = userInput.next();
			System.out.println(nextLine);
			
		}while((nextLine.equals("run")) && textDemo.get(0) == "p");
		
		//If the player hit an obstacle. This will not appear if the player chooses not to run the next frame
		if(textDemo.get(0) != "p")
			System.out.println("Hit an obstacle!");
		
		System.out.println("Game Over");
	}
	
	public static void main(String[] args) {
		System.out.println("Type START to begin: ");
		String begin = userInput.next();
		runner.setInput(begin);
		if(runner.getInput().equals("START") ) {
			runGame(runner);
			System.out.println("Starting Player Two in:");
			System.out.println("3...");
			System.out.println("2...");
			System.out.println("1...");
			runGame(runner);
		}
	}
}
