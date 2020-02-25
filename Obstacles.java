import java.util.Random;
public class Obstacles {
	private static String Obstacle = "|";
	private static int rate = 5;
	
	public Obstacles(int rate, String Obstacle) {
		this.rate = rate;
		this.Obstacle = Obstacle;
	}
	
	public static String getNewObstacles() {
		int Ob;
		Random rand = new Random();
		Ob = rand.nextInt(rate);
		if (Ob == 0) {
			return Obstacle;
		}
		else{
			return "_";
		}
		
	}

}
