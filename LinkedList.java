/**
 * A simple implementation of a singly linked list in Java.
 * This linked list supports insertion at the beginning, insertion at the end,
 * and deletion from the beginning.
 */
public class LinkedList {
    private Node head; // Head node of the linked list

    // Node class representing an element in the linked list
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Inserts a new node at the beginning of the linked list.
     * @param data The data to be inserted.
     */
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Inserts a new node at the end of the linked list.
     * @param data The data to be inserted.
     */
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    /**
     * Deletes the node at the beginning of the linked list.
     */
    public void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    /**
     * Displays the elements of the linked list.
     */
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method for testing the linked list implementation
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.display(); // Output: 1 -> 2 -> 3 -> null

        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.display(); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> null

        list.deleteFromBeginning();
        list.display(); // Output: 2 -> 3 -> 4 -> 5 -> null
    }
}