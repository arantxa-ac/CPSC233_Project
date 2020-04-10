import java.util.Scanner;

public class TextPlayer extends Player{
	//input
	//player:Sprite
	Scanner userInput = new Scanner(System.in);
	public void input() {
		String jump = userInput.next();
		if (jump.equals("j")) {
		//Player.jump();
		System.out.println("Player Jumped");
		}
		
	}
	//public boolean checkcollision(world) {
		
	//}
	

}
