import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import javafx.scene.shape.*;


import org.junit.jupiter.api.Test;

public class SpriteTest {
	
	@Test
	public void test_getHitboxHeight() {
		Sprite c = new Sprite(10,20,30);
		Rectangle hitbox = new Rectangle(15, 35, 10 , 10);
		assertEquals("Testing Hitbox height" , hitbox.getHeight(), c.getHitbox().getHeight(), 0.001);
	}
	
	@Test
	public void test_getHitboxWidth() {
		Sprite c = new Sprite(10,20,30);
		Rectangle hitbox = new Rectangle(15, 35, 10 , 10);
		assertEquals("Testing Hitbox height" , hitbox.getWidth(), c.getHitbox().getWidth(), 0.001);
	}
	
	@Test
	public void test_getHitboxX() {
		Sprite c = new Sprite(10,20,30);
		Rectangle hitbox = new Rectangle(15, 35, 10 , 10);
		assertEquals("Testing Hitbox height" , hitbox.getX(), c.getHitbox().getX(), 0.001);
	}
	
	@Test
	public void test_getHitboxY() {
		Sprite c = new Sprite(10,20,30);
		Rectangle hitbox = new Rectangle(15, 35, 10 , 10);
		assertEquals("Testing Hitbox height" , hitbox.getY(), c.getHitbox().getY(), 0.001);
	}
}
