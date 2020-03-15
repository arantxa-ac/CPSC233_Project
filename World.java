import java.util.ArrayList;

public class World {

	private static ArrayList<GameObject> game;
	// Add the game objects into the world and print it
	public World() {
		game.add(Obstacle.generate());
		for (int n = 0; n < game.size(); n++) {
			System.out.print(game.get(n));
		}
		System.out.print("\n");
	}
	
	// Update the world every frame
	public static void update() {
		// Create a new ArrayList
		ArrayList<GameObject> preWorld = new ArrayList<GameObject>();
		// Add each object from the game ArrayList into the new ArrayList
		for (int n = 0; n < game.size(); n++) {
			preWorld.add(game.get(n));
		}
		// Replace the object in the last index to update the world
		for (int i = 0; i < (game.size() - 1) ; i++) {
			game.set(i, preWorld.get(i+1));
		}
		game.set(game.size() , Obstacle.generate());
	}
	
	//Getter for ArrayList<GameObject> game.
	public ArrayList<GameObject> getGame() {
		return game;
	}
}
