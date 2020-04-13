import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * 
 * A Test class for the Data Provider class
 *
 */
public class DataProviderTest {
/**
 * Testing to see if the getGROUND_SPEED method returns 2000 when called
 */
	@Test
	public void test_getGROUND_SPEED() {
		DataProvider d = new DataProvider();
		int expected = 2000;
		int actual = d.getGROUND_SPEED();
		assertEquals("Testing Collision",  expected, actual);
	}
	/**
	 * Testing to see if the getBIRD_SPEED returns 450 when called
	 */
	@Test
	public void test_getBIRD_SPEED() {
		DataProvider d = new DataProvider();
		int expected = 450;
		int actual = d.getBIRD_SPEED();
		assertEquals("Testing Collision",  expected, actual);
	}
	/**
	 * Testing to see if the getWINDOW_WIDTH method returns 600 when called
	 */
	@Test
	public void test_getWINDOW_WIDTH() {
		DataProvider d = new DataProvider();
		int expected = 600;
		int actual = d.getWINDOW_WIDTH();
		assertEquals("Testing Collision",  expected, actual);
	}
	/**
	 * Testing to see if the getWINDOW_HEIGHT method returns 400 when called
	 */
	@Test
	public void test_getWINDOW_HEIGHT() {
		DataProvider d = new DataProvider();
		int expected = 400;
		int actual = d.getWINDOW_HEIGHT();
		assertEquals("Testing Collision",  expected, actual);
	}
	

}

