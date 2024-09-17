
class Mobile {

    static String storeName = "Rhythm";

    float price;
    String brand;
    String model;

    public Mobile(float price, String brand, String model) {
        this.price = price;
        this.brand = brand;
        this.model = model;
    }

    public static void show(Mobile m) {
        System.out.println("Brand:" + m.brand);
        System.out.println("Model:" + m.model);
        System.out.println("price:" + m.price);
    }
}

public class StaticMethods {

    public static void main(String[] args) {
        Mobile m1 = new Mobile(1_000, "Apple", "15pro");

        // You can access static methods and variables only via class and not objects
        Mobile.show(m1);
    }
} /*
 * For every method figure whether its static or dynamic and according take action:
 * For static methods you need to pass in parameters the object data
 */
