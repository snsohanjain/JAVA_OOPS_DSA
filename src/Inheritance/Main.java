package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Monkey");
        Dog dog = new Dog("Puppy","bully");
        Animal dog1 = new Dog("Puppy","bully");

        System.out.println(animal.getName());
        System.out.println(dog.getName() + " is a " + dog.getBreed());
        System.out.println(dog1);
    }
}
