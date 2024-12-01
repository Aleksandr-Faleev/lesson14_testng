import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(FactorialCalculator.factorial(0), 1); // Факториал 0 равен 1
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(FactorialCalculator.factorial(5), 120); // Факториал 5 равен 120
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(FactorialCalculator.factorial(1), 1); // Факториал 1 равен 1
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Факториал не определен для отрицательных чисел.")
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.factorial(-1); // Факториал отрицательного числа вызывает исключение
    }

    private static class FactorialCalculator {
        public static long factorial(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Факториал не определен для отрицательных чисел."); // Исключение для отрицательных чисел
            }
            if (i == 0 || i == 1) {
                return 1; // Факториал 0 и 1 равен 1
            }
            long result = 1;
            for (int j = 2; j <= i; j++) {
                result *= j; // Вычисляем факториал
            }
            return result;
        }
    }
}