class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}
public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            double result = calculateEquation(10, 0);
            System.out.println("Result: " + result);
        } catch (CustomArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            double result = calculateEquation(10, 5);
            System.out.println("Result: " + result);
        } catch (CustomArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static double calculateEquation(double a, double b) throws CustomArithmeticException {
        if (b == 0) {
            throw new CustomArithmeticException("CustomArithmeticException: Division by zero is not allowed.");
        }

        if (a < b) {
            throw new CustomArithmeticException("CustomArithmeticException: A cannot be smaller than B in this equation.");
        }
        return a / b + a - b;
    }
}