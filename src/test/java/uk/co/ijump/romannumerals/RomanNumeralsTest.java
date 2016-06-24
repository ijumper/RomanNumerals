package uk.co.ijump.romannumerals;

import static org.junit.Assert.*;
import org.junit.*;


public class RomanNumeralsTest {

	RomanNumerals rn = new RomanNumerals();
	
	@Test
	public void TestOne() {
		String result = RomanNumerals.ConvertToNumeral(1);
		assertEquals(result, "I");
	}

	@Test
	public void TestTwo() {
		String result = RomanNumerals.ConvertToNumeral(2);
		assertEquals(result, "II");
	}

	@Test
	public void TestThree() {
		String result = RomanNumerals.ConvertToNumeral(3);
		assertEquals(result, "III");
	}

	@Test
	public void TestFour() {
		String result = RomanNumerals.ConvertToNumeral(4);
		assertEquals(result, "IV");
	}

	@Test
	public void TestFive() {
		String result = RomanNumerals.ConvertToNumeral(5);
		assertEquals(result, "V");
	}

	@Test
	public void TestSix() {
		String result = RomanNumerals.ConvertToNumeral(6);
		assertEquals(result, "VI");
	}

}

