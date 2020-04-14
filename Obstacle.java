import java.util.Random;
import javafx.scene.layout.Pane;

/**
 * 
 * obstacle class that contains random generation of obstacles 
 *
 */
public class Obstacle extends GameObject {
	/*
	 * Instance variable for Game Objects
	 */
	private int rate = 5;
	
	/**
	 * GENERATE METHOD
	 * @return an obstacle that is generated randomly or not.
	 */
	public Obstacle generate()
	{
		Random rand = new Random();
		int generate = rand.nextInt(this.rate);
		if(generate == 0)
			return new Obstacle();
		else
			return null;
	}

	/**
	 * Override of getLayer() and getSprite() methods from abstract parent class GameObject
	 */
	@Override
	public Pane getLayer() {
		return null;
	}

	@Override
	public Sprite getSprite() {
		return null;
	}

}
