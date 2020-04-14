import javafx.animation.Interpolator;
import javafx.animation.Transition;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
/**
 * 
 * A class which allows for sprite animation of the obstacles and the player
 *
 */
public class SpriteAnimation extends Transition {
	/*
	 * Instance variables for Sprite Animation class.
	 */
	private final ImageView imageView;
	private final int count;
	private final int columns;
	private final int offsetX;
	private final int offsetY;
	private final int width;
	private final int height;
	private int lastIndex = 5;

	/**
	 * GETTER FOR IMAGEVIEW
	 * @return imageView of the sprite
	 */
	public ImageView getImageView() {
		return imageView;
	}
	
	/**
	 * GETTER FOR COUNT
	 * @return Count value in int for sprite animation settings.
	 */
	public int getCount() {
		return count;
	}

	/**
	 * GETTER FOR COLUMNS
	 * @return Columns value in int for sprite animation settings.
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * GETTER FOR X OFFSET
	 * @return X offset value in int for sprite animation settings.
	 */
	public int getOffsetX() {
		return offsetX;
	}

	/**
	 * GETTER FOR Y OFFSET
	 * @return Y offset value in int for sprite animation settings.
	 */
	public int getOffsetY() {
		return offsetY;
	}

	/**
	 * GETTER FOR WIDTH
	 * @return Width value in int of the sprite.
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * GETTER FOR HEIGHT
	 * @return Height value in int of the sprite.
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * SPRITE ANIMATION METHOD
	 * @param image view to animate
	 * @param duration of the animation in int
	 * @param cycle count for animation in int
	 * @param number of columns in which image will be divided for animation in int
	 * @param X offset of the image that will be animated in int
	 * @param Y offset of the image that will be animated in int
	 * @param width of the image that will be animated in int
	 * @param height of the image that will be animated in int
	 */
	public SpriteAnimation(ImageView imageView, Duration duration, int count, int columns, int offsetX, int offsetY, int width, int height) {
	        this.imageView = imageView;
	        this.count = count;
	        this.columns = columns;
	        this.offsetX = offsetX;
	        this.offsetY = offsetY;
	        this.width = width;
	        this.height = height;
	        setCycleDuration(duration);
	        setInterpolator(Interpolator.LINEAR);
	    }
	 
		/**
		 * INTERPOLATE METHOD
		 * Used for sprite animation
		 * @param double value of interpolator
		 */
	    protected void interpolate(double k) {
	        final int index = Math.min((int) Math.floor(k * count), count - 1);
	        if (index != lastIndex) {
	            final int x = (index % columns) * width  + offsetX;
	            final int y = (index / columns) * height + offsetY;
	            imageView.setViewport(new Rectangle2D(x, y, width, height));
	            lastIndex = index;
	        }
	    }
	
}
