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

	@Test
	public void TestSeven() {
		String result = RomanNumerals.ConvertToNumeral(7);
		assertEquals(result, "VII");
	}

    @Test
    public void TestEight() {
        String result = RomanNumerals.ConvertToNumeral(8);
        assertEquals(result, "VIII");
    }

    @Test
    public void TestNine() {
        String result = RomanNumerals.ConvertToNumeral(9);
        assertEquals(result, "IX");
    }

	@Test
	public void TestTen() {
		String result = RomanNumerals.ConvertToNumeral(10);
		assertEquals(result, "X");
	}

	@Test
	public void TestEleven() {
		String result = RomanNumerals.ConvertToNumeral(11);
		assertEquals(result, "XI");
	}

	@Test
	public void TestTwelve() {
		String result = RomanNumerals.ConvertToNumeral(12);
		assertEquals(result, "XII");
	}

	@Test
	public void TestThirteen() {
		String result = RomanNumerals.ConvertToNumeral(13);
		assertEquals(result, "XIII");
	}

	@Test
	public void TestFourteen() {
		String result = RomanNumerals.ConvertToNumeral(14);
		assertEquals(result, "XIV");
	}

	@Test
	public void TestFifteen () {
		String result = RomanNumerals.ConvertToNumeral(15);
		assertEquals(result, "XV");
	}

	@Test
	public void TestSixteen() {
		String result = RomanNumerals.ConvertToNumeral(16);
		assertEquals(result, "XVI");
	}

	@Test
	public void TestSeventeen() {
		String result = RomanNumerals.ConvertToNumeral(17);
		assertEquals(result, "XVII");
	}

	@Test
	public void TestEighteen() {
		String result = RomanNumerals.ConvertToNumeral(18);
		assertEquals(result, "XVIII");
	}

	@Test
	public void NineEighteen() {
		String result = RomanNumerals.ConvertToNumeral(19);
		assertEquals(result, "XIX");
	}
}

