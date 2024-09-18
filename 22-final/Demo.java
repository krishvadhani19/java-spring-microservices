
class Calculator {

    public void add(int a, int b) {
        System.out.println("Sum:" + (a + b));
    }

    public final void show() {
        System.out.println("In show of calculator");
    }
}

class AdvCalculator extends Calculator {

    // @Override
    // You cannot override final methods 
    // public void show() {
    //     System.out.println("Inside AdvCalculator");
    // }
}

public class Demo {

    static final String VERSION = "1.2.3";

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        cal.show();
        cal.add(4, 5);

        AdvCalculator advCal = new AdvCalculator();
        advCal.show();
    }
}

/*
 * Final variables cannot be changed
 */

/*
 * Final classes cannot be extended
 */

 /*
  * Method overriding can be stopped using final in the method
 */
