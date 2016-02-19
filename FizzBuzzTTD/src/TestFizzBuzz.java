import static org.junit.Assert.*;

import org.junit.Test;

public class TestFizzBuzz {

	@Test
	public void testFizzBuzz(){
		assertEquals("test1fail", "1", FizzBuzz.fizzBuzz(1));
	}
	@Test
	public void testFizzBuzz2(){
		assertEquals("test2fail", "2", FizzBuzz.fizzBuzz(2));
	}
	@Test
	public void testFizzBuzz3(){
		assertEquals("test3fail", "Fizz", FizzBuzz.fizzBuzz(3));
	}
	@Test
	public void testFizzBuzz4(){
		assertEquals("test4fail", "4", FizzBuzz.fizzBuzz(4));
	}
	@Test
	public void testFizzBuzz5(){
		assertEquals("test5fail", "Buzz", FizzBuzz.fizzBuzz(5));
	}
	@Test
	public void testFizzBuzz6(){
		assertEquals("test6fail", "Fizz", FizzBuzz.fizzBuzz(6));
	}
	@Test
	public void testFizzBuzz9(){
		assertEquals("test9fail", "Fizz", FizzBuzz.fizzBuzz(9));
	}
	@Test
	public void testFizzBuzz10(){
		assertEquals("test10fail", "Buzz", FizzBuzz.fizzBuzz(10));
	}
	@Test
	public void testFizzBuzz15(){
		assertEquals("test15fail", "FizzBuzz", FizzBuzz.fizzBuzz(15));
	}
}

