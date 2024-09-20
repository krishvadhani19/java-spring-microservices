
class A {

    public void show() {
        System.out.println("Inside show of A");
    }
}

// class B extends A {
//     @Override
//     public void show() {
//         System.out.println("Inside show of B");
//     }
// }
public class Demo {

    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("Anonymous inner class");
            }
        };
        obj.show();
    }
}

/**
 * An anonymous inner class in Java is a type of inner class that doesn't have a
 * name and is used for instantiating objects with certain modifications,
 * usually to override methods of an existing class or implement an interface.
 * It's often used when you need to create a one-time use class with minor
 * changes to the behavior of an existing class or interface, without creating a
 * separate named class.
 */
