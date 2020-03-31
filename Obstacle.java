import java.util.Random;

import javafx.scene.layout.Pane;

public class Obstacle extends GameObject {	
	private int rate = 5;
	
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
		return null;
	}

}
