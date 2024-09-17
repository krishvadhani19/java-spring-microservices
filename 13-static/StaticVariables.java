
class Mobile {

    static String storeName = "Rhythm";

    float price;
    String brand;
    String model;

    public void show() {
        System.out.println("Brand:" + this.brand);
        System.out.println("Model:" + this.model);
        System.out.println("price:" + this.price);
    }
}

public class StaticVariables {

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.price = 1_000;
        m1.brand = "Apple";
        m1.model = "15pro";
        m1.show();
        Mobile m2 = new Mobile();

        // Avoid using this and directly use className for static variables
        // System.out.println(m2.storeName);
        System.out.println(Mobile.storeName);
    }
}

/**
 * Static variables are shared across diff instances of the same class
 */
