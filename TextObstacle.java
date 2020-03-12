import java.util.Random;

public class TextObstacle {
	//rate:int
	//sprite
	//hitbox:rectangle
	private static String Obstacle = "|";
	private static String Ground = "_";
	//1 to 5 chance of generating an obstacle
	private static int rate = 5;
	
	public static String getNewObstacles() {
		int Ob;
		Random rand = new Random();
		Ob = rand.nextInt(rate);
		if (Ob == 0) {
			return Obstacle;
		}
		else{
			return Ground;
		}
	}

}
