interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

interface Interface3 {
    void method3();
}

interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void combinedMethod();
}

class BaseClass {
    void baseMethod() {
        System.out.println("Method from base class.");
    }
}

class ImplementingClass extends BaseClass implements CombinedInterface {
    public void method1() {
        System.out.println("Method1 from Interface1");
    }

    public void method2() {
        System.out.println("Method2 from Interface2");
    }

    public void method3() {
        System.out.println("Method3 from Interface3");
    }

    public void combinedMethod() {
        System.out.println("Combined method from CombinedInterface");
    }
}

public class InterfaceTest {
    public static void method1(Interface1 obj) {
        obj.method1();
    }

    public static void method2(Interface2 obj) {
        obj.method2();
    }

    public static void method3(Interface3 obj) {
        obj.method3();
    }

    public static void combinedMethod(CombinedInterface obj) {
        obj.combinedMethod();
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        method1(obj);
        method2(obj);
        method3(obj);
        combinedMethod(obj);
        obj.baseMethod();
    }
}
