import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


 	public class ObstacleTest {
 		private int rate = 5;
	@Test
	public void test_generate() {
		Obstacle obstacle = new Obstacle();
		Random rand = new Random();
		int generate = rand.nextInt(this.rate);
		if(generate == 0) {
			Obstacle expected = new Obstacle();
			Obstacle actual = obstacle.generate();
			assertEquals("Testing Obstacle Generation",  expected, actual);
		}
		
		


	}

}
