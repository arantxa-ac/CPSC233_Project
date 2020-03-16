import javafx.scene.layout.Pane;

public abstract class GameObject {
	private int x;
	private int y;

	//GETTER FOR X COORDINATE
	//Returns:
	//	-X coordinate of Game object.
	public int getX() {
		return x;
	}
	
	//SETTER FOR X COORDINATE
	//Parameters:
	//	-New x coordinate for the Game object.
	public void setX(int x) {
		this.x = x;
	}
	
	//GETTER FOR Y COORDINATE
		//Returns:
		//	-Y coordinate of Game object.
	public int getY() {
		return y;
	}
	
	//SETTER FOR Y COORDINATE
		//Parameters:
		//	-New y coordinate for the Game object.
	public void setY(int y) {
		this.y = y;
	}
	
	//ABSTRACT GETTER FOR THE LAYER IN WHICH GAME OBJECT IS CONTAINED	
	public abstract Pane getLayer();
	
	//ABSTRACT GETTER FOR THE SPRITE OF THE GAME OBJECT
	public abstract Sprite getSprite();
}
