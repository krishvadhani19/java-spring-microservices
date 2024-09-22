
@FunctionalInterface
interface A {

    void show(int i, int j);

    static void testStatic() {
        System.out.println("Inside Test Static");
    }

    default void testDefault() {
        System.out.println("Inside Test default");
    }

}

class B implements A {

    @Override
    public void show(int i, int j) {
        System.out.println("Inside show method" + "i:" + i + "j:" + j);
    }
}

public class FunctionalInterfaceLambda {

    public static void main(String[] args) {
        // A obj = new A() {

        //     @Override
        //     public void show() {
        //         System.out.println("Inner class");
        //     }
        // };
        // Rather that using this use lambda expression
        A obj = (int i, int j) -> {
            System.out.println("Inside Lambda" + " i:" + i + " " + "j:" + j);
        };

        A.testStatic();

        obj.testDefault();

        obj.show(5, 6);
    }
}

/*
 * an interface by default has methods that are public and abstract 
 * Functional Interface has only one abstract method also known as SAM(Single Abstraction Method)
 * A functional interface then too can have any number of default or static methods
 * Static interface methods can only be called using the interface
 * Default methods in the interface need not be overridden but you still can
 */

