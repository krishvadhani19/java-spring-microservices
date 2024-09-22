
class A {

    public void showTheDataWhichBelongsToTheClass() {
        System.out.println("In show of A");
    }
}

class B extends A {

    @Override
    public void showTheDataWhichBelongsToTheClass() {
        System.out.println("In show of B");
    }
}

public class Demo {

    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToTheClass();
    }
}
