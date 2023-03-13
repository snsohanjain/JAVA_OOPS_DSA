package Abstraction;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Monkey"); // not possible because Abstract class
        Dog dog = new Dog("Puppy","bully");
        Animal dog1 = new Dog("Puppy","bully");
        Animal cat = new Cat("BILLE");
        cat.makeSound();

        System.out.println(dog.getName() + " is a " + dog.getBreed());
        dog.makeSound();
        System.out.println(dog1);
    }
}
