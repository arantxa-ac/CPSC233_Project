import java.util.Random;

import javafx.animation.TranslateTransition;
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
	
	/**
	 * GET LAYER METHOD
	 * Overrides original abstract method in GameObject
	 * @returns a Pane that contains imageview with object in the specified coordinates
	 */
	@Override
	public Pane getLayer()
	{
		Pane obstaclePane = new Pane();
		getSprite().hitbox();
		imageView.setX(getX());
		imageView.setY(getY());
		obstaclePane.getChildren().add(imageView);
		TranslateTransition move = new TranslateTransition(Duration.millis(2500), obstaclePane);
		/**
		 * Moves the obstacle down the pane towards the player
		 */
		move.setByX(-600);
		move.setByY(0);
		move.play();
		return obstaclePane;
	}
	
	/**
	 * GENERATE METHOD:
	 * @return Either generate an ObstacleGUI class randomly or nothing
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
	 * GETTER FOR OBSTACLEGUI
	 * @return ObstacleGUI
	 */
	public ObstacleGUI getObstacleGUI()
	{
		return this;
	}

}

