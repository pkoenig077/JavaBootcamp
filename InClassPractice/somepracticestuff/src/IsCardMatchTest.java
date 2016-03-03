import static org.junit.Assert.*;

import org.junit.Test;

public class IsCardMatchTest {

	@Test
	public void testIsCardAMatch() {
		BrokenClass brokenClass = new BrokenClass();
		boolean result =brokenClass.isCardAMatch("winner", "winner");
		assertTrue("cardmatchfail!",result);
	}

}
