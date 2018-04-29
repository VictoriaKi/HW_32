package core;

import static org.junit.Assert.*;
import org.junit.*;

public class CalcTest {

	static double divide(double a, double b) {
		return a / b;
	}
	
	static double divide(double a, double b, double c) {
		return a / b / c;
	}

	static double divide(double a, double b, double c, double d) {
		return a / b / c / d;
	}

	static double add(double a, double b) {
		return a + b;
	}

	static double add(double a, double b, double c) {
		return a + b + c;
	}

	static double add(double a, double b, double c, double d) {
		return a + b + c + d;
	}

	static double subtract(double a, double b) {
		return a - b;
	}

	static double subtract(double a, double b, double c) {
		return a - b - c;
	}

	static double subtract(double a, double b, double c, double d) {
		return a - b - c - d;
	}

	static double multiply(double a, double b) {
		return a * b;
	}

	static double multiply(double a, double b, double c) {
		return a * b * c;
	}

	static double multiply(double a, double b, double c, double d) {
		return a * b * c * d;
	}

	@Test // @Ignore
	public void test_01_01_DivideTwoParam() {
		assertEquals("Not correct", divide(25.0, 2.0), 12.5, 0.09);
	}
	@Test 
	public void test_01_02_DivideThreeParam() {
		assertEquals("Not correct", divide(125.0, 5.0, 5.0), 5.0, 0.09);
	}
	
	@Test 
	public void test_01_03_DivideFourParam() {
		assertEquals("Not correct", divide(850.0, 50.0, 2.0, 9), 0.94, 0.09);
	}
	
	@Test 
	public void test_02_01_AddTwoParam() {
		assertEquals("Not correct", add(5.5, 6.6), 12.1, 0.09);
	}
	
	@Test 
	public void test_02_02_AddThreeParam() {
		assertEquals("Not correct", add(1.0, 2.0, 3.0), 6, 0.09);
	}
	
	@Test 
	public void test_02_03_AddFourParam() {
		assertEquals("Not correct", add(111.1, 222.2, 333.3, 444.4), 1111.0, 0.09);
	}

	@Test
	public void test_03_01_SubtractTwoParam() {
		assertEquals("Not correct", subtract(50.0, 50.0), 0.0, 0.09);
	}
	
	@Test
	public void test_03_02_SubtractThreeParam() {
		assertEquals("Not correct", subtract(-50.9, -48.7, -2.2), 0.0, 0.09);
	}
	
	@Test
	public void test_03_03_SubtractFourParam() {
		assertEquals("Not correct", subtract(2.0, 4.0, 6.0, 8.0), -16.0, 0.09);
	}

	@Test
	public void test_04_01_MultiplyTwoParam() {
		assertEquals("Not correct", multiply(1.0, 1.0), 1.0, 0.09);
	}
	
	@Test
	public void test_04_02_MultiplyThreeParam() {
		assertEquals("Not correct", multiply(5.0, 5.0, 5.0), 125.0, 0.09);
	}
	
	@Test
	public void test_04_03_MultiplyFourParam() {
		assertEquals("Not correct", multiply(1.12, 2.22, 3.34, 1.0), 8.3, 0.09);
	}
}
