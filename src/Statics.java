public class Statics {
    public static void main(String[] args) {
        var sohan = new Person("Sohan");
        var jain = new Person("Jain");
        var manoj = new Person("Mojo");
        System.out.println(Person.createdPeople);
        System.out.println(sohan.name);
        System.out.println(jain.name);
        System.out.println(manoj.name);
    }

    static class Person{
        static int createdPeople = 0;
        String name;
        Person(String name){
            this.name = name;
            createdPeople++;
        }
    }

}
