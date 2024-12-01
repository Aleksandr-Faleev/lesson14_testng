public class FactorialCalculator {
    public FactorialCalculator() {
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определён.");
        } else if (n == 0) {
            return 1;
        } else {
            long result = 1;

            for(int i = 1; i <= n; ++i) {
                result *= (long)i;
            }

            return result;
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Факториал " + number + " = " + factorial(number));
    }
}

