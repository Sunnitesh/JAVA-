import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = ad.nextInt(), reversed = 0;
        while (a!= 0) {
            reversed = reversed * 10 + a % 10;
            a /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}
