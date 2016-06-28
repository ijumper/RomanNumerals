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

		if (Number < 5) {

			numeral = "I" + numeral;
		}
		else if (Number > 5) {

            if (Number > 8 ) {
                numeral = ConvertIntegersGreaterThanEightToNumeral(Number);
            } else {
                for (int i = 5; i < Number; i++) {
                    numeral = numeral + "I";
                }
            }
		}
		return numeral;
	}

    private static String ConvertIntegersGreaterThanEightToNumeral(int Number) {

        String numeral = "X";

        if (Number < 10) {
            numeral = "I" + numeral;
        } else {

            if (Number < 14) {
                for (int i = 10; i < Number; i++) {
                    numeral = numeral + "I";
                }
            } else {
                ConvertIntegersGreaterThanThirteenToNumeral(Number);
            }
        }

        return numeral;

    }

    private static String ConvertIntegersGreaterThanThirteenToNumeral(int Number) {
        return "stinrer";
    }

}

