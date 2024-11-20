import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = ad.nextInt();
        int b = ad.nextInt();
        int hcf = a;

        while (b != 0) {
            int temp = b;
            b = hcf % b;
            hcf = temp;
        }
        int lcm = (a*b)/hcf;
        System.out.println("LCM: " + lcm);
    }
}
