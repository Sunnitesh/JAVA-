import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("enter a value of degree in celcius ");
        int a = ad.nextInt();
        int f ;
        f = ((9*a)/5)+32;
        System.out.println("the value in farenhite is:"+f);
    }
 }
