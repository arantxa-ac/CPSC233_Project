import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class ObstacleGUI extends Obstacle{

	//Instance Variables for ObstacleGUI
	Image Obstacle_image = new Image(getClass().getResourceAsStream(DataProvider.getSINGLE_CACTUS()));
	ImageView imageView = new ImageView(Obstacle_image);
	Duration duration;
	private static int rate = 1;

	//GET LAYER METHOD
		//Returns:
		//	-Pane that contains imageView with object in the specified coordinates.
	@Override
	public Pane getLayer()
	{
		Pane obstaclePane = new Pane();
		getSprite().hitbox();
		imageView.setX(getX());
		imageView.setY(getY());
		obstaclePane.getChildren().add(imageView);
		TranslateTransition move = new TranslateTransition(Duration.millis(2500),obstaclePane);
		move.setByX(-600);
		move.setByY(0);
		move.play();	
		return obstaclePane;
	}
	
	//GENERATE METHOD
	//Returns:
	//	-ObstacleGUI that is generated randomly.
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

