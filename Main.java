// CircularLinkedList.java

import java.util.Scanner;

// Node class representing a single node in the circular linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// CircularLinkedList class representing the entire list
class CircularLinkedList {
    Node head; // head of the list
    Node tail; // tail of the list

    // Constructor to initialize an empty list
    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    // Method to insert a node at the front of the list
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 0) {
            head = head.next;
            tail.next = head;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (current.next == head) {
                tail = current;
            }
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Circular Linked List Menu");
            System.out.println("1. Insert at front");
            System.out.println("2. Delete at position");
            System.out.println("3. Insert at end");
            System.out.println("4. Display all nodes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    int data = scanner.nextInt();
                    list.insertAtFront(data);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    int position = scanner.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 3:
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}