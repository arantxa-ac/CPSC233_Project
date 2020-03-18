import java.awt.Font;
import java.awt.Label;
import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {
	private int secondsPassed = 0;

	// Add a timer for each second
	Timer timer = new Timer();
	TimerTask task = new TimerTask() {
		// Increment for each second that passed and print it to console
		public void run() {
			secondsPassed++;
			System.out.println("Time: " + secondsPassed);
		}
	};
	// Start the increment for each second that passes
	public void start() {
		timer.scheduleAtFixedRate(task, 1000, 1000);
	}
	
	// Where the label of the timer will be for the GUI version
	public void gameTimerLabel() {
		Label timerLabel = new Label();
		timerLabel.setFont(new Font("arial", Font.PLAIN, 14));
	}
	
	public int getTime()
	{
	return secondsPassed;
	}
	
	// Start of the timer
	public static void main(String[] args) {
		GameTimer currenttime = new GameTimer();
		currenttime.start();
	}
}

