
public class Demo {

    public static void main(String[] args) {
        int num = 7;
        // boxing
        // Integer num1 = new Integer(num);

        // Autoboxing
        Integer num2 = num;

        /*
        * Integer is a wrapper class that encapsulates int in an object.
        Use:
            1. ArrayList<Integer>
            2. Methods - Integer.parseInt(), Integer.compare(), Integer.toString()
            3. Integer objects are stored in heap memory and int variables are stored in stack memory
                which is slightly slower to access than stack memory
            
            int is generally preferred when you need to perform arithmetic operations and when you don't need the additional features provided by the Integer class.
            Integer is used when you need an object, like when working with collections (List<Integer>, Map<Integer, String>), or when you need to leverage its methods.
         */
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3 * 2);
    }
}
