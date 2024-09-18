
class A {

    public int show() {
        System.out.println("in show of A");

        return -1;
    }

    public void config() {
        System.out.println("in config of A");
    }
}

class B extends A {

    // this is how you override child method with parent method
    @Override
    public int show() {
        System.out.println("in show of B");

        return 1;
    }
}

public class Intro {

    public static void main(String[] args) {
        B objB = new B();
        objB.show();
    }
}

/**
 * Here in method overriding you MUST have the same name to override and
 * also MUST have SAME PARAMETER
 * 
 * 1. Same Name
 * 2. Same return type
 * 3. Same Params
 * 4. Same access modifiers: public, private, protected
 */
