package app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = Calculator.class)
@SpringBootTest
public class CalculatorTest {


    @Test
    public void testSum() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int result = calculator.sum(2, 2);
        // Then
            Assertions.assertEquals(4,result);

    }

    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(0, calculator.minus(2, 2));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(2, calculator.divide(6, 3));
    }

    //@Disabled
    @Test
    public void testDivideWillThrowExceptionWhenDivideOnZero(){
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(6, 0);
        });

    }
}
