
class A {

    public A() {
        System.out.println("In default constructor A");
    }

    public A(int x) {
        System.out.println("In parameterized constructor A");
    }
}

class B extends A {

    public B() {
        super(69);
        System.out.println("In default constructor of B");
    }

    public B(int x) {
        this();
        System.out.println("In parametrized constructor of B");
    }
}

public class Intro {

    public static void main(String[] args) {
        B objB = new B(22);
    }
}

/**
 * Every constructor no matter what will have a super(); so if you wish to use
 * the parent constructor other than default you gotta use the super() And pass
 * in the params acc to need of which constructor is required
 */
/**
 * Every class in java extends to Object class Also this() executes the default
 * constructor of that class
 */
/**
 * In the above code, flow of constructors
 * 1. Parameterized constructor of A
 * 2. Default of B
 * 3. Parameterized of B
 */
