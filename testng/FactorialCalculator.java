public class FactorialCalculator {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Факториал " + number + " = " + factorial(number));
    }
}

