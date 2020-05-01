package org.cleancodeba;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RomanNumberTest {
    @Test
    public void testCovertDecimalToRomanNumber() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};
        for (int i = 0; i < numbers.length; i++)
            assertEquals(romanNumbers[i],RomanNumber.fromDecimal(numbers[i]).getValue());
    }
}
