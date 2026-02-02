package calculator;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BasicOperationsTest {

    private final BasicOperations calc = new BasicOperations();

    @Test
    @DisplayName("Addition: 2 + 3 = 5")
    void testAdd() {
        assertEquals(5.0, calc.add(2, 3), "Simple addition should work");
    }

    @Test
    @DisplayName("Subtraction: 10 - 4 = 6")
    void testSubtract() {
        assertEquals(6.0, calc.subtract(10, 4), "Simple subtraction should work");
    }

    @Test
    @DisplayName("Multiplication: 3 * 4 = 12")
    void testMultiply() {
        assertEquals(12.0, calc.multiply(3, 4), "Simple multiplication should work");
    }

    @Test
    @DisplayName("Division: 10 / 2 = 5")
    void testDivide() {
        assertEquals(5.0, calc.divide(10, 2), "Simple division should work");
    }

    @Test
    @DisplayName("Division by Zero: Should throw ArithmeticException")
    void testDivideByZero() {
        // Ce test vérifie que ton code gère bien l'erreur critique
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        }, "Division by zero must throw an ArithmeticException");
    }
}