
// abstract class Computer {
//     public abstract void code();
// }
interface Computer {

    void code();
}

class Laptop implements Computer {

    @Override
    public void code() {
        System.out.println("Code compile and run");
    }
}

class Desktop implements Computer {

    @Override
    public void code() {
        System.out.println("Code compiler and run faster");
    }
}

class Developer {

    public void devApp(Computer comp) {
        comp.code();
    }
}

public class Demo {

    public static void main(String[] args) {
        Developer krish = new Developer();

        Computer compL = new Laptop();
        Computer compD = new Desktop();

        krish.devApp(compD);
    }
}
