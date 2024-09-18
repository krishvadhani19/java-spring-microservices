
class Laptop {

    String model;
    int price;

    // toString method is a object class method
    // You can override it since it will first check the existing class and then the parent class
    @Override
    public String toString() {
        return "Hey";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return price == other.price;
    }

}

public class Demo {

    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo yoga";
        obj.price = 1000;

        System.out.println(obj.toString());

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo yoga";
        obj1.price = 1000;

        // To check if 2 objects are equal
        System.out.println(obj.equals(obj1));
    }
}
