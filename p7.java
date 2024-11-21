
class p7 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends p7 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    public static void main(String[] args) {
        p7 animal = new Dog();
        animal.sound(); // Method overriding in action
    }
}
//p7=animal