import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 * 
 * The initial class of the game, such that every component within the game extends it
 *
 */
public abstract class GameObject {
	private int x;
	private int y;

	/**
	 * Getter for X-Coordinate 
	 * @return x position as an int on the Cartesian plane
	 */
	public int getX() {
		return x;
	}
	
	/**SETTER FOR X COORDINATE
	 * @param int x which represents a new coordinate for the game object
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Getter for Y-Coordinate 
	 * @return y position as an int on the Cartesian plane
	 */
	public int getY() {
		return y;
	}
	
	/**SETTER FOR Y COORDINATE
	 * @param int y which represents a new coordinate for the game object
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * ABSTRACT GETTER FOR THE LAYER IN WHICH GAME OBJECT IS CONTAINED	
	 *
	 */
	public abstract Pane getLayer();
	
	/**
	 * ABSTRACT GETTER FOR THE SPRITE OF THE GAME OBJECT
	 *
	 */
	public abstract Sprite getSprite();
	
	/**
	 * GETTER FOR IMAGEVIEW
	 * @return ImageView for GUI objects
	 */
	public ImageView getImageView() {
		return null;
	}
}
