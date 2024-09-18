
class Calculator {

    private String name = "Krish";

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    public int addition(int n1, int n2) {
        return n1 + n2;
    }

    public int subtraction(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvancedCalculator extends Calculator {

    public int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public int division(int n1, int n2) {
        return n1 / n2;
    }
}

// Multi level inheritance
class ScientificCalculator extends AdvancedCalculator {
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class Intro {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int r1 = cal.addition(4, 7);
        int r2 = cal.subtraction(10, 8);
        System.out.println("Addition:" + r1);
        System.out.println("Subtraction" + r2);

        AdvancedCalculator advCal = new AdvancedCalculator();

        advCal.setName("Bakchodi");
        System.out.println(advCal.getName());

        ScientificCalculator sCal = new ScientificCalculator();
        System.out.println(sCal.power(3, 5));
    }
}
