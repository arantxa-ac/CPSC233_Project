import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Ground {
	private final Image IMAGE = new Image(DataProvider.getGROUND_IMAGE());
	private final int COUNT = DataProvider.getGROUND_SETTINGS()[0];
    private final int COLUMNS = DataProvider.getGROUND_SETTINGS()[1];
    private final int OFFSET_X = DataProvider.getGROUND_SETTINGS()[2];
    private final int OFFSET_Y = DataProvider.getGROUND_SETTINGS()[3];
    private final int WIDTH = DataProvider.getGROUND_SETTINGS()[4];
    private final int HEIGHT = DataProvider.getGROUND_SETTINGS()[5];
    private final int MILLISDURATION = DataProvider.getGROUND_SETTINGS()[6];
    
    //animates the Ground Image
    public void animate() {
		ImageView imageView = new ImageView(IMAGE);
		imageView.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));
		SpriteAnimation animation = new SpriteAnimation(imageView, Duration.millis(MILLISDURATION), COUNT, COLUMNS, OFFSET_X, OFFSET_Y, WIDTH, HEIGHT);
		 animation.setCycleCount(animation.INDEFINITE);
	     animation.play();
	}
}
