import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import javafx.geometry.Bounds;
import javafx.scene.image.Image;

public class PlayerTest {
	
	@Test
	public void test_checkCollision() {
		
		Player player = new Player();
		World world = new World();
		for (GameObject g: world.getGame())
		{
			if (g instanceof Obstacle && g != null)
			{
				if(g.getSprite().getHitbox().getLayoutBounds().intersects(world.getGame().get(0).getSprite().getHitbox().getLayoutBounds()))
						{
					boolean expected = true;
					boolean actual = player.checkCollision(world);
					assertEquals("Testing Collsion Detection", expected, actual);
						}
			
			}
			
		}
		
	}
}



