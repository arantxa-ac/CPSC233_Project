import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import javafx.geometry.Bounds;
import javafx.scene.image.Image;
/**
 * 
 * A Test class for the Player class
 *
 */
public class PlayerGUITest {
	/**
	 * Testing if collision returns true when collision occurs
	 */
	@Test
	public void test_checkCollision() {
		
		PlayerGUI player = new PlayerGUI();
		World world = new World();
		boolean expected = false;
		for (GameObject g: world.getGame())
		{
			if (g instanceof ObstacleGUI && g != null)
			{
				g.getSprite().setHitbox(0, 200);
				player.getSprite().setHitbox(0, 200);
				Bounds obstacleBounds = g.getSprite().getHitbox().localToScene(g.getSprite().getHitbox().getBoundsInParent());
				Bounds playerBounds = world.getGame().get(0).getSprite().getHitbox().localToScene(world.getGame().get(0).getSprite().getHitbox().getBoundsInParent(), true);
				if(obstacleBounds.intersects(playerBounds))
						{
						expected = true;
						}
			}
			
		}
		/**
		 * check to see if expected and actual match
		 */
		assertEquals("Testing Collsion Detection", expected , player.checkCollision(world));
	}

}




