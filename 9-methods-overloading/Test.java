
class Calculator {

    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    public int addition(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public float division(int num1, int num2) {
        return (float) num1 / num2;
    }
}

public class Test {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.division(22, 7));
    }
}

/**
 * Method Overloading is basically having multiple methods with the same name
 * But different parameters or return type
 */
