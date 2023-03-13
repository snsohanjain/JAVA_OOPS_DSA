package DataStructure;

public class LinkedlistDataStructure {

    public static void main(String[] args) {
        Node head = new Node();
        Node middle = new Node();
        Node last = new Node();

        head.data = 10;
        middle.data = 20;
        last.data = 30;

        head.next = middle;
        middle.next = last;
        last.next = null;

        System.out.println("Linkedlist Elements are: ");
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    static class Node{
        int data;
        Node next;
    }


}
