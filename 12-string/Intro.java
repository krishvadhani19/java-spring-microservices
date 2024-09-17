
public class Intro {

    public static void main(String[] args) {
        String name = new String("Krish");
        System.out.println(name);

        // charAt
        System.out.println(name.charAt(2));

        // concat
        System.out.println(name.concat(" vadhani"));

        // also initialize by directly passing it
        String x = "Krish";
        System.out.println(x);

        // update string
        x += " Vadhani";
        System.out.println(x);

        String s1 = "Krish";
        String s2 = "Krish";

        System.out.println(s1 == s2);
    }
}

/*
 * String is not primitive Data type char is
 * All strings are stored in String constant pool in Heap
 * And the main stack would have the address of the string in Heap from constant pool
 * 
 * Some interesting thing if you create a new same string it will not create a new space in Heap but will use the same address
 * and of its updated then new address is created
 */
