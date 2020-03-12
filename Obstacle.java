import java.awt.Rectangle;
import java.util.Random;

public class Obstacle extends GameObject {
	
	private int rate;
	private Rectangle hitbox;
	
	public Obstacle generate()
	{
		Random rand = new Random();
		int generate = rand.nextInt(this.rate);
		if(generate == 0)
			return new Obstacle();
		else
			return null;
	}

}
