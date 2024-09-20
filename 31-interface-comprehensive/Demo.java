
interface A {

    /*
     * All variables in interface are final and static
     */
    int age = 44;
    String area = "Mumbai";

    void show();

    void config();

    // No need to override default methods
    default void test() {
        System.out.println("in test method");
    }

    static void info() {
        System.out.println("Inside info");
    }
}

interface X {

    public void show();
}

class B implements A, X {

    @Override
    public void show() {
        System.out.println("In show");
    }

    @Override
    public void config() {
        System.out.println("In config");
    }
}

public class Demo {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
        obj.test();

        // static only can be accessed via interface 
        A.info();

        System.out.println(obj.area);
    }
}

/**
 * Every method in interface is public and abstract no need to mention it. Every
 * abstract not public method in interface needs to be overridden by the
 * implementing class
 */

/*
  * Key Points about Interfaces in Java:
  * 1. Abstract Methods: All methods in an interface are abstract by default (until Java 8, where default and static methods were introduced).
  * 2. Implementation: A class that implements an interface must provide concrete implementations for all of its methods.
  * 3. Multiple Inheritance: Java doesn't support multiple inheritance with classes, but a class can implement multiple interfaces.
  * 4. Default Methods: Java 8 introduced default methods in interfaces. A default method has a body, and implementing classes are not required to override it unless they want to change its behavior.
  * 5. Static Methods: Interfaces can also have static methods, which can be called on the interface itself.
  * 6. Variables in Interfaces: All variables declared in an interface are implicitly public, static, and final, meaning they are constants.
  * 
 */
