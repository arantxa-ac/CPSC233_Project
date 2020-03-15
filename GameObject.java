import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public abstract class GameObject {
	private int x;
	private int y;

	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public abstract Image getImage();
	
	public abstract Pane getLayer();
}
