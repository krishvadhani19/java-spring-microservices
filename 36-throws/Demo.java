
class A {

    public void show() throws ClassNotFoundException {
        Class.forName("Demo");
    }
}

public class Demo {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}

/**
 * Its like the class A might throw ClassNotFoundException
 * And the main class must either catch the exception or declare like the A class
 */
