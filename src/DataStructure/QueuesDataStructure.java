package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesDataStructure {
    public static void main(String[] args) {

        // Queue is a FIFO --> FIRST IN FIRST OUT
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Sohan"));
        queue.add(new Person("Nithin"));
        queue.add(new Person("Jayanth"));

        //Print the Queue
        System.out.println(queue);
        //To Get the Size of Queue
        System.out.println(queue.size());
        //To Lookup th First Person
        System.out.println(queue.peek());
        //To Remove the First Person
        System.out.println(queue.poll());
        //Print the Queue
        System.out.println(queue);
        //Loop the Person Name
        queue.forEach(person -> System.out.println(person.name));


    }
    static class Person{
        private String name;
        public Person(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
