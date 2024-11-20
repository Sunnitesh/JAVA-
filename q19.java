import java.util.Scanner;
public class q19 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int num = ad.nextInt();
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        if (originalNum == reversedNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
