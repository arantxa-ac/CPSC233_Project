import java.util.Random;

public class TextObstacle extends Obstacle{
	//rate:int
	//sprite
	//hitbox:rectangle
	private static String Cactus = "|";
	private static String Ground = "_";
	private static String Bird = "-";
	/**
	 *1 to 5 chance of generating an obstacle
	 */
	private static int rate = 5;
	
	public static String getGround() {
		return Ground;
	}
	public static void setGround(String ground) {
		Ground = ground;
	}
	public static String getBird() {
		return Bird;
	}
	public static void setBird(String bird) {
		Bird = bird;
	}
	
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
	public static String getCactus() {
		return Cactus;
	}
	public static void setCactus(String cactus) {
		Cactus = cactus;
	}

}
