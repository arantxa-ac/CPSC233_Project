import java.util.Random;
public class Obstacle {
	//default Obstacles and rate
	private static String Obstacle = "|";
	private static String Ground = "_";
	//1 to 5 chance of generating an obstacle
	private static int rate = 5;
	
	//constructors to change defalt values
	public Obstacle(int rate, String Obstacle) {
		this.rate = rate;
		this.Obstacle = Obstacle;
	}
	
	//Generate random Obstacles by the rate
	//will return either empty or an Obstacles
	public static String getNewObstacles(String preObstacles) {
		int Ob;
		Random rand = new Random();
		Ob = rand.nextInt(rate);
		if (Ob == 0) {
			if(preObstacles != Ground) {
				return Ground;
			}
			else{
				return Obstacle;
			}
		}
		else{
			return Ground;
		}
		
	}
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
