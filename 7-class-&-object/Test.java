
class Calculator {

    private String sexy(int num1) {
        return num1 + "Sexy";
    }

    public int add(int num1, int num2) {
        int ans = num1 + num2;

        System.out.println(this.sexy(num1));
        return ans;
    }
}

public class Test {

    public static void main(String[] a) {
        int num1 = 3;
        int num2 = 5;

        Calculator cal = new Calculator();
        int result = cal.add(num1, num2);

        System.out.println(result);
    }
}
