import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTesting {
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int expected = 0;
        int actual = calculator.sum(-1, 1);
        assertEquals(expected, actual);
    }
}
