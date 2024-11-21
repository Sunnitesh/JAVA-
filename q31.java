public class q31 {
    int i;
    // constructor with no parameter
    private q31() {
        i = 5;
        System.out.println("Constructor is called");
    }
    public static void main(String[] args) {
        // calling the constructor without any parameter
        q31 obj = new q31();
        System.out.println("Value of i: " + obj.i);
    }
}
