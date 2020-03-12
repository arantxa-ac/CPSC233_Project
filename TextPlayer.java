import java.util.Scanner;

public class TextPlayer {
	//input
	//player:Sprite
	Scanner userInput = new Scanner(System.in);
	public void input() {
		// TODO Auto-generated method stub
		String jump = userInput.next();
		if (jump.equals("j")) {
		//Player.jump();
		System.out.println("Player Jumped");
		}
		
	}
	

}
