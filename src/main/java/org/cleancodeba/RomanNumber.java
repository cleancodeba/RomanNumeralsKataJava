package org.cleancodeba;

public class RomanNumber {
	private Integer decimalValue;
	private String value;

	private RomanNumber(Integer decimalValue) {
		this.decimalValue = decimalValue;
		this.value = convertDecimalToRomanNumber(this.decimalValue);
	}

	public static RomanNumber fromDecimal(Integer decimalValue){
		return new RomanNumber(decimalValue);
	}

	public Integer getDecimalValue() {
		return decimalValue;
	}

	public String getValue() {
		return value;
	}

	private String convertDecimalToRomanNumber(int number) {
		StringBuilder romanNumber = new StringBuilder();
		int[] numbersToCompare = {10, 9, 5, 4, 1};
		String[] romanNumbers = {"X", "IX", "V", "IV", "I"};

		for (int i = 0; i < numbersToCompare.length; i++)
			for (;number >= numbersToCompare[i]; number -= numbersToCompare[i])
				romanNumber.append(romanNumbers[i]);

		return romanNumber.toString();
	}
}
