import java.awt.Font;
import java.awt.Label;
import java.util.Timer;
import java.util.TimerTask;

public class ScoreManager {
	
	/*
	 * Instance variables for Score Manager class
	 */
	private int tenthsecondsPassed = 0;
	private double obstacle = 1000;
	/**
	 *  Add a timer for the score to take place
	 */
	Timer scoreCalculator = new Timer();
	TimerTask task = new TimerTask() {

		/**
		 * RUN METHOD
		 * Increases the seconds passed variable.
		 */
		public void run() {
			tenthsecondsPassed++;
			obstacle = obstacle - 10;
	
		}
	};
	
	/**
	 * START METHOD
	 *  Increments score for every tenth of a second
	 */
	public void start() {
		scoreCalculator.scheduleAtFixedRate(task, 0, 10);
	}
	
	/**
	 *  SCORE LABEL METHOD
	 *  Where the score label will be placed in the GUI version
	 * @param score in int type.
	 */
	public void scoreLabel(int score){
		Label scoreLabel = new Label();
		scoreLabel.setFont(new Font("arial", Font.PLAIN, 14));
	}
	
	/**
	 *  MAIN METHOD
	 *  Starts the score
	 * @param args, not used.
	 */
	public static void main(String[] args) {
		ScoreManager currenttime = new ScoreManager();
		currenttime.start();
	}
	
	/**
	 *  GETTER FOR TIME
	 *  @return the time in tenthsecondsPassed
	 */
	public int gettime()
	{
	return  tenthsecondsPassed;
	}
	
	/**
	 * GETTER FOR OBSTACLE
	 * @return returns obstacle variable used for obstacle timeline.
	 */
	public double getobstacle()
	{
		return obstacle;
	}
}

