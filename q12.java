import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
       Scanner ad = new Scanner(System.in);
        System.out.println("enter the marks oof three subjects:");
        int phy = ad.nextInt();
        int mat = ad.nextInt();
        int chem = ad.nextInt();
        int t = phy + mat + chem;
        int pm = phy + mat;
        if (phy >= 70 && chem >= 60 && mat >= 70
                && (t >= 225 || pm >= 150)){ ;
        System.out.println("eligible");}
       else{
            System.out.println("not eligible");
        }
    }
}
