class p4ConstructorOverloading {
    p4ConstructorOverloading() {
        System.out.println("Default constructor");
    }

    p4ConstructorOverloading(int x) {
        System.out.println("Parameterized constructor with value: " + x);
    }

    p4ConstructorOverloading(String str) {
        System.out.println("Parameterized constructor with string: " + str);
    }

    public static void main(String[] args) {
        p4ConstructorOverloading obj1 = new p4ConstructorOverloading();
        p4ConstructorOverloading obj2 = new p4ConstructorOverloading(10);
        p4ConstructorOverloading obj3 = new p4ConstructorOverloading("Hello");
    }
}
