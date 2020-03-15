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
	Image Obstacle_image = new Image(getClass().getResourceAsStream(DataProvider.getSINGLE_CACTUS()));
	ImageView imageView = new ImageView(Obstacle_image);
	Sprite obstacleSprite= new Sprite(HITBOXSIZE,X,Y);
	

	
	public Pane getLayer()
	{
		Pane obstaclePane = new Pane();
		obstacleSprite.hitbox();
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
