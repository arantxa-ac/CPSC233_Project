import java.awt.Rectangle;

public class Sprite  {
	private int hitboxSize;
	//These x and y locations will be pixels
	private int x;
	private int y;
	
	//Constructor for the Sprite
	public Sprite(int hitboxSize, int x, int y) {
		this.hitboxSize = hitboxSize;
		this.x = x;
		this.y=y;
	}
	
	//Generates a hitbox around each sprite for the player class to later check for collision detection. 
	public Rectangle hitbox() {
		return new Rectangle(this.x, this.y, hitboxSize, hitboxSize);
	}
}
