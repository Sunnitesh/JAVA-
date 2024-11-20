import java.util.Scanner;
public class q18 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int num = ad.nextInt();
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
