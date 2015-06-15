/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tdd.Calculator;

/**
 * @author egerkav
 *
 */
public class CalcTest {
	
	private Calculator c;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		c = new Calculator();
	}

	@Test
	public void testAdd() {
		assertEquals(10, c.add(6,4));
	}
	
	@Test
	public void testSubtract() {
		assertEquals(2, c.subtract(6,4));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(24, c.multiply(6,4));
	}
	
	@Test
	public void testDivide() {
		assertEquals(2, c.divide(8,4));
	}

	// test Double variants
	@SuppressWarnings("deprecation")
	@Test
	public void testAddDouble() {
		assertEquals(10.2, c.add(6.2,4),0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSubtractDouble() {
		assertEquals(2.5, c.subtract(6,3.5),0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testMultiplyDouble() {
		assertEquals(33, c.multiply(6,5.5),0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testDivideDouble() {
		assertEquals(1.5, c.divide(6.0,4),0);
	}
	
	
	
}
