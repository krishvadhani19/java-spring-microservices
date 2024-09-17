
class Mobile {

    static String storeName;

    float price;
    String brand;
    String model;

    // Static block
    static {
        storeName = "Rhythm";
        System.out.println("Inside static block");
    }

    public Mobile(String model, String brand, float price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public void show() {
        System.out.println("Brand:" + this.brand);
        System.out.println("Model:" + this.model);
        System.out.println("price:" + this.price);
    }
}

public class Static {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("start");
        Mobile m1 = new Mobile("15pro", "Apple", 900);
        // m1.price = 1_000;
        // m1.brand = "Apple";
        // m1.model = "15pro";
        m1.show();

        Mobile m2 = new Mobile("15promax", "Apple", 1000);

        // Avoid using this and directly use className for static variables
        // System.out.println(m2.storeName);
        System.out.println(Mobile.storeName);

        // To load class in Class Loader without instantiation
        // static block will have been executed if it was loading it for the first time
        Class.forName("Mobile");
    }
}

/**
 * Static variables are shared across diff instances of the same class
 */
/**
 * Class is loaded only on the first instantiation and not on the second one
 * Once Java class is loaded its present in the JVM Class Loader And on the
 * further instantiation the static block wont be executed
 */
