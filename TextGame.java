import java.util.ArrayList;

public class TextGame {

	public static void main(String[] args) {
		PlayerGUI player = new PlayerGUI();
		World world = new World();
		ArrayList<GameObject> obj = world.getGame();
		obj.set(0, player);
		System.out.println(toString(obj));
		world.update();
		 
	}
	
	public static String toString(ArrayList<GameObject> obj) {
		ArrayList<String> ground = new ArrayList<String>();
		//initialize a empty ground
		for (int i = 0; i< 10; i++) {
			ground.add(TextObstacle.getGround());
		}
		//add in the Cactus to the ground
		//Corresponding the position
		for (int i = 2; i< obj.size(); i++) {
			int currentX = (int)(obj.get(i).getX()/60);
			ground.add(currentX, TextObstacle.getCactus());
		}
		//add the player
		String thisground = "p";
		for (int i = 0; i<ground.size(); i++) {
			thisground += ground.get(i); 
		}
		return thisground;
	}

}
