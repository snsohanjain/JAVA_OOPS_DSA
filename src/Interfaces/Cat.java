package Interfaces;

public class Cat implements Animal {
    private String name;
    public Cat(String name) {
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println("Miaow Miaow");
    }
    @Override
    public String getName() {
        return name;
    }
}
