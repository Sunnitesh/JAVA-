class ThisKeywordDemo {
    int a;

    ThisKeywordDemo(int a) {
        this.a = a;
    }

    void display() {
        System.out.println("Value of a: " + this.a);
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo(10);
        obj.display();
    }
}
