
import child.A;
import child.B;

class C extends A {
    public void show() {
        System.out.println(nameProtected);
    }
}

public class Intro {

    public static void main(String[] args) {
        A objA = new A();
        objA.show();


        B objB = new B();
        objB.show();

    }
}


/*
    * Private variables can only be used in the same class
 */
