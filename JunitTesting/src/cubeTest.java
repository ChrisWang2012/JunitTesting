import static org.junit.Assert.*;

import org.junit.Test;

public class cubeTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.cube(3);
		assertEquals(27, output);
	}

}
