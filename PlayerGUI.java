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

public class PlayerGUI extends Player
{
	
	int HITBOXSIZE = 95;
	int X = 0;
	int Y = 200;
	ImageView imageView;
	
	public PlayerGUI()
	{
		Sprite player= new Sprite(HITBOXSIZE,X,Y);
	}
	
	public void processInput(Scene scene)
	{
		scene.setOnKeyPressed(new EventHandler<KeyEvent>()
		{
			@Override
			public void handle(KeyEvent event)
			{
				if (event.getCode() == KeyCode.UP)
					this.jump();
			}
		});
	}
	
	public Pane getLayer(PlayerGUI player)
	{
		Pane playerPane = new Pane();
		hitbox();
		player.animate(DataProvider.getPLAYER_RUN_IMAGE(), Duration.millis(DataProvider.getPLAYER_SPEED()), DataProvider.getPLAYER_RUN_SETTINGS());
		imageView.setX(X);
		imageView.setY(Y);
		playerPane.getChildren().add(imageView);
		return playerPane;
	}
	
	public void animate(Image image, Duration duration, int count, int columns, int offset_X, int offset_Y, int width, int height) {
		ImageView imageView = new ImageView(image);
		imageView.setViewport(new Rectangle2D(offset_X, offset_Y, width, height));
		SpriteAnimation animation = new SpriteAnimation(imageView,duration, count, columns, offset_X, offset_Y, width, height);
		 animation.setCycleCount(animation.INDEFINITE);
	     animation.play();
	}
}
