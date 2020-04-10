import javafx.scene.shape.Rectangle;

public class Sprite  {
	private int hitboxSize;
	/**
	 * These x and y locations will be pixel locations on the GUI
	 */
	private Rectangle hitbox;
	
	//Constructor for the Sprite
	public Sprite(int hitboxSize, int x, int y) {
		this.hitboxSize = hitboxSize;
		setHitbox(x,y);
	}
	
	/**
	 * Generates a hitbox around each sprite for the player class to later check for collision detection. 
	 * @return a rectangle hitbox around each sprite for collision detection
	 */
	public Rectangle getHitbox() {
		return hitbox;
	}
	
	public void setHitbox(int newX, int newY) {
		hitbox = new Rectangle(newX-hitboxSize/2, newY+hitboxSize/2, hitboxSize, hitboxSize);
	}

}
