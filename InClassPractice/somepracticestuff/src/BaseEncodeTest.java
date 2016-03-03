import static org.junit.Assert.*;

import org.junit.Test;

public class BaseEncodeTest {

	@Test
	public void testBaseEncodeFileName() {
		BrokenClass brokenClass = new BrokenClass();
		String result = brokenClass.baseEncodeFileName("secret");
		assertEquals("baseencodefail!","c2VjcmV0", result);
	}

}
