import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class ObstacleGUI extends Obstacle{

	//Instance Variables for ObstacleGUI
	Image Obstacle_image;
	ImageView imageView = new ImageView();
	int count;
	int columns;
	int offsetX;
	int offsetY;
	int width;
	int height;
	Duration duration;
	private static int rate = 1;
	

	/**
	 * GET LAYER METHOD
	 * Overrides getLayer() methods in GameObject and Obstacle
	 * @return Pane that contains imageView with object in the specified coordinates
	 */
	@Override
	public Pane getLayer()
	{
		Pane obstaclePane = new Pane();
		getSprite().hitbox();
		imageView.setX(getX());
		imageView.setY(getY());
		obstaclePane.getChildren().add(imageView);
		return obstaclePane;
	}
	
	/**
	 * GENERATE METHOD
	 * @return ObstacleGUI or not
	 */
	public ObstacleGUI generate()
	{
		Random rand = new Random();
		int generate = rand.nextInt(rate);
		if(generate == 0)
			return new ObstacleGUI();
		return null;
	}
	

	/**
	 * GETTER FOR OBSTACLE_GUI
	 * @return ObstacleGUI
	 */
	public ObstacleGUI getObstacleGUI()
	{
		return this;
	}

}
