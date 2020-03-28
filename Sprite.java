import java.awt.Rectangle;

public class Sprite  {
	private int hitboxSize;
	/**
	 * These x and y locations will be pixel locations on the GUI
	 */
	private int x;
	private int y;
	
	//Constructor for the Sprite
	public Sprite(int hitboxSize, int x, int y) {
		this.hitboxSize = hitboxSize;
		this.x = x;
		this.y=y;
	}
	
	/**
	 * Generates a hitbox around each sprite for the player class to later check for collision detection. 
	 * @return
	 */
	public Rectangle hitbox() {
		return new Rectangle(this.x, this.y, hitboxSize, hitboxSize);
	}
}
