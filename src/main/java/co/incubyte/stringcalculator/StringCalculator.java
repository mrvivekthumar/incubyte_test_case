package co.incubyte.stringcalculator;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",";
        String numbersToProcess = numbers;

        // Check if custom delimiter is specified
        if (numbers.startsWith("//")) {
            int delimiterEnd = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterEnd);
            numbersToProcess = numbers.substring(delimiterEnd + 1);
        }

        // Replace newlines with the delimiter, then split
        String normalizedNumbers = numbersToProcess.replace("\n", delimiter);

        // Escape special regex characters in delimiter
        String[] parts = normalizedNumbers.split(java.util.regex.Pattern.quote(delimiter));

        int sum = 0;
        for (String part : parts) {
            if (!part.isEmpty()) { // Skip empty parts
                sum += Integer.parseInt(part);
            }
        }
        return sum;
    }
}
