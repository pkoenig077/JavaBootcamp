import static org.junit.Assert.*;

import org.junit.Test;

public class RoundingTest {

	@Test
	public void testRoundUp() {
		BrokenClass brokenClass = new BrokenClass();
		int result =brokenClass.roundUp(4.5f);
		assertEquals("roundingtestfail",5,result);
	}

}
