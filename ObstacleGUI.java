import java.util.Random;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class ObstacleGUI extends Obstacle{

	/*
	 * Instance Variables for ObstacleGUI
	 */
	Image Obstacle_image;
	ImageView imageView;
	int HITBOXSIZE = 50;
	/**
	 * Always spawn obstacles at the far right of the screen
	 */
	int X = 550;
	int Y = 240;
	private int rate = 5;
	private Sprite obstacleSprite= new Sprite(HITBOXSIZE,X,Y);
	
	/**
	 * Instance Variables specific to bird obstacles
	 */
	private boolean isBird;
	private final Duration duration = Duration.millis(DataProvider.getBIRD_SPEED());
	private final int COUNT = DataProvider.getBIRD_SETTINGS()[0];
    private final int COLUMNS = DataProvider.getBIRD_SETTINGS()[1];
    private final int OFFSET_X = DataProvider.getBIRD_SETTINGS()[2];
    private final int OFFSET_Y = DataProvider.getBIRD_SETTINGS()[3];
    private final int WIDTH = DataProvider.getBIRD_SETTINGS()[4];
    private final int HEIGHT = DataProvider.getBIRD_SETTINGS()[5];
	
	/**
	 * Array used to randomly choose from three different types of obstacle images
	 */
	Image [] imageList = {new Image(getClass().getResourceAsStream(DataProvider.getSINGLE_CACTUS())), 
			new Image(getClass().getResourceAsStream(DataProvider.getTRIPLE_SMALL_CACTUS())),
			new Image(getClass().getResourceAsStream(DataProvider.getTRIPLE_MULTI_CACTUS())),
			new Image(getClass().getResourceAsStream(DataProvider.getBIRD_IMAGE()))};
	
	public ObstacleGUI() {
		Random rand = new Random();
		int generate = rand.nextInt(4);
		Obstacle_image = imageList[generate];
		if (Obstacle_image.equals(imageList[3]))
			isBird = true;
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
		if (isBird)
			{
			Y = 190;
			SpriteAnimation anim = new SpriteAnimation(imageView,duration,COUNT,COLUMNS,OFFSET_X,OFFSET_Y,WIDTH,HEIGHT);
			anim.setCycleCount(anim.INDEFINITE);
		    anim.play();
			}
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
		imageView.setX(x);
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
