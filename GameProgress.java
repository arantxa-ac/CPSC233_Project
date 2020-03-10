import java.util.TimerTask;
import java.util.Scanner;
import java.util.Timer;
public class GameProgress extends TimerTask {
Scanner userInput = new Scanner(System.in);

	@Override
	public void run() {
		System.out.println(2);
		Timer inputtimer = new Timer();
		inputtimer.scheduleAtFixedRate(new InputClass(), TimeLoop.getStartdelay(),TimeLoop.getFramerate());
	}

}
