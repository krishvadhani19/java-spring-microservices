
public class Test {

    public static void main(String[] args) {
        /*
         * You use do while when wanna execute the loop the once although the condition fails for the very first time
         */

        int i = 0;

        do {
            System.out.println("Heyy" + i);
            i++;
        } while (i < 5);

        System.out.println("Bye");
    }

}
