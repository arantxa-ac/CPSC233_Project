import javafx.scene.shape.Rectangle;

public class Sprite  {
	/*
	 * Instance variables for Sprite class.
	 */
	private int hitboxSize;
	private Rectangle hitbox;
	
	/**
	 * SPRITE CONSTRUCTOR
	 * @param Side value for the hitbox in pixels using integer as the type.
	 * @param X coordinate int for hitbox pixel location which is the same as the sprite location.
	 * @param Y coordinate int for hitbox pixel location.
	 */
	public Sprite(int hitboxSize, int x, int y) {
		this.hitboxSize = hitboxSize;
		setHitbox(x,y);
	}
	
	/**
	 * GETTER FOR HITBOX
	 * Generates a hitbox around each sprite for the player class to later check for collision detection. 
	 * @return a rectangle hitbox around each sprite for collision detection.
	 */
	public Rectangle getHitbox() {
		return hitbox;
	}
	
	/**
	 * SETTER FOR HITBOX
	 * Creates a new rectangle in the location given by x and y coordinates.
	 * @param newX coordinate for the hitbox.
	 * @param newY coordinate for the hitbox.
	 */
	public void setHitbox(int newX, int newY) {
		hitbox = new Rectangle(newX-hitboxSize/2, newY+hitboxSize/2, hitboxSize, hitboxSize);
	}

}
