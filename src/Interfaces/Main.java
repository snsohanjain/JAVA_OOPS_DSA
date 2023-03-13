package Interfaces;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Puppy","bully");
        Animal dog1 = new Dog("Puppy","bully");
        Animal cat = new Cat("BILLE");
        cat.makeSound();

        System.out.println(dog.getName() + " is a " + dog.getBreed());
        dog.makeSound();
        System.out.println(dog1);
    }
}
