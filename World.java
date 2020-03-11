import java.util.ArrayList;

public class World {
	private static int lengthToShow = 10;
	private static ArrayList<String> currentWorld = new ArrayList<String>(lengthToShow);
	
	/**world constructor
	 * initialize a world and store as an array list
	 */
	public World() {
		currentWorld.add(0, Obstacle.getNewObstacles());
		for(int i = 1; i < lengthToShow; i++) {
			currentWorld.add(i, Obstacle.getNewObstacles(currentWorld.get(i-1)));
		}
	}
	/**worldPrint()
	 * arg: none
	 * print the current list 
	 */
	public void worldPrint() {
		for(int n = 0; n < lengthToShow; n++) {
			System.out.print(currentWorld.get(n));
		}
		System.out.print("\n");
	}
	
	/**worldShiftOne()
	 * arg:none
	 * take the current world and generate a new one value at the end of the list
	 */
	public void worldShiftOne() {
		//shift one and add a new one to the end of the array
		
		ArrayList<String> preWorld = new ArrayList<String>(lengthToShow);
		for(int n = 0; n < lengthToShow; n++) {
			//copy current world to previous world
			preWorld.add(n, currentWorld.get(n));
		}
		
		for(int n = 0; n < lengthToShow - 1; n++) {
			currentWorld.set(n, preWorld.get(n+1));
		}
		currentWorld.set(lengthToShow - 1, Obstacle.getNewObstacles(currentWorld.get(lengthToShow-2)));
	}
	
	public boolean shouldJump() {
		String testString = currentWorld.get(0);
		if(Obstacle.CheckObstacles(testString) == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean keepRunning() {
		if (shouldJump() == true && InputClass.isJumping() == false) {
			return false;
		}
		else {
			return true;
		}
	}
	
	

}
