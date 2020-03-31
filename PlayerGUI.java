import javafx.geometry.Bounds;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class PlayerGUI extends Player
{
	/**
	 * Instance Variables for PlayerGUI
	 */
	int HITBOXSIZE = 95;
	int X = 0;
	int Y = 200;
	Image image = new Image(getClass().getResourceAsStream(DataProvider.getPLAYER_IMAGE()));
	ImageView imageView = new ImageView(image);
	Duration duration = Duration.millis(DataProvider.getPLAYER_SPEED());
	int count = DataProvider.getPLAYER_RUN_SETTINGS()[0];
	int columns = DataProvider.getPLAYER_RUN_SETTINGS()[1];
	int offsetX = DataProvider.getPLAYER_RUN_SETTINGS()[2];
	int offsetY = DataProvider.getPLAYER_RUN_SETTINGS()[3];
	int width = DataProvider.getPLAYER_RUN_SETTINGS()[4];
	int height = DataProvider.getPLAYER_RUN_SETTINGS()[5];
	int countStill = DataProvider.getPLAYER_STILL_SETTINGS()[0];
	int columnsStill = DataProvider.getPLAYER_STILL_SETTINGS()[1];
	int offsetXStill = DataProvider.getPLAYER_STILL_SETTINGS()[2];
	int offsetYStill = DataProvider.getPLAYER_STILL_SETTINGS()[3];
	int widthStill = DataProvider.getPLAYER_STILL_SETTINGS()[4];
	int heightStill = DataProvider.getPLAYER_STILL_SETTINGS()[5];
	Sprite playerSprite= new Sprite(HITBOXSIZE,X,Y);
	
	Pane playerPane = new Pane();
	
	

	/**
	 * GETLAYER METHOD:
	 * @return Pane that contains imageView with animated dinosaur in the specified coordinates
	 */
	public Pane getLayer()
	{
		playerSprite.hitbox();
		this.animate(image, duration, count, columns, offsetX, offsetY, width, height);
		imageView.setX(X);
		imageView.setY(Y);
		playerPane.getChildren().add(imageView);
		return playerPane;
	}

	/**
	 * GETTER FOR Y-COORDINATE
	 * @return y-coordinate on the Cartesian plane as an int
	 */
	public int getY() {
		return (int) imageView.getY();
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
	 * ANIMATE METHOD
	 * Animates the dinosaur sprite
	 * @param Image of the player.
	 * @param Duration used for sprite animation.
	 * @param Count used for sprite animation.
	 * @param Columns used for sprite animation.
	 * @param Offset in X used for sprite animation.
	 * @param Offset in Y used for sprite animation.
	 * @param Width used for sprite animation.
	 * @param Height used for sprite animation
	 */
	public void animate(Image image, Duration duration, int count, int columns, int offset_X, int offset_Y, int width, int height) {
		imageView = new ImageView(image);
		imageView.setViewport(new Rectangle2D(offset_X, offset_Y, width, height));
		SpriteAnimation animation = new SpriteAnimation(imageView,duration, count, columns, offset_X, offset_Y, width, height);
		 animation.setCycleCount(animation.INDEFINITE);
	     animation.play();
	}
	
	
	/**
	 * CHECKCOLLISION METHOD:
	 * @param world in which to check for a collision between players and obstacles
	 * @return boolean if there has been a collision (true) and false otherwise
	 */
	public boolean checkCollision(World world)
	{
		
		for (GameObject g: world.getGame())
		{
			if (g instanceof ObstacleGUI && g != null)
			{
				Bounds obstacleBounds = g.getImageView().localToScene(g.getImageView().getBoundsInLocal());
				Bounds playerBounds = world.getGame().get(0).getImageView().localToScene(g.getImageView().getBoundsInLocal());
				if(obstacleBounds.intersects(playerBounds))
						{
						return true;
						}
			}

		}
		return false;
		
	}
	
	/**
	 * GETTER FOR PLAYER GUI
	 * @return playerGUI
	 */
	public PlayerGUI getPlayerGUI()
	{
		return this;
	}

	/**
	 * GETTER FOR SPRITE
	 * @return playerGUI's sprite
	 */
	@Override
	public Sprite getSprite() {
		return playerSprite;
	}
	
	/**
	 * GETTER FOR IMAGEVIEW
	 * @return Player ImageView
	 */
	public ImageView getImageView() {
		return imageView;
	}

}
