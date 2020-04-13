import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DataProviderTest {

	@Test
	public void test_getGROUND_SPEED() {
		DataProvider d = new DataProvider();
		int expected = 2000;
		int actual = d.getGROUND_SPEED();
		assertEquals("Testing Collision",  expected, actual);
	}
	
	@Test
	public void test_getBIRD_SPEED() {
		DataProvider d = new DataProvider();
		int expected = 450;
		int actual = d.getBIRD_SPEED();
		assertEquals("Testing Collision",  expected, actual);
	}
	
	@Test
	public void test_getWINDOW_WIDTH() {
		DataProvider d = new DataProvider();
		int expected = 600;
		int actual = d.getWINDOW_WIDTH();
		assertEquals("Testing Collision",  expected, actual);
	}
	
	@Test
	public void test_getWINDOW_HEIGHT() {
		DataProvider d = new DataProvider();
		int expected = 400;
		int actual = d.getWINDOW_HEIGHT();
		assertEquals("Testing Collision",  expected, actual);
	}
	

}
