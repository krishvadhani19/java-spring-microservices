
class A {

    public void showA() {
        System.out.println("In show A");
    }
}

class B extends A {

    public void showB() {
        System.out.println("In show B");
    }
}

public class Demo {

    public static void main(String[] args) {
        // Trying to fit large item in smaller container
        A obj = new B();
        obj.showA();

        B obj1 = (B) obj;
        obj1.showB();
    }
}

/*
 * Object of B but type A in variable
 * i.e Object of Child but type of A => Upcasting
 * In upcasting you cannot use methods of child
 */

 /*
  * Downcasting is basically if you wanna fit a larger item(child) in instance of parent
  * This is called downcasting
 */
