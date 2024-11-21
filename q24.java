import java.util.Scanner;
public class q24 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int a = ad.nextInt();
        int[] numbers = new int[a];
        int sum = 0;
        System.out.println("Enter elements:");
        for (int i = 0; i < a; i++) {
            numbers[i] = ad.nextInt();
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / a);
      }
    }

