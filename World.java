import java.util.ArrayList;

public class World {
	private static int lengthToShow = 10;
	private static ArrayList<String> currentWorld = new ArrayList<String>(lengthToShow);
	
	public World() {
		currentWorld.add(0, Obstacle.getNewObstacles());
		for(int i = 1; i < lengthToShow; i++) {
			currentWorld.add(i, Obstacle.getNewObstacles(currentWorld.get(i-1)));
		}
	}
	
	public void worldPrint() {
		for(int n = 0; n < lengthToShow; n++) {
			System.out.print(currentWorld.get(n));
		}
		System.out.print("\n");
	}
	
	public void worldShiftOne() {
		//shift one and add a new one to the end of the array
		
		ArrayList<String> preWorld = new ArrayList<String>(lengthToShow);
		for(int n = 0; n < lengthToShow; n++) {
			//copy currentworld to previous world
			preWorld.add(n, currentWorld.get(n));
		}
		
		for(int n = 0; n < lengthToShow - 1; n++) {
			currentWorld.set(n, preWorld.get(n+1));
		}
		currentWorld.set(lengthToShow - 1, Obstacle.getNewObstacles(currentWorld.get(lengthToShow-2)));
	}
	

}
