
public class Test {

    public static void main(String[] args) {

        int day = 10;

        switch (day) {
            case 0 -> {
                System.out.println("Sunday");
                System.out.println("Helllo");
            }
            case 1 -> {
                // Here every case has default breaks
                // Also you can have brackets like the usual switch statements
                System.out.println("Monday");
            } 
            case 2 ->
                System.out.println("Tuesday");
            case 3 ->
                System.out.println("Wednesday");
            case 4 ->
                System.out.println("Thursday");
            case 5 ->
                System.out.println("Friday");
            case 6 ->
                System.out.println("Saturday");
            default ->
                System.out.println("Looking forward to the weekend");
        }

    }
}
