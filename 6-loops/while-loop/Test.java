
public class Test {

    public static void main(String[] args) {
        int i = 0;

        while (i < 5) {
            System.out.println("Heyy" + i);
            int j = 0;
            
            
            while (j < 3) {
                System.out.println(i + j);
                j++;
            }

            i++;
        }
    }
}
