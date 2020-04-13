import java.util.ArrayList;

public class TextGame {
	private static ArrayList<String> ground = new ArrayList<String>();
	private static ArrayList<String> sky = new ArrayList<String>();
	
	public TextGame(ArrayList<GameObject> obj) {
		//initialize a empty ground
		for (int i = 0; i< 18 ; i++) {
			sky.add(" ");
			ground.add(TextObstacle.getGround());
		}
			//Corresponding the position
		for (int i = 2; i< obj.size(); i++) {
			int currentX = (int)(obj.get(i).getX()/40);
			ground.remove(currentX);
			ground.add(currentX, TextObstacle.getCactus());
		}
	
	}
		
	public void toPrint() {
		//print out the arraylist
		String thisground = "p";
		String thissky = " ";
		for (int i = 0; i < ground.size(); i++) {
			thisground += ground.get(i); 
			thissky += sky.get(i);
		}
		System.out.println(thissky);
	    System.out.println(thisground);
	}
	
	public static void generateType(boolean t) {

		if (t == false) {
			ground.remove(17);
			ground.add(TextObstacle.getCactus());
		} else {
			sky.remove(17);
			sky.add(TextObstacle.getBird());
		}
	}
	
	public static void jump() {
		String thisground = " ";
		String thissky = "p";
		for (int i = 0; i < ground.size(); i++) {
			thisground += ground.get(i); 
			thissky += sky.get(i);
		}
		System.out.println(thissky);
	    System.out.println(thisground);
	}
	 
	public static void updateByFrame() {
		for (int i = 0; i< 16; i++) {
			sky.remove(i);
			sky.add(i,sky.get(i+1));
			ground.remove(i);
			ground.add(i,ground.get(i+1));
		}
		ground.remove(17);
		ground.add(17,TextObstacle.getGround());
		sky.remove(17);
		sky.add(17, " ");
	}

}
