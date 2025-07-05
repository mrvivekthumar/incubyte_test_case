package co.incubyte.stringcalculator;

import java.util.ArrayList;
import java.util.List;

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
        String[] parts = normalizedNumbers.split(java.util.regex.Pattern.quote(delimiter));

        // Check for negative numbers
        List<Integer> negativeNumbers = new ArrayList<>();
        int sum = 0;

        for (String part : parts) {
            if (!part.isEmpty()) {
                int number = Integer.parseInt(part);
                if (number < 0) {
                    negativeNumbers.add(number);
                }
                sum += number;
            }
        }

        // Throw exception if negative numbers found
        if (!negativeNumbers.isEmpty()) {
            StringBuilder message = new StringBuilder("negative numbers not allowed: ");
            for (int i = 0; i < negativeNumbers.size(); i++) {
                if (i > 0) {
                    message.append(", ");
                }
                message.append(negativeNumbers.get(i));
            }
            throw new IllegalArgumentException(message.toString());
        }

        return sum;

    }
}
