
class CustomException extends Exception {

    public CustomException(String exceptionMessage) {
        super(exceptionMessage);
    }
}

public class Demo {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new CustomException("I dont want the ans as zero");
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in yur limit");
        } catch (CustomException e) {
            System.out.println("Custom Exception");
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
