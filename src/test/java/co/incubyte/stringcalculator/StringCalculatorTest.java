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
}
