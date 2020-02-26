import java.util.Random;
public class Obstacles {
	//defalt Obstacles and rate
	private static String Obstacle = "|";
	private static int rate = 5;
	
	//constructors to change defalt values
	public Obstacles(int rate, String Obstacle) {
		this.rate = rate;
		this.Obstacle = Obstacle;
	}
	
	//Generate random Obstacles by the rate
	//will retrun either empty or an Obstacles
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
