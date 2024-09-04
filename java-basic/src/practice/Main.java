package practice;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
