public class Main {
    public static void main(String[] args) {
        Divider divider = new Divider();
        double dividend = 10;
        double divisor = 0;

        try {
            double result = divider.divide(dividend, divisor);
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}