
import by.bntu.fitr.java.lab9.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class PashaTest {

    @Test
    public void sumTest() {
        int a = 1;
        int b = 3;
        int expected = a +b;
        assertEquals(expected, Calculator.sum(a, b));
    }

    @Test
    public void sTest() {
        int a = 3;
        int b = 1;
        int expected = a - b;
        assertEquals(expected, Calculator.sub(a, b));
    }

    @Test
    public void mulTest() {
        int a = 1;
        int b = 3;
        int expected = a * b;
        assertEquals(expected, Calculator.mul(a, b));
    }

    @Test
    public void divTest() {
        int a = 3;
        int b = 1;
        int expected = a / b;
        assertEquals(expected, Calculator.div(a, b));
    }

    @Test(expected = ArithmeticException.class)
    public void div_Test() {
        int a = 3;
        int b = 0;
        int expected = a / b;
        assertEquals(expected, Calculator.div(a, b));
    }
}
