package uk.co.ijump.romannumerals;

public class RomanNumerals {


	public static String ConvertToNumeral(int Number) { 

		String numeral = "I";

		if (Number < 4) {
			for (int i = 1; i < Number; i++) {
				numeral = numeral + "I";
			}
		} else {
			numeral = ConvertIntegersGreaterThanThreeToNumeral(Number);
		}

		return numeral;
	}

	private static String ConvertIntegersGreaterThanThreeToNumeral(int Number) {

		String numeral = "V";

		if (Number < 10) {

            if (Number) {
			for (int i = Number; i < Number; i++) {
				numeral = numeral + "I";
			}
		}
		return numeral;
	}
}

