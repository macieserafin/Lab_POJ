public class Cat extends Animal {

    public Cat(String name, String color) {
        super(name, color);
    }

    public String makeSound() {
        return "Meow! My name is " + name + " and my color is " + color + ".";
    }
}
