
class Calculator {

    int num = 5;

    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class Test {

    public static void main(String[] args) {
        int data = 10;

        Calculator obj = new Calculator();
        int r1 = obj.add(3, 4);
        System.out.println(r1);

        Calculator obj1 = new Calculator();
        // Make changes to one of the objects wont affect the other one
        obj1.num = 10;

        System.out.println("Obj1 num var:" + obj1.num);
        System.out.println("Obj1 num var:" + obj.num);
    }
}

/**
 * Refer the image:
 *
 * Methods are created as Stack in JVM main: 
 
 * 1. JVM creates a main method stack
 * 2. var data as key value pair is created 
 * 3. A Calculator object is created which is stored in heap 
 * 4. Lets suppose the calculator object has address "101" 
 * 5. Calculator object with its address as key values pair is added to
 * the main method 
 * 6. This Calculator Object in heap has var num assigned 5 and add method 
 * 7. While compilation this add method creates a new Stack which has var n1 and n2 
 * 8. This is how memory allocation takes place in JVM
 */
