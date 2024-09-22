
enum Laptop {
    MacBook(1500), XPS(900), Surface(1000), ThinkPad(800), Acer;

    private int price;

    private Laptop() {
        price = 500;
        System.out.println("No param constructor");
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("Inside constructor" + price);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo {

    public static void main(String[] args) {
        Laptop lap = Laptop.Acer;
        System.out.println(lap.getPrice());

        for (Laptop lapppy : Laptop.values()) {
            System.out.println(lapppy + " : " + lapppy.getPrice());
        }
    }
}
