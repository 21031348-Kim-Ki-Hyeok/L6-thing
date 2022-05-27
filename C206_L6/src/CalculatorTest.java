import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Kim Ki Hyeok
 * Student ID: 21031348
 * Class: W65E
 * Date/Time created: Friday 27-05-2022 11:41
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * ender, May 27, 2022 11:41:40 AM
 */

public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
		
	}
	
	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	@Test
	public void testAddZero() {
		int a = 1010;
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 1010;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtract() {
		int a = 6969;
		int b = 1111;
		
		Calculator cal = new Calculator();
		int actl = cal.subtract(a, b);
		
		int expected = 5858;
		assertEquals (expected, actl);
		}
	
	@Test
	public void testSubtractNegative() {
		int a = 1000;
		int b = 1001;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = -1;
		assertEquals(expected, actual);	
	}
	
	public void testMultiply() {
		int a = 10;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		int expected = 100;
		assertEquals(expected, actual);
	}
	
	public void testMultiplyZero() {
		int a = 10;
		int b = 0;
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	public void testDivide() {
		int a = 100;
		int b = 10;
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 0;
		assertEquals(expected, actual);
	}
}

