import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class ObstacleGUI extends Obstacle{

	//Instance Variables for ObstacleGUI
	int HITBOXSIZE = 95;
	int X = 300;
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
	Sprite obstacleSprite= new Sprite(HITBOXSIZE,X,Y);
	private static int rate = 1;
	

	//GET LAYER METHOD
		//Returns:
		//	-Pane that contains imageView with object in the specified coordinates.
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
	
	//GENERATE METHOD
	//Returns:
	//	-ObstacleGUI that is generated ramdomly.
	public ObstacleGUI generate()
	{
		Random rand = new Random();
		int generate = rand.nextInt(rate);
		if(generate == 0)
			return new ObstacleGUI();
		return null;
	}
	
	//GETTER FOR OBSTACLE_GUI
		//Returns:
		//	-ObstacleGUI
	public ObstacleGUI getObstacleGUI()
	{
		return this;
	}

}
