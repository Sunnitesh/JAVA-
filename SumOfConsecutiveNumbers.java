import java.util.Scanner;
public class SumOfConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.next();

        int sum = 0;
        StringBuilder expression = new StringBuilder();

        for (int i = 0; i < number.length() - 1; i++) {
            int num = Integer.parseInt(number.substring(i, i + 2));
            sum += num;
            if (i > 0) expression.append("+");
            expression.append(num);
        }

        System.out.println(expression + " = " + sum);
        scanner.close();
    }
}
