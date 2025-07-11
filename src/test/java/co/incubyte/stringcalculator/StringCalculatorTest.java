package co.incubyte.stringcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void testNewLinesAndCommasReturnSum() {
        // Given
        String input = "1\n2,3";

        // When
        int result = calculator.add(input);

        // Then
        assertEquals(6, result);
    }

    @Test
    public void testNewLinesOnlyReturnSum() {
        // Given
        String input = "1\n2\n3";

        // When
        int result = calculator.add(input);

        // Then
        assertEquals(6, result);
    }

    @Test
    public void testCustomDelimiterReturnSum() {
        // Given
        String input = "//;\n1;2";

        // When
        int result = calculator.add(input);

        // Then
        assertEquals(3, result);
    }

    @Test
    public void testCustomDelimiterWithMultipleNumbers() {
        // Given
        String input = "//|\n1|2|3";

        // When
        int result = calculator.add(input);

        // Then
        assertEquals(6, result);
    }

    @Test
    public void testNegativeNumberThrowsException() {
        // Given
        String input = "-1,2";

        // When & Then
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.add(input);
        });

        assertEquals("negative numbers not allowed: -1", exception.getMessage());
    }

    @Test
    public void testMultipleNegativeNumbersThrowsException() {
        // Given
        String input = "1,-2,3,-4";

        // When & Then
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.add(input);
        });

        assertEquals("negative numbers not allowed: -2, -4", exception.getMessage());
    }
}
