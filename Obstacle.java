import java.awt.Rectangle;
import java.util.Random;

import javafx.scene.layout.Pane;

public class Obstacle extends GameObject {
	
	//Instance variables for Obstacle.
	private int rate;
	private Rectangle hitbox;
	
	//GENERATE METHOD
		//Returns:
		//	-Obstacle that is generated randomly.
	public Obstacle generate()
	{
		Random rand = new Random();
		int generate = rand.nextInt(this.rate);
		if(generate == 0)
			return new Obstacle();
		else
			return null;
	}

	//Override of getLayer() and getSprite() Methods from abstract parent class Game Object
	@Override
	public Pane getLayer() {
		return null;
	}

	@Override
	public Sprite getSprite() {
		return null;
	}

}
