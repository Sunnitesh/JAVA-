import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("enter first no.");
        int a = ad.nextInt();
        System.out.println("enter second no.");
        int b = ad.nextInt();
        System.out.println("enter third no.");
       int c = ad.nextInt();
       if (a>=b && a>=c){
           System.out.println("a is greatest");

       } else if (b>=a && b>=c) {
           System.out.println("b is greatest");
       }
       else
           System.out.println("c is greatest");
    }
}
