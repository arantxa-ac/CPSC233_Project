import javafx.scene.layout.Pane;

public class Player extends GameObject 
{
	
	//JUMP METHOD
	//Makes player jump.
	public void jump()
	{
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
