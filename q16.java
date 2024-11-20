import java.util.Scanner;
public class q16 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = ad.nextInt();
        int b = ad.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("HCF is: " + a);
    }
}
