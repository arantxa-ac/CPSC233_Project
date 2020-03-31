import java.util.Random;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class ObstacleGUI extends Obstacle{

	//Instance Variables for ObstacleGUI
	Image Obstacle_image;
	ImageView imageView;
	Duration duration;
	int HITBOXSIZE = 50;
	/**
	 * Always spawn obstacles at the far right of the screen
	 */
	int X = 550;
	int Y = 220;
	private int rate = 5;
	private Sprite obstacleSprite= new Sprite(HITBOXSIZE,X,Y);
	
	/**
	 * Array used to randomly choose from three different types of obstacle images
	 */
	Image [] imageList = {new Image(getClass().getResourceAsStream(DataProvider.getSINGLE_CACTUS())), 
			new Image(getClass().getResourceAsStream(DataProvider.getTRIPLE_SMALL_CACTUS())),
			new Image(getClass().getResourceAsStream(DataProvider.getTRIPLE_MULTI_CACTUS()))};
	
	public ObstacleGUI() {
		Random rand = new Random();
		int generate = rand.nextInt(3);
		Obstacle_image = imageList[generate];
		imageView = new ImageView(Obstacle_image);
	}
	
	/**
	 * GET LAYER METHOD
	 * Overrides original abstract method in GameObject
	 * @returns a Pane that contains imageview with object in the specified coordinates
	 */
	@Override
	public Pane getLayer()
	{
		Pane obstaclePane = new Pane();
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
	 * GETTER FOR Y-COORDINATE
	 * @return y-coordinate on the Cartesian plane as an int
	 */
	public int getY() {
		return Y;
	}

	/**
	 * SETTER FOR Y-COORDINATE 
	 * @param y-coordinate Cartesian int value to change the imageView
	 */
	public void setY(int y) {
		imageView.setY(y);
	}
	
	/**
	 * GETTER FOR X-COORDINATE
	 * Note: don't need a setter for x as the players x position should never change
	 * @return x-coordinate on the Cartesian plane as an int
	 */
	public int getX() {
		return X;
	}
	
	/**
	 * SETTER FOR X-COORDINATE 
	 * @param x-coordinate Cartesian int value to change the imageView
	 */
	public void setX(int x) {
		imageView.setY(x);
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
		return this;
	}
	
	/**
	 * GETTER FOR OBSTACLEGUI
	 * @return ObstacleGUI
	 */
	public ObstacleGUI getObstacleGUI()
	{
		return this;
	}

	
	/**
	 * GETTER FOR SPRITE
	 * @return Obstacle Sprite
	 */
	@Override
	public Sprite getSprite() {
		return obstacleSprite;
	}
	
	/**
	 * GETTER FOR IMAGEVIEW
	 * @return Obstacle ImageView
	 */
	public ImageView getImageView() {
		return imageView;
	}
}

