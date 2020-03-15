import java.awt.Rectangle;

public abstract class Player extends GameObject 

{

//	World world = new World();

	public void Jump()
	{
		int initialVelocity = (int) DataProvider.getINITIAL_VELOCITY();
		double gravity = DataProvider.getACCELERATION();
		while (initialVelocity >= (-1*initialVelocity))
		{
			setY(getY()+initialVelocity);
			initialVelocity -= gravity;
		}

	}

	public boolean checkCollision()
	{
//		for (GameObject g: world.getGame())
//		{
//			if (g instanceof Obstacle)
//			{
//				if(g.getSprite().hitbox().intersects(world.getGame().get(0).hitbox()))
//						{
//						return true;
//						}
//			}
//
//		}
		return false;

