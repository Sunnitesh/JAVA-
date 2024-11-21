//q23a:
public class q23 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + "\t");
            }
            System.out.println();
        }

    }
}
//q23b:
//public class q23 {
//    public static void main(String[] args) {
//        int rows = 4;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = i; j > 0; j--) {
//                System.out.print(j + " ");
//            }
//            for (int j = 2; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//
//    }