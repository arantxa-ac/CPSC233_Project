import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class PlayerGUI extends Player
{
	
	int HITBOXSIZE = 95;
	int X = 0;
	int Y = 200;
	Image image = new Image(DataProvider.getPLAYER_IMAGE());
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
	
	public Pane getLayer()
	{
		playerSprite.hitbox();
		this.animate(image, duration, count, columns, offsetX, offsetY, width, height);
		imageView.setX(X);
		imageView.setY(Y);
		playerPane.getChildren().add(imageView);
		return playerPane;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		imageView.setY(y);
	}

	public int getX() {
		return X;
	}

	public void animate(Image image, Duration duration, int count, int columns, int offset_X, int offset_Y, int width, int height) {
		imageView = new ImageView(image);
		imageView.setViewport(new Rectangle2D(offset_X, offset_Y, width, height));
		SpriteAnimation animation = new SpriteAnimation(imageView,duration, count, columns, offset_X, offset_Y, width, height);
		 animation.setCycleCount(animation.INDEFINITE);
	     animation.play();
	}
	
	public PlayerGUI getPlayerGUI()
	{
		return this;
	}

	@Override
	public Sprite getSprite() {
		return playerSprite;
	}

}
