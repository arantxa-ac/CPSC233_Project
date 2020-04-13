import java.util.Random;

public class TextObstacle extends Obstacle{
	/*
	 * Instance variables for Text Obstacle class
	 */
	private static String Cactus = "|";
	private static String Ground = "_";
	private static String Bird = "-";
	/**
	 *1 to 5 chance of generating an obstacle
	 */
	private static int rate = 5;
	
	/**
	 * GETTER FOR GROUND
	 * @return String representation of the ground.
	 */
	public static String getGround() {
		return Ground;
	}
	
	/**
	 * SETTER FOR GROUND
	 * @param New string representation of the ground.
	 */
	public static void setGround(String ground) {
		Ground = ground;
	}
	
	/**
	 * GETTER FOR BIRD
	 * @return String representation of the bird obstacle.
	 */
	public static String getBird() {
		return Bird;
	}
	
	/**
	 * SETTER FOR BIRD
	 * @param New string representation of the bird obstacle.
	 */
	public static void setBird(String bird) {
		Bird = bird;
	}
	
	/**
	 * GET NEW OBSTACLES METHOD
	 * @return String representation of cactus if a new cactus was generated 
	 * or string representation of ground if it was not.
	 */
	public static String getNewObstacles() {
		int Ob;
		Random rand = new Random();
		Ob = rand.nextInt(rate);
		if (Ob == 0) {
			return Cactus;
		}
		else{
			return Ground;
		}
	}
	
	/**
	 * GETTER FOR CACTUS
	 * @return String representation of the cactus obstacle.
	 */
	public static String getCactus() {
		return Cactus;
	}
	
	/**
	 * SETTER FOR CACTUS
	 * @param New string representation of the cactus obstacle.
	 */
	public static void setCactus(String cactus) {
		Cactus = cactus;
	}

}
