import java.util.Timer;
import java.util.TimerTask;

import javafx.scene.layout.Pane;

public class Player extends GameObject 
{
	double velocityInitial = DataProvider.getINITIAL_VELOCITY;	
	public void jump()
	{
		double acceleration = DataProvider.getACCELERATION();
		double velocityfinal = DataProvider.getINITIAL_VELOCITY()*-1;
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			/**
			    Increment for each second that passed and print it to console
			*/
			public void run() {
				if (velocityInitial >=0)
					setY((int) (75+velocityInitial));
				else if (velocityInitial <0)
					setY((int) (75-velocityInitial));
					
				velocityInitial = velocityInitial - acceleration;
				
				if (velocityInitial <= (velocityFinal))
						{
				cancel();
						}
				}
			};
		
			timer.scheduleAtFixedRate(task, 0, 2);

	}
	
	/**
	 * CHECKCOLLISION METHOD:
	 * @param world in which to check for a collision between players and obstacles
	 * @return boolean if there has been a collision (true) and false otherwise
	 */
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

	
	/**
	 *Override of getLayer() and getSprite() Methods from abstract parent class Game Object
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
