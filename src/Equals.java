public class Equals {
    public static void main(String[] args) {
        var person = new Equals.Person("Sohan");
        var people = person;
        System.out.println(person.equals(people));
        System.out.println(person.name);
        System.out.println(people.name);
    }
    static class Person {
        private String name;
        public Person(String name){
            this.name = name;
        }
    }


}
