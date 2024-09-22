
@FunctionalInterface
interface X {

    int add(int i, int j);
}

public class Demo {

    public static void main(String[] args) {
        X obj = (int i, int j) -> i + j;

        int result = obj.add(5, 7);

        System.out.println(result);
    }
}

/*
 * Lambda expression only works with functional interface
 */
