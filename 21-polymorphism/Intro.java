
class A {

    static {
        System.out.println("Inside static of A");
    }

    public void show() {
        System.out.println("Inside show of A");
    }
}

class B extends A {

    public void showB() {
        System.out.println("Inside showB of B");
    }

    @Override
    public void show() {
        System.out.println("Inside show of B");
    }
}

class C extends A {

    @Override
    public void show() {
        System.out.println("Inside show of C");
    }
}

public class Intro {

    public static void main(String[] args) {
        /**
         * Here an instance of B is created: B extends A i.e B includes methods
         * and vars of A as well But here we specify that type of the instance
         * is of type A Now the instance objB cannot access methods of B
         */
        // A objB = new B();

        // Cannot do this
        // objB.showB();
        A objA = new A();
        objA.show();

        objA = new B();
        objA.show();

        objA = new C();
        objA.show();
    }
}

/**
 * Here initially we had objA as 101(suppose) And later we create new instance
 * in the same var now in the main stack objA as 105(suppose) now still the objA
 * is of type A but is assigned instance of B So will be able to access methods
 * of same name of A in B by that will override A by using method of B Output:
 * Inside show of B
 */
