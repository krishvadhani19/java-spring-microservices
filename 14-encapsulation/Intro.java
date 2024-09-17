
class Human {

    private int age;
    private String name;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
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
    }
}
