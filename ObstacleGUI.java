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
	int columns = DataProvider.getPLAYER_RUN_SETTINGS()[1];
	int offsetX = DataProvider.getPLAYER_RUN_SETTINGS()[2];
	int offsetY = DataProvider.getPLAYER_RUN_SETTINGS()[3];
	int width = DataProvider.getPLAYER_RUN_SETTINGS()[4];
	int height = DataProvider.getPLAYER_RUN_SETTINGS()[5];
	Duration duration;
	Sprite obstacleSprite= new Sprite(HITBOXSIZE,X,Y);
	

	
	public Pane getLayer(PlayerGUI player)
	{
		Pane playerPane = new Pane();
		obstacleSprite.hitbox();
		SpriteAnimation animation = new SpriteAnimation(imageView,duration,count,columns,offsetX,offsetY,width,height);
		imageView.setX(X);
		imageView.setY(Y);
		playerPane.getChildren().add(imageView);
		return playerPane;
	}
	
	public ObstacleGUI getObstacleGUI()
	{
		return this;
	}

}
