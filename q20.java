import java.util.Scanner;
public class q20 {
    public static void main(String[] args) {
        Scanner ad =new Scanner(System.in);
        System.out.println("enter a number:");
        int a = ad.nextInt();
        if (a==0||a==1){
            return;
        }
        for (int i=2;i<a/2;++i){
            if(a%i==0){
                System.out.println("not a prime number");
            }
        else{
                System.out.println("prime number");
            }
        }

    }
}
