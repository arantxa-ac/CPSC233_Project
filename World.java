import java.util.ArrayList;

public class World {

	private static ArrayList<GameObject> game = new ArrayList<GameObject>();
	/**
	 *  Add the game objects into the world and print it
	 */
	public World() {
		
		game.add(new Player());
		game.add(new GroundGUI());
	}
	
	/**
	 *  Update the world every frame
	 */
	public static void update() {
		/**
		 *  Create a new ArrayList
		 */
	ArrayList<GameObject> preWorld = new ArrayList<GameObject>();
		/**
		 *  Add each object from the game ArrayList into the new ArrayList
		 */
		for (int n = 0; n < game.size(); n++) {
			preWorld.add(game.get(n));
		}
		/**
		 *  Replace the object in the last index to update the world
		 */
		for (int i = 2; i < (game.size() - 1) ; i++) {
			game.set(i, preWorld.get(i+1));
		}
		game.set(game.size()-1, new ObstacleGUI().generate());
	}
	
	/**
	 * Getter for ArrayList<GameObject> game.
	 * @return the ArrayList of the GameObjects
	 */
	public ArrayList<GameObject> getGame() {
		return game;
	}
	public void add(GameObject g) {
        game.add(g);
    }
}
