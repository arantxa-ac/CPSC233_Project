import java.awt.Rectangle;

public abstract class Player extends GameObject 

{

	 World obstacleList = new World();

	public void Jump()
	{
		initalVelocity = DataProvider.getINITIAL_VELOCITY();
		gravity = DataProvider.getACCELERATION();
		while (initalVelocity > (-1*initalVelocity))
		{
			initalVelocity -= gravity;
		}

	}

	public boolean checkCollision()
	{
		for (GameObject g: obstacleList.getGame())
		{
			if (g.getClass() == Obstacle)
			{
				if(g.getSprite().hitbox().intersects(obstacleList.getGame().get(0).getSprite().hitbox()))
						{
						return true;
						}
			}

		}
		return false;

	}

}

