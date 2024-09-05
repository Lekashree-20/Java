package Oops.Polymorphism;


    // Base class Fruit
class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Name: " + name);
        System.out.println("Taste: " + taste);
    }
}

// Derived class Apple
class Apple extends Fruit {
    public Apple(String size) {
        super("Apple", "sweet", size);
    }

    @Override
    public void eat() {
        System.out.println("The " + name + " is " + taste + " and its size is " + size + ".");
    }
}

// Derived class Orange
class Orange extends Fruit {
    public Orange(String size) {
        super("Orange", "tangy", size);
    }

    @Override
    public void eat() {
        System.out.println("The " + name + " is " + taste + " and its size is " + size + ".");
    }

}
// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple("medium");
        Fruit orange = new Orange("large");

        apple.eat();
        orange.eat();
    }
}



