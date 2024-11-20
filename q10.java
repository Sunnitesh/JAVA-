import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int a = ad.nextInt();
        int first = 0, second = 1;
        for (int i = 1; i <=a ; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
