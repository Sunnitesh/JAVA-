import java.util.Arrays;
import java.util.Scanner;
public class q22 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int a = ad.nextInt();

        int[] numbers = new int[a];
        System.out.println("Enter the elements:");
        for (int i = 0; i < a; i++) {
            numbers[i] = ad.nextInt();
        }
        Arrays.sort(numbers);
        double median;
        if (a % 2 == 0) {
            median = (numbers[a / 2 - 1] + numbers[a / 2]) / 2.0;
        } else {
            median = numbers[a/ 2];
        }
        System.out.println("Median: " + median);

    }
}
