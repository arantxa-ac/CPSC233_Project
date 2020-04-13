
/**
 * 
 * A class which contains all the constants needed for the program to run
 * It initializes each constant and each variable has a getter method to return the value of the constant
 *
 */


public class DataProvider {
	
	/**
	 * WINDOW SETTINGS
	 * Dimensions needed for the GUI window
	 */
	private static int WINDOW_WIDTH = 600;
	private static int WINDOW_HEIGHT = 400;
	
	/**
	 * ANIMATION SETTINGS FOR GAME SPRITES
	 * Speed: Returns this speed in milliseconds for the animation cycle
	 */
	private static int GROUND_SPEED = 2000;
	private static int PLAYER_SPEED = 400;
	private static int BIRD_SPEED = 450;
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
	private static int[] PLAYER_RUN_SETTINGS = {2,2,176, 0, 88, 94};
	private static int[] PLAYER_STILL_SETTINGS = {1, 1, 0, 0, 88, 94};
	private static int[] BIRD_SETTINGS = {2,2,0,0,48,30};
	/*
	 * PLAYER IMAGE
	 */
	private static String PLAYER_IMAGE = "/Sprites/trexPlayer.png";

	/*
	 * DEAD PLAYER IMAGE
	 * Used when there is an obstacle collision
	 */
	private static String DEAD_PLAYER = "/Sprites/deadPlayer.png";
	
	/*
	 * GROUND IMAGE
	 */
	private static String GROUND_IMAGE = "/Sprites/ground.png";
	
	/**
	 * OBSTACLE IMAGES
	 * 	Note that cacti are not animated but do have multiple possible images
	 */
	private static String SINGLE_CACTUS = "/Sprites/single_big_cactus.png";
	private static String TRIPLE_MULTI_CACTUS = "/Sprites/triple_multi_cactus.png";
	private static String TRIPLE_SMALL_CACTUS = "/Sprites/triple_small_cactus.png";
	private static String BIRD_IMAGE = "/Sprites/bird.png";
	
	/*
	 * GAME OVER IMAGE
	 */
	public static String GAME_OVER = "/Sprites/gameOver.png";
	
	/*
	 * JUMP SETTINGS
	 * Constants and variables used in jump method in Player class.
	 */
	private static double INITIAL_VELOCITY = -125;
	private static double FINAL_VELOCITY = 125;
	  //Acceleration acts as a constant simulating gravity for the jump physics
	private static double ACCELERATION = 1;
	private static double JUMP_CONSTANT = 75;
	
	/**
	 * Getter for WINDOW WIDTH 
	 * @return Value of window width as an int.
	 */
	public static int getWINDOW_WIDTH() {
		return WINDOW_WIDTH;
	}
	
	/**
	 * Getter for WINDOW HEIGHT 
	 * @return Value of window height as an int.
	 */
	public static int getWINDOW_HEIGHT() {
		return WINDOW_HEIGHT;
	}
	
	/**
	 * Getter for BIRD IMAGE 
	 * @return String containing the name of png file for bird image.
	 */
	public static String getBIRD_IMAGE() {
		return BIRD_IMAGE;
	}
	
	/**
	 * Getter for BIRD SETTINGS 
	 * @return int array containing settings used for Sprite Animation.
	 */
	public static int[] getBIRD_SETTINGS() {
		return BIRD_SETTINGS;
	}
	
	/**
	 * Getter for BIRD SPEED 
	 * @return speed value used for animation as an int.
	 */
	public static int getBIRD_SPEED() {
		return BIRD_SPEED;
	}
	
	/**
	 * Getter for GROUND SPEED 
	 * @return speed value used for animation as an int.
	 */
	public static int getGROUND_SPEED() {
		return GROUND_SPEED;
	}
	
	/**
	 * Getter for GROUND IMAGE 
	 * @return String containing the name of png file for ground image.
	 */
	public static String getGROUND_IMAGE() {
		return GROUND_IMAGE;
	}
	
	/**
	 * Getter for GROUND SETTINGS 
	 * @return int array containing settings used for Sprite Animation.
	 */
	public static int[] getGROUND_SETTINGS() {
		return GROUND_SETTINGS;
	}
	
	/**
	 * Getter for BIRD SPEED 
	 * @return speed value used for animation as an int.
	 */
	public static int getPLAYER_SPEED() {
		return PLAYER_SPEED;
	}
	
	/**
	 * Getter for PLAYER IMAGE 
	 * @return String containing the name of png file for player image.
	 */
	public static String getPLAYER_IMAGE() {
		return PLAYER_IMAGE;
	}
	
	/**
	 * Getter for PLAYER RUN SETTINGS 
	 * @return int array containing settings used for Sprite Animation when the player is running.
	 */
	public static int[] getPLAYER_RUN_SETTINGS() {
		return PLAYER_RUN_SETTINGS;
	}
	
	/**
	 * Getter for PLAYER STILL SETTINGS 
	 * @return int array containing settings used for Sprite Animation when the player is not running.
	 */
	public static int[] getPLAYER_STILL_SETTINGS() {
		return PLAYER_STILL_SETTINGS;
	}
	
	/**
	 * Getter for SINGLE CACTUS IMAGE 
	 * @return String containing the name of png file for single cactus image.
	 */
	public static String getSINGLE_CACTUS() {
		return SINGLE_CACTUS;
	}
	
	/**
	 * Getter for TRIPLE CACTUS IMAGE 
	 * @return String containing the name of png file for triple cactus image.
	 */
	public static String getTRIPLE_MULTI_CACTUS() {
		return TRIPLE_MULTI_CACTUS;
	}
	
	/**
	 * Getter for TRIPLE SMALL CACTUS IMAGE 
	 * @return String containing the name of png file for a smaller version of triple cactus image.
	 */
	public static String getTRIPLE_SMALL_CACTUS() {
		return TRIPLE_SMALL_CACTUS;
	}
	
	/**
	 * Getter for INITIAL VELOCITY 
	 * @return Initial velocity value used for player's jump method as a double.
	 */
	static double getINITIAL_VELOCITY() {
		return INITIAL_VELOCITY;
	}
	
	/**
	 * Getter for FINAL VELOCITY 
	 * @return Final velocity value used for player's jump method as a double.
	 */
	static double getFINAL_VELOCITY() {
		return FINAL_VELOCITY;
	}
	
	/**
	 * Getter for ACCELERATION 
	 * @return Acceleration value used for player's jump method as a double.
	 */
	public static double getACCELERATION() {
		return ACCELERATION;
	}
	
	/**
	 * Getter for JUMP CONSTANT 
	 * @return Jump constant value used for player's jump method as a double.
	 */
	public static double getJUMP_CONSTANT() {
		return JUMP_CONSTANT;
	}
	
	
	/**
	 * Getter for DEAD PLAYER IMAGE 
	 * @return String containing the name of png file for dead player image.
	 */
	public static String getDEAD_PLAYER() {
		return DEAD_PLAYER;
	}
	
	
	/**
	 * Getter for GAME OVER IMAGE 
	 * @return String containing the name of png file for game over image.
	 */
	public static String getGAME_OVER() {
		return GAME_OVER;
	}
	
}
