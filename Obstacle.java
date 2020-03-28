import java.util.Random;

import javafx.scene.layout.Pane;

public class Obstacle extends GameObject {
	
	//Instance variables for Obstacle.
	int HITBOXSIZE = 95;
	int X = 300;
	int Y = 200;
	private int rate;
	private Sprite obstacleSprite= new Sprite(HITBOXSIZE,X,Y);
	
	public Obstacle()
	{
		setX(X);
		setY(Y);
	}
	
	
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
		return obstacleSprite;
	}

}
