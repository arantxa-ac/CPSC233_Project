import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
/**
 * 
 * A test class for the Obstacle class
 *
 */

 	public class ObstacleTest {
 		/**
 		 * Testing to see if the generate() method in the Obstacle class randomly generates obstacles
 		 */
	@Test
	public void test_generate() {
		Obstacle obstacle = new Obstacle();
		Obstacle actual = obstacle.generate();
		if(actual != null) {
			Obstacle expected = new Obstacle();
			assertEquals("Testing Obstacle Generation",  expected, actual);				
			}
		else {
			Object expected = null;
			assertEquals("Testing Obstacle Generation", expected, actual);
		}
		
		


	}

}


