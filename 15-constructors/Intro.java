
class Human {

    private int age;
    private String name;

    static {
        System.out.println("In static block");
    }

    // Default constructor
    public Human() {
        System.out.println("In default constructor");
        this.age = 23;
        this.name = "Krish Beautiful";
    }

    // Parameterized constructor
    // Don't assign values while initializing variables, rather do it in constructor for code maintenance
    public Human(String name, int age) {
        System.out.println("In constructor");
        this.name = name;
        this.age = age;
    }

    // Type 1 parameterized constructor
    public Human(String name) {
        this.age = 111;
        this.name = name;
    }

    // Type 2 parameterized constructor
    public Human(int age) {
        this.age = age;
        this.name = "Krish Age Constructor";
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class Intro {

    public static void main(String[] args) {
        Human h1 = new Human("Krish", 23);
        h1.show();

        h1.setAge(82);
        h1.setName("Krish Hero");

        h1.show();

        Human h2 = new Human("Krish Hero 19", 88);
        h2.show();

        System.out.println();
        Human h3 = new Human();
        h3.show();
    }

    public Intro() {
    }
}
