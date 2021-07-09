package peer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestingFactorials {

	@Test
	public void test1() {
		String expected = "5!";
		String actual = Calculate.calculate(120);
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		String expected = "NONE";
		String actual = Calculate.calculate(150);
		assertEquals(expected, actual);
	}

}
