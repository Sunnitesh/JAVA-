import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("enter any no.");
        int a = ad.nextInt();
        if (a>=0){
            System.out.println("it is a positive no.");
        }
        else {
            System.out.println("it is a negative no.");
        }
    }
}
