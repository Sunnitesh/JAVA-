class p6 {
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        p6 obj = new p6();
        obj.display(10);
        obj.display("Hello");
    }
}
