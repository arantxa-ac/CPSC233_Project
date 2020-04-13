import java.awt.Font;
import java.awt.Label;
import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {
	/*
	 * Instance variables for Game Timer.
	 */
	private int secondsPassed = 0;

	/*
	 * Add a timer for each second
	 */
	Timer timer = new Timer();
	TimerTask task = new TimerTask() {
		// Increment for each second that passed and print it to console
		public void run() {
			secondsPassed++;
			System.out.println("Time: " + secondsPassed);
		}
	};
	
	/**
	 * START METHOD
	 * Starts the increment for each second that passes.
	 */
	public void start() {
		timer.scheduleAtFixedRate(task, 1000, 1000);
	}
	
	/**
	 * GAME TIMER LABEL METHOD
	 * Where the label of the timer will be for the GUI version.
	 */
	public void gameTimerLabel() {
		Label timerLabel = new Label();
		timerLabel.setFont(new Font("arial", Font.PLAIN, 14));
	}
	
	/**
	 * GETTER FOR SECONDS PASSED
	 * @return seconds passed since the start of the timer in int type.
	 */
	public int getTime()
	{
	return secondsPassed;
	}
	
	/**
	 * MAIN METHOD
	 * Starts the timer.
	 */
	public static void main(String[] args) {
		GameTimer currenttime = new GameTimer();
		currenttime.start();
	}
}
