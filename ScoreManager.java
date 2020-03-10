import java.awt.Font;
import java.awt.Label;
import java.util.Timer;
import java.util.TimerTask;

public class ScoreManager {
	private int millisecondsPassed = 0;
	private int score = 0;
	
	Timer scoreCalculator = new Timer();
	TimerTask task = new TimerTask() {
		public void run() {
			millisecondsPassed++;
			score = millisecondsPassed;
			System.out.println("Score is: " + score);
		}
	};
	
	public void start() {
		scoreCalculator.scheduleAtFixedRate(task, 100, 100);
	}

	public void scoreLabel(int score) {
		Label scoreLabel = new Label();
		scoreLabel.setFont(new Font("arial", Font.PLAIN, 14));
	}
	
	public static void main(String[] args) {
		ScoreManager currenttime = new ScoreManager();
		currenttime.start();
	}
}
