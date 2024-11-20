import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = ad.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
