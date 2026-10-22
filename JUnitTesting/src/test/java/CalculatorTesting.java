import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTesting {
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int expected = 0;
        int actual = calculator.sum(-1, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        assertEquals(0, calculator.subtract(1, 1));
    }

    @Test
    public void testSubtract2() {
        assertEquals(1, calculator.subtract(0, -1));
    }

    @Test
    public void testMultiply() {
        assertEquals(-4, calculator.multiply(2, -2));
    }

    @Test
    public void testDivide() {
        assertEquals(1, calculator.divide(4, 4));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    public void testIsEven() {
        assertEquals(true, calculator.isEven(2));
    }
}
