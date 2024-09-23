
public class Demo {

    public static void main(String[] args) {
        int i = 7;
        int j = 0;

        try {
            j = 18 / i;
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }

        System.out.println("Value of j:" + j);

        System.out.println("Bye");
    }
}

/**
 * Three types of error: 1. Compile time error 2. Runtime error 3. Logical error
 */
