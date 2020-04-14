import java.util.ArrayList;
/**
 * 
 * A class which has the arraylist which contains the player, the groundgui, and also all obstacles.
 * The class also has the capacity to add obstacles of the obstacleGUI class to the arraylist.
 */
public class World {

	/*
	 * Create a new ArrayList made up of Game Objects
	 */
	private static ArrayList<GameObject> game = new ArrayList<GameObject>();
	
	/**
	 *  WORLD CONSTRUCTOR
	 *  Adds the game objects into the world.
	 */
	public World() {
		
		game.add(new Player());
		game.add(new GroundGUI());
	}
	
	/**
	 * UPDATE METHOD
	 *  Updates the world every frame
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
	
	/**
	 * ADD METHOD
	 * @param Game Object g that will be added to the world.
	 */
	public void add(GameObject g) {
        game.add(g);
    }
}
