import java.util.Scanner;
import java.util.TimerTask;

public class InputClass extends TimerTask {
	
	Scanner userInput = new Scanner(System.in);
	private static boolean Jumping = false;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String jump = userInput.next();
		if (jump.equals("j")) {
		//Player.jump();
		System.out.println("Player Jumped");
		setJumping(true);
		}
		
	}
	public static boolean isJumping() {
		return Jumping;
	}
	public static void setJumping(boolean j) {
		Jumping = j;
	}
}

