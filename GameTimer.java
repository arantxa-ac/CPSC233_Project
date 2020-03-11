import java.awt.Font;
import java.awt.Label;
import java.util.Timer;
import java.util.TimerTask;


public class GameTimer {
	private int secondsPassed = 0;

	Timer timer = new Timer();
	TimerTask task = new TimerTask() {
		public void run() {
			secondsPassed++;
			System.out.println("Time: " + secondsPassed);
		}
	};
	
	public void start() {
		timer.scheduleAtFixedRate(task, 1000, 1000);
	}

	public void gameTimerLabel() {
		Label timerLabel = new Label();
		timerLabel.setFont(new Font("arial", Font.PLAIN, 14));
	}
	
	public static void main(String[] args) {
		GameTimer currenttime = new GameTimer();
		currenttime.start();
	}
}

