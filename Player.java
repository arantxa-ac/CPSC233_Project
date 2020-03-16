import java.awt.Rectangle;

public abstract class Player extends GameObject 

{

//	World world = new World();

	public void Jump()
	{
		//int initialVelocity = (int) DataProvider.getINITIAL_VELOCITY();
		//double gravity = DataProvider.getACCELERATION();
		int maxHeight = 0;
		int originalHeight = 120;
		int currentHeight = getY();
		
		while(currentHeight > maxHeight) {
			setY(currentHeight--);
			}
		while(currentHeight < originalHeight) {
			setY(currentHeight ++);
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

