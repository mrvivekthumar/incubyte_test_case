# String Calculator TDD Kata

A Test-Driven Development exercise implementing a string calculator with incremental functionality.

## Project Structure

src/
├── main/java/co/incubyte/stringcalculator/
│   └── StringCalculator.java
└── test/java/co/incubyte/stringcalculator/
    └── StringCalculatorTest.java

## TDD Progress

### ✅ Step 1: Empty String Returns Zero

- **Test**: `testEmptyStringReturnsZero()`
- **Implementation**: Return 0 for empty string

### 🔄 Step 2: Single Number

- **Test**: `testSingleNumberReturnsValue()`
- **Implementation**: Parse single number

## Requirements Implemented

- [ ] Empty string returns 0
- [ ] Single number returns the number itself
<!-- - [ ] Two numbers, comma delimited, returns the sum
- [ ] Handle any amount of numbers
- [ ] Handle new lines between numbers
- [ ] Support different delimiters
- [ ] Throw exception for negative numbers -->

## Running Tests

```bash
mvn test
