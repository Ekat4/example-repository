import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTests {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        // Базовый случай
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
        // Умножение на ноль
        assertEquals(0, calculator.multiply(5, 0), "5 * 0 should equal 0");
        // Отрицательные числа
        assertEquals(-6, calculator.multiply(2, -3), "2 * -3 should equal -6");
        // Отрицательные на отрицательные
        assertEquals(6, calculator.multiply(-2, -3), "-2 * -3 should equal 6");
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        // Базовый случай
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should equal 2");
        // Деление на 1
        assertEquals(5, calculator.divide(5, 1), "5 / 1 should equal 5");
        // Деление нуля
        assertEquals(0, calculator.divide(0, 5), "0 / 5 should equal 0");
        // Отрицательные числа
        assertEquals(-2, calculator.divide(6, -3), "6 / -3 should equal -2");
        // Отрицательные на отрицательные
        assertEquals(2, calculator.divide(-6, -3), "-6 / -3 should equal 2");
    }

    @Test
    void testDivideByZero() {
        Calculator calculator = new Calculator();
        // Проверка исключения при делении на ноль
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(5, 0),
                "Dividing by zero should throw ArithmeticException"
        );
        assertEquals("Division by zero", exception.getMessage(), "Exception message should be 'Division by zero'");
    }

    // Другие тесты...
}
