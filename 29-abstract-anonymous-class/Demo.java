
abstract class A {

    abstract void show();
}

public class Demo {

    public static void main(String[] args) {
        A obj = new A() {

            @Override
            public void show() {
                System.out.println("inside anonymous inner abstract class");
            }
        };

        obj.show();
    }
}
