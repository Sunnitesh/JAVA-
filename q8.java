import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int a =45;
        System.out.println("enter a no.:");
        int b = ad.nextInt();
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
        } else if (a % b == 0) {
            System.out.println(a + " is divisible by " + b + ".");
        } else {
            System.out.println(a+ " is not divisible by " + b + ".");
        }

    }
}
