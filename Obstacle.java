import java.util.Random;

import javafx.scene.layout.Pane;

public class Obstacle extends GameObject {
	
	//Instance variables for Obstacle.
	int HITBOXSIZE = 95;
	/**
	 * Always spawn obstacles at the far right of the screen
	 */
	int X = 300;
	int Y = 200;
	private int rate = 2;
	private Sprite obstacleSprite= new Sprite(HITBOXSIZE,X,Y);
	
	public Obstacle()
	{
		setX(X);
		setY(Y);
	}
	
	
	/**
	 * GENERATE METHOD
	 * @return an obstacle that is generated randomly or not
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
		return obstacleSprite;
	}

}
