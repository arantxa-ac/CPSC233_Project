import java.awt.Rectangle;

public class Player extends GameObject 

{

	private double initalVelocity;
	private double gravity;
	
	 World obstacleList = new World();
	
	public void Jump()
	{
		initalVelocity = DataProvider.getINITAL_VELOCITY();
		gravity = DataProvider.getACCELERATION();
		while (initalVelocity > (-1*initalVelocity))
		{
			initalVelocity -= gravity;
		}
		
	}
	
	public boolean checkCollision()
	{
		for (GameObject g: obstacleList.getWorldList())
		{
			if (g.getClass() == Obstacle)
			{
				if(g.getHitbox().intersects(getWorldList.get(0).hitbox()
						{
						return true;
						}
			}
				
		}
		return false;
				
	}
	
}
