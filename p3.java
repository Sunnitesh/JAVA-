class p3 {
    int number;
    String text;

    p3(int num, String txt) {
        number = num;
        text = txt;
        System.out.println("Parameterized constructor called.");
    }


    void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
       p3 obj = new p3(42, "Hello, World!");
        obj.display();
    }
}

