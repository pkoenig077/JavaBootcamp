import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class PrimeFactorTest {
@Test
public void testEmpty(){
	assertEquals(Collections.emptyList(),PrimeFactor.getPrimeFactors(1));
}

@Test
public void testFor2(){
	assertEquals(Arrays.asList(2),PrimeFactor.getPrimeFactors(2));
}
@Test
public void testFor3(){
	assertEquals(Arrays.asList(3),PrimeFactor.getPrimeFactors(3));
}
@Test
public void testFor4(){
	assertEquals(Arrays.asList(2,2),PrimeFactor.getPrimeFactors(4));
}
@Test
public void testFor5(){
	assertEquals(Arrays.asList(5),PrimeFactor.getPrimeFactors(5));
}
@Test
public void testFor6(){
	assertEquals(Arrays.asList(2,3),PrimeFactor.getPrimeFactors(6));
}
@Test
public void testFor7(){
	assertEquals(Arrays.asList(7),PrimeFactor.getPrimeFactors(7));
}
@Test
public void testFor8(){
	assertEquals(Arrays.asList(2,2,2),PrimeFactor.getPrimeFactors(8));
}
@Test
public void testFor9(){
	assertEquals(Arrays.asList(3,3),PrimeFactor.getPrimeFactors(9));
}
@Test
public void testFor10(){
	assertEquals(Arrays.asList(2,5),PrimeFactor.getPrimeFactors(10));
}
@Test
public void testFor11(){
	assertEquals(Arrays.asList(11),PrimeFactor.getPrimeFactors(11));
}
@Test
public void testFor12(){
	assertEquals(Arrays.asList(2,2,3),PrimeFactor.getPrimeFactors(12));
}
@Test
public void testFor13(){
	assertEquals(Arrays.asList(13),PrimeFactor.getPrimeFactors(13));
}
@Test
public void testFor14(){
	assertEquals(Arrays.asList(2,7),PrimeFactor.getPrimeFactors(14));
}
@Test
public void testFor15(){
	assertEquals(Arrays.asList(3,5),PrimeFactor.getPrimeFactors(15));
}
@Test
public void testFor16(){
	assertEquals(Arrays.asList(2,2,2,2),PrimeFactor.getPrimeFactors(16));
}
@Test
public void testFor17(){
	assertEquals(Arrays.asList(17),PrimeFactor.getPrimeFactors(17));
}
@Test
public void testFor18(){
	assertEquals(Arrays.asList(2,3,3),PrimeFactor.getPrimeFactors(18));
}
@Test
public void testFor19(){
	assertEquals(Arrays.asList(19),PrimeFactor.getPrimeFactors(19));
}
@Test
public void testFor20(){
	assertEquals(Arrays.asList(2,2,5),PrimeFactor.getPrimeFactors(20));
}
@Test
public void testFor21(){
	assertEquals(Arrays.asList(3,7),PrimeFactor.getPrimeFactors(21));
}
@Test
public void testFor22(){
	assertEquals(Arrays.asList(2,11),PrimeFactor.getPrimeFactors(22));
}
@Test
public void testFor126(){
	assertEquals(Arrays.asList(2,3,3,7),PrimeFactor.getPrimeFactors(126));
}
@Test
public void testFor100(){
	assertEquals(Arrays.asList(2,2,5,5),PrimeFactor.getPrimeFactors(100));
}
}
