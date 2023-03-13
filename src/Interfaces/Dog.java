package Interfaces;

public class Dog implements Animal {
    private String name;
    private String breed;
    public Dog(String name,String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public void makeSound() {
        System.out.println("Bow Bow");
    }
    @Override
    public String getName() {
        return name;
    }
}
