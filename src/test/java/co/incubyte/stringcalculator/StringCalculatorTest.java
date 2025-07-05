package co.incubyte.stringcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    private StringCalculator calculator = new StringCalculator();

    @Test
    public void testEmptyStringReturnsZero() {
        // Given
        String input = "";

        // When
        int result = calculator.add(input);

        // Then
        assertEquals(0, result);
    }

    @Test
    public void testSingleNumberReturnsValue() {
        // Given
        String input = "1";

        // When
        int result = calculator.add(input);

        // Then
        assertEquals(1, result);
    }

    @Test
    public void testTwoNumbersReturnSum() {
        // Given
        String input = "1,5";

        // When
        int result = calculator.add(input);

        // Then
        assertEquals(6, result);
    }

    @Test
    public void testMultipleNumbersReturnSum() {
        // Given
        String input = "1,2,3,4,5";

        // When
        int result = calculator.add(input);

        // Then
        assertEquals(15, result);
    }
}
