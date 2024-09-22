
public class Demo {

    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        try {
            j = 18 / i;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in yur limit");
        } catch (Exception e) {
            System.out.println("something went wrong");
        }

        System.out.println("Value of j:" + j);

        System.out.println("Bye");
    }
}

/**
 * Three types of error: 1. Compile time error 2. Runtime error 3. Logical error
 */
