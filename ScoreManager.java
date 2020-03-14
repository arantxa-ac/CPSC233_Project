import java.awt.Font;
import java.awt.Label;
import java.util.Timer;
import java.util.TimerTask;

public class ScoreManager {
	private int tenthsecondsPassed = 0;
	private int score = 0;
	// Add a timer for the score to take place
	Timer scoreCalculator = new Timer();
	TimerTask task = new TimerTask() {
	// Increment score for every tenth of a second and print it
		public void run() {
			tenthsecondsPassed++;
			score = tenthsecondsPassed;
			System.out.println("Score is: " + score);
		}
	};
	
	// Score will increment every 10th of a second
	public void start() {
		scoreCalculator.scheduleAtFixedRate(task, 100, 100);
	}
	// Where the score label will be placed in the GUI version
	public void scoreLabel(int score) {
		Label scoreLabel = new Label();
		scoreLabel.setFont(new Font("arial", Font.PLAIN, 14));
	}
	// Start of the score
	public static void main(String[] args) {
		ScoreManager currenttime = new ScoreManager();
		currenttime.start();
	}
}

