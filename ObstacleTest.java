import java.util.ArrayList;

public class ObstacleTest {
	public static ArrayList<String> current = new ArrayList<String>(10);
	//testing constructor
	static Obstacle obstacle = new Obstacle(2,"i");
	
	public static void main(String[] args) {
		current.add(0, obstacle.getNewObstacles());
		for(int i = 1; i <10; i++) {
			current.add(i, obstacle.getNewObstacles(current.get(i-1)));
		}
		
		for(int n = 0; n <10; n++) {
			System.out.print(current.get(n));
		}

	}

}
