import java.util.ArrayList;
public class World extends GameObject {

	private static ArrayList<GameObject> game;
	
	public World() {
		game.add(Obstacle.generate());
		for (int n = 0; n < game.size(); n++) {
			System.out.print(game.get(n));
		}
		System.out.print("\n");
	}
	
	
	public void update() {
		ArrayList<GameObject> preWorld = new ArrayList<GameObject>();
		for (int n = 0; n < game.size(); n++) {
			preWorld.add(game.get(n));
		}
		
		for (int i = 0; i < (game.size() - 1) ; i++) {
			game.set(i, preWorld.get(i+1));
		}
		game.set((game.size() - 1) , Obstacle.generate());
	}
}
