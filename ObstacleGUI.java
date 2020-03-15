import java.util.Random;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class ObstacleGUI extends Obstacle{

	int HITBOXSIZE;
	int X;
	int Y;
	Image Obstacle_image;
	ImageView imageView;
	int count;
	int columns;
	int offsetX;
	int offsetY;
	int width;
	int height;
	Duration duration;
	Sprite obstacleSprite= new Sprite(HITBOXSIZE,X,Y);
	

	
	public Pane getLayer()
	{
		Pane obstaclePane = new Pane();
		obstacleSprite.hitbox();
		SpriteAnimation animation = new SpriteAnimation(imageView,duration,count,columns,offsetX,offsetY,width,height);
		imageView.setX(X);
		imageView.setY(Y);
		obstaclePane.getChildren().add(imageView);
		return obstaclePane;
	}
	
	public ObstacleGUI getObstacleGUI()
	{
		return this;
	}

}
