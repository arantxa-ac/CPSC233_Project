package finalproject;

import java.util.Scanner;
import java.util.TimerTask;

public class InputClass extends TimerTask {
	Scanner userInput = new Scanner(System.in);
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String jump = userInput.next();
		if (jump.equals("j"));
		Player.jump();
		System.out.println("Player Jumped");
	}

}
