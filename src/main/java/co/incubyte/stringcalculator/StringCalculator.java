package co.incubyte.stringcalculator;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        // Replace newlines with commas, then split on commas
        String normalizedNumbers = numbers.replace("\n", ",");
        String[] parts = normalizedNumbers.split(",");

        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }
        return sum;
    }
}
