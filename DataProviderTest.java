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
		assertEquals("Testing getGROUND_SPEED",  expected, actual);
	}
	/**
	 * Testing to see if the getBIRD_SPEED returns 450 when called
	 */
	@Test
	public void test_getBIRD_SPEED() {
		DataProvider d = new DataProvider();
		int expected = 450;
		int actual = d.getBIRD_SPEED();
		assertEquals("Testing getBIRD_SPEED",  expected, actual);
	}
	/**
	 * Testing to see if the getWINDOW_WIDTH method returns 600 when called
	 */
	@Test
	public void test_getWINDOW_WIDTH() {
		DataProvider d = new DataProvider();
		int expected = 600;
		int actual = d.getWINDOW_WIDTH();
		assertEquals("Testing getWINDOW_WIDTH",  expected, actual);
	}
	/**
	 * Testing to see if the getWINDOW_HEIGHT method returns 400 when called
	 */
	@Test
	public void test_getWINDOW_HEIGHT() {
		DataProvider d = new DataProvider();
		int expected = 400;
		int actual = d.getWINDOW_HEIGHT();
		assertEquals("Testing getWINDOW_HEIGHT",  expected, actual);
	}
	
	@Test
	public void test_getACCELERATION() {
		DataProvider d = new DataProvider();
		double expected = 1.0;
		double actual = d.getACCELERATION();
		assertEquals("Testing getACCELERATION", expected, actual, 0.01);
	}

}

