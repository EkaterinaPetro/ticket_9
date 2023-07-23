public class Divider {
    public double divide(double dividend, double divisor) throws DivisionByZeroException{
        if (divisor == 0) {
            throw new DivisionByZeroException("Деленение на ноль недопустимо");
        }
        return dividend / divisor;
    }
}
