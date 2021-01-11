
import static org.junit.Assert.*;

import java.math.BigInteger;

public class FractionTest {
	
	Fraction f1 = new Fraction(1, 2);
	Fraction f2 = new Fraction(2, 3);
	Fraction f3 = new Fraction(3, 6);
	Fraction f4 = new Fraction(7, 6);
	Fraction f5 = new Fraction(1, 6);
	Fraction f6 = new Fraction(1 ,3);
	Fraction f7 = new Fraction(3, 4);

	@Test
	public void numeratorTest() {
		assertEquals(f1.getNumerator(), BigInteger.ONE);
		assertEquals(f2.getNumerator(), BigInteger.valueOf(2));
		System.out.println(f1.getNumerator());
		System.out.println(f2.getNumerator());
	}

	@Test
	public void denominatorTest(){
		assertEquals(f1.getDenominator(),BigInteger.valueOf(2));
		assertEquals(f2.getDenominator(), BigInteger.valueOf(3));
		System.out.println(f1.getDenominator());
		System.out.println(f2.getDenominator());
	}
	
	@Test 
	public void addTest(){
		assertTrue(Fraction(f1.getNumerator(), f1.getDenominator()));
		assertTrue(Fraction(f2.getNumerator(), f2.getDenominator()));
		Fraction f = f1.add(f2);
		assertEquals(f, f.equals(f4));
		System.out.println(f);
	
	}
	
	private boolean Fraction(BigInteger bigInteger, BigInteger bigInteger2) {
		return false;
	}

	@Test
	public void subtractTest(){
		assertTrue(Fraction(f1.getNumerator(), f1.getDenominator()));
		assertTrue(Fraction(f2.getNumerator(), f2.getDenominator()));
		Fraction f = f1.subtract(f2);
		assertEquals(f, f5);
		System.out.println(f);
	
	}
	
	@Test 
	public void multiplyTest(){
		assertTrue(Fraction(f1.getNumerator(), f1.getDenominator()));
		assertTrue(Fraction(f2.getNumerator(), f2.getDenominator()));
		Fraction f = f1.multiply(f2);
		assertEquals(f, f6);
		System.out.println(f);
		
	}
	
	@Test
	public void divideTest(){
		assertTrue(Fraction(f1.getNumerator(), f1.getDenominator()));
		assertTrue(Fraction(f2.getNumerator(), f2.getDenominator()));
		Fraction f = f1.divide(f2);
		assertEquals(f, f7);
		System.out.println(f);
	
	}
	@Test
	public void equalsTest(){
		assertTrue(Fraction(f1.getNumerator(), f1.getDenominator()));
		assertTrue(Fraction(f3.getNumerator(), f3.getDenominator()));
		assert(f1.equals(f3)); 
		System.out.println(f1.equals(f3));
		
	}
	
	@Test
	public void toStringTest(){
		assertEquals(f1.toString(), "1 / 2");
		System.out.println(f1.toString());
	}
	

	@SuppressWarnings("static-access")
	@Test
	public void valueOfTest(){
		Fraction f = Fraction.valueOf(1, 2);
		assertEquals(f, f1);
		System.out.println(f1.valueOf(1, 2));
	}
	

	@Test
	public void doubleValueTest(){
		Double d = f1.doubleValue();
		assertEquals(d, Double.valueOf(0.5));
		System.out.println(d);

	}
	
	@Test
	public void intValueTest(){
		Integer i = f1.intValue();
		assertEquals(i, Integer.valueOf(0));
		System.out.println(i);
	}
	
	@Test
	public void floatValueTest(){
		Float f = f1.floatValue();
		assertEquals(f, Float.valueOf((".5")));
		System.out.println(f);
		
	}
	
	@Test 
	public void longValueTest(){
		Long l = f1.longValue();
		assertEquals(l, Long.valueOf(("0.5")));
		System.out.println(l);
	}
	
}
	

