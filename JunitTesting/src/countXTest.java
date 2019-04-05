import static org.junit.Assert.*;

import org.junit.Test;

public class countXTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.countX("Let's find X in X-ray.");
		assertEquals(2, output);
	}

}
