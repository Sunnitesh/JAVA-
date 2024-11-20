import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        System.out.println("enter marks of 4 subject");
        Scanner ad = new Scanner(System.in);
        float a = ad.nextInt();
        float b = ad.nextInt();
        float c = ad.nextInt();
        float d = ad.nextInt();
        float per;
        per= (a+b+c+d)/400 * 100 ;
        System.out.println(per);
        if(per>=90){
            System.out.println("grade A");
        }
        else if (per>=80){
            System.out.println("grade B");

        } else if (per>=70) {
            System.out.println("grade c");

        } else if (per>=50) {
            System.out.println("grade d");

        }
        else
          System.out.println("grade f");
    }
}
