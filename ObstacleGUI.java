
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

	int HITBOXSIZE = 95;
	int X = DataProvider.getWINDOW_WIDTH();
	int Y = 200;
	Image Obstacle_image;
	ImageView imageView = new ImageView();
	int count;
	int columns;
	int offsetX;
	int offsetY;
	int width;
	int height;
	Duration duration;
	Sprite obstacleSprite= new Sprite(HITBOXSIZE, HITBOXSIZE,X,Y);
	private static int rate = 1;
	

	@Override
	public Pane getLayer()
	{
		Pane obstaclePane = new Pane();
		obstacleSprite.hitbox();
		imageView.setX(X);
		imageView.setY(Y);
		obstaclePane.getChildren().add(imageView);
		return obstaclePane;
	}
	
	public ObstacleGUI generate()
	{
		Random rand = new Random();
		int generate = rand.nextInt(rate);
		if(generate == 0)
			return new ObstacleGUI();
		return null;
	}
	
	public ObstacleGUI getObstacleGUI()
	{
		return this;
	}

}
