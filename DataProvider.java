
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
	private static String GROUND_IMAGE = "/Sprites/ground.png";
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
	private static String PLAYER_IMAGE = "/Sprites/trexPlayer.png";
	private static int[] PLAYER_RUN_SETTINGS = {2,2,176, 0, 88, 94};
	private static int[] PLAYER_STILL_SETTINGS = {1, 1, 0, 0, 88, 94};
	private static String DEAD_PLAYER = "/Sprites/deadPlayer.png";
	
	/**
	 * Note that cacti are not animated but do have multiple possible images
	 */
	private static String SINGLE_CACTUS = "/Sprites/single_big_cactus.png";
	private static String TRIPLE_MULTI_CACTUS = "/Sprites/triple_multi_cactus.png";
	private static String TRIPLE_SMALL_CACTUS = "/Sprites/triple_small_cactus.png";
	
	private static String BIRD_IMAGE = "/Sprites/bird.png";
	private static int[] BIRD_SETTINGS = {2,2,0,0,48,30};
	private static int BIRD_SPEED = 450;
	
	public static String GAME_OVER = "/Sprites/gameOver.png";
	
	
	public static String getBIRD_IMAGE() {
		return BIRD_IMAGE;
	}
	
	public static int[] getBIRD_SETTINGS() {
		return BIRD_SETTINGS;
	}
	
	public static int getBIRD_SPEED() {
		return BIRD_SPEED;
	}

	private static double INITIAL_VELOCITY = -125;
	  private static double FINAL_VELOCITY = 125;
	  //Acceleration acts as a constant simulating gravity for the jump physics
	  private static double ACCELERATION = 1;
	  private static double JUMP_CONSTANT = 75;
	  
	
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
	static double getFINAL_VELOCITY() {
		return FINAL_VELOCITY;
	}
	
	public static double getACCELERATION() {
		return ACCELERATION;
	}
	
	public static double getJUMP_CONSTANT() {
		return JUMP_CONSTANT;
		
	}
	
	public static String getDEAD_PLAYER() {
		return DEAD_PLAYER;
	}
	
	public static String getGAME_OVER() {
		return GAME_OVER;
	}
	
}
