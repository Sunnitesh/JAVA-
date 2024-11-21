class Parent {
    static void display() {
        System.out.println("Parent's static display method");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child's static display method");
    }
}
public class p8 {
    public static void main(String[] args) {
        Parent.display();
        Child.display();
    }
}

