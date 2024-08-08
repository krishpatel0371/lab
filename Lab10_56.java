import java.util.Scanner;


class Node {
    int data;   
    Node next;   
    public Node(int data) {
        this.data = data;
        this.next = null;  
        }
    }

public class Lab10_56{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter data for the node: ");
        int data = scanner.nextInt();
            
        Node node = new Node(data);
        
        
        System.out.println("Node created with data: " + node.data);
    }
}
