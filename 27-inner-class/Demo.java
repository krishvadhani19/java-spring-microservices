
class A {

    int age;

    public void show() {
        System.out.println("Inside show");
    }

    static class B {

        public void config() {
            System.out.println("Inside config B");
        }
    }

    class C {

        public void config() {
            System.out.println("Inside config C");
        }
    }
}

public class Demo {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();
        obj1.config();

        A.C obj2 = obj.new C();
        obj2.config();
    }
}

/**
 * To access inner class an instance of class is needed:
 */
