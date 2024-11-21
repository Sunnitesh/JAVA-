class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {

    public void bark() {
        System.out.println("The dog barks.");
    }
}
class Cat extends Animal {
    public void meow() {
        System.out.println("The cat meows.");
    }
}

public class p5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        dog.bark();
        cat.eat();
        cat.meow();
    }
}

