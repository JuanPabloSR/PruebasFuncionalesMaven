package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    //resta

    @Test
    @DisplayName("Testing subtract: 3+1=2")
    public void subtract() {
        // Arrange
        Long number1 = 3L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.subtract(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several subtract")
    @ParameterizedTest(name = "{3} - {1} = {2}")
    @CsvSource({
            "2,    1,   1",
            "10,    2,   8",
            "49,  9, 40",
            "100,  99, 1"
    })
    public void severalSubtract(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtract(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }


    //Multiplicacion

    @Test
    @DisplayName("Testing multiply: 3*2=6")
    public void multiply() {
        // Arrange
        Long number1 = 3L;
        Long number2 = 2L;
        Long expectedValue = 6L;

        // Act
        Long result = basicCalculator.multiply(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several multiply")
    @ParameterizedTest(name = "{3} * {2} = {6}")
    @CsvSource({
            "2,    1,   2",
            "10,    2,   20",
            "49,  1, 49",
            "100,  2, 200"
    })
    public void severalMultiply(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiply(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }
    //division
    @Test
    @DisplayName("Testing divisions: 1/1=1")
    public void division() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.division(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several divisions")
    @ParameterizedTest(name = "{0} / {1} = {1}")
    @CsvSource({
            "1,    1,   1",
            "12,    6,   2",
            "49,  7, 7",
            "100,  10, 10"
    })
    public void severalDivions(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.division(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }
}
