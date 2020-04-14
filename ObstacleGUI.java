import java.util.Random;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
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
	int HITBOXSIZE = 90;
	/**
	 * Always spawn obstacles at the far right of the screen
	 */
	int X = 700;
	int Y = 220;
	private int rate = 5;
	private Sprite obstacleSprite= new Sprite(HITBOXSIZE,X,Y);
	
	/**
	 * Instance Variables specific to bird obstacles
	 */
	private boolean isBird = false;
	private final Duration duration = Duration.millis(DataProvider.getBIRD_SPEED());
	private final int COUNT = DataProvider.getBIRD_SETTINGS()[0];
    private final int COLUMNS = DataProvider.getBIRD_SETTINGS()[1];
    private final int OFFSET_X = DataProvider.getBIRD_SETTINGS()[2];
    private final int OFFSET_Y = DataProvider.getBIRD_SETTINGS()[3];
    private final int WIDTH = DataProvider.getBIRD_SETTINGS()[4];
    private final int HEIGHT = DataProvider.getBIRD_SETTINGS()[5];
    
    /*
     * Instance variables for obstacle timeline.
     */
    private boolean stop = false;
    Timeline timeline2 = new Timeline();
	
	/**
	 * Array used to randomly choose from four different types of obstacle images
	 */
	Image [] imageList = {new Image(getClass().getResourceAsStream(DataProvider.getSINGLE_CACTUS())), 
			new Image(getClass().getResourceAsStream(DataProvider.getTRIPLE_SMALL_CACTUS())),
			new Image(getClass().getResourceAsStream(DataProvider.getTRIPLE_MULTI_CACTUS())),
			new Image(getClass().getResourceAsStream(DataProvider.getBIRD_IMAGE()))};
	
	/*
	 * OBSTACLEGUI CONSTRUCTOR
	 * Chooses an obstacle image randomly and sets up its image view.
	 */
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
	 * @returns a Pane that contains image view with object in the specified coordinates
	 * This Pane also updates the x coordinate of the obstacle using a Timeline.
	 */
	@Override
	public Pane getLayer()
	{
		Pane obstaclePane = new Pane();
		/*
		 * If the obstacle is a bird, choose randomly if it is a high flying bird or not.
		 */
		if (isBird)
		{
			Random randombird = new Random();
			int gen = randombird.nextInt(2);
			if(gen == 0)
				Y = 200;
			else 
			{
				Y = 140;
				obstacleSprite = new Sprite(40,X,Y);
			}
			
			SpriteAnimation anim = new SpriteAnimation(imageView,duration,COUNT,COLUMNS,OFFSET_X,OFFSET_Y,WIDTH,HEIGHT);
			anim.setCycleCount(anim.INDEFINITE);
		    anim.play();
		}
		/*
		 * Use timeline to update x-coordinate of the obstacle.
		 */
		imageView.setX(getX());
		imageView.setY(getY());
		obstaclePane.getChildren().add(imageView);
		ScoreManager obstaclegenerator = new ScoreManager();
		obstaclegenerator.start();
		
		 timeline2 = new Timeline(new KeyFrame(Duration.seconds(.001), ev -> {
			obstaclePane.getChildren().clear();
			imageView.setX(obstaclegenerator.getobstacle());
			imageView.setY(getY());
			obstaclePane.getChildren().add(imageView);
			this.getSprite().setHitbox((int) obstaclegenerator.getobstacle(),getY());
			
			if(stop)
				timeline2.pause();
			
			}));	
			timeline2.setCycleCount(Animation.INDEFINITE);
		    timeline2.play();
		    
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
	 * STOP METHOD
	 * Used to stop obstacle generation if there has been a collision.
	 * @param boolean indicating if there has been a collision.
	 */
	public void stop(boolean collision) {
		stop = collision;
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
	 * GETTER FOR IS BIRD
	 * @return true if the obstacle generated is a bird, false otherwise.
	 */
	public boolean getIsBird() {
		return isBird;
	}
}
