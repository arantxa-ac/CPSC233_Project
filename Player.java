import java.util.Timer;
import java.util.TimerTask;

import javafx.scene.layout.Pane;

public class Player extends GameObject 
{
double velocityinital = 125;	
	//JUMP METHOD
	//Makes player jump.
	public void jump()
	{
		double acceleration = DataProvider.getACCELERATION();
		double velocityfinal = DataProvider.getINITIAL_VELOCITY();
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			// Increment for each second that passed and print it to console
			public void run() {
				if (velocityinital >=0)
				setY((int) (75+velocityinital));
				else if (velocityinital <0)
				setY((int) (75-velocityinital));
				velocityinital = velocityinital - acceleration;
				if (velocityinital <= (velocityfinal))
						{
				cancel();
						}
				}
			};
		
			timer.scheduleAtFixedRate(task, 0, 2);

	}
	//CHECK COLLISION METHOD
	//Parameters:
	// -World in which to check for a collision between the player and the obstacles.
	//Returns:
	//	-Boolean: True if there has been a collision between the player and the obstacles, false otherwise.
	public boolean checkCollision(World world)
	{
		for (GameObject g: world.getGame())
		{
			if (g instanceof Obstacle && g != null)
			{
				if(g.getSprite().hitbox().intersects(world.getGame().get(0).getSprite().hitbox()))
						{
						return true;
						}
			}

		}
		return false;
		
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
