public class q9 {
    public static void main(String[] args) {
        int a = 12;
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + a + " is " + factorial);
    }
}
