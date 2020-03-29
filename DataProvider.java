
/**
 * 
 * A class which contains all the constants needed for the program to run
 * It initializes each constant and each variable has a getter method to return the value of the constant
 *
 */


public class DataProvider {
	
	/**
	 * Dimensions needed for the GUI window
	 */
	private static int WINDOW_WIDTH = 600;
	private static int WINDOW_HEIGHT = 400;
	
	/**
	 * Returns this speed in milliseconds for the animation cycle
	 */
	private static int GROUND_SPEED = 2000;
	//Image 
	private static String GROUND_IMAGE = "ground.png";
	/**
	 * Settings used for the SpriteAnimation, its parameters being: 
	 * Count
	 * Columns
	 * Offset_x
	 * Offset_y
	 * Width 
	 * Height
	 */
	private static int[] GROUND_SETTINGS = {2,2,0,0,600,14};
	
	private static int PLAYER_SPEED = 400;
	private static String PLAYER_IMAGE = "trexPlayer.png";
	private static int[] PLAYER_RUN_SETTINGS = {2,2,176, 0, 88, 94};
	private static int[] PLAYER_STILL_SETTINGS = {1, 1, 0, 0, 88, 94};
	
	/**
	 * Note that cacti are not animated but do have multiple possible images
	 */
	private static String SINGLE_CACTUS = "single_big_cactus.png";
	private static String TRIPLE_MULTI_CACTUS = "triple_multi_cactus.png";
	private static String TRIPLE_SMALL_CACTUS = "triple_small_cactus.png";
	
	
	  private static double INITIAL_VELOCITY = -125;
	  //Acceleration acts as a constant simulating gravity for the jump physics
	  private static double ACCELERATION = 1;
	  
	
	public static int getWINDOW_WIDTH() {
		return WINDOW_WIDTH;
	}
	public static int getWINDOW_HEIGHT() {
		return WINDOW_HEIGHT;
	}
	public static int getGROUND_SPEED() {
		return GROUND_SPEED;
	}
	public static String getGROUND_IMAGE() {
		return GROUND_IMAGE;
	}
	public static int[] getGROUND_SETTINGS() {
		return GROUND_SETTINGS;
	}
	public static int getPLAYER_SPEED() {
		return PLAYER_SPEED;
	}
	public static String getPLAYER_IMAGE() {
		return PLAYER_IMAGE;
	}
	public static int[] getPLAYER_RUN_SETTINGS() {
		return PLAYER_RUN_SETTINGS;
	}
	public static int[] getPLAYER_STILL_SETTINGS() {
		return PLAYER_STILL_SETTINGS;
	}
	public static String getSINGLE_CACTUS() {
		return SINGLE_CACTUS;
	}
	public static String getTRIPLE_MULTI_CACTUS() {
		return TRIPLE_MULTI_CACTUS;
	}
	public static String getTRIPLE_SMALL_CACTUS() {
		return TRIPLE_SMALL_CACTUS;
	}
	
	static double getINITIAL_VELOCITY() {
		return INITIAL_VELOCITY;
	}
	
	public static double getACCELERATION() {
		return ACCELERATION;
	
}
}
