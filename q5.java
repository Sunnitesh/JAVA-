import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("value in miles");
        int a =ad.nextInt();
        double b = 1.609344*a;
        System.out.println("value in km:" +b);

    }
}
