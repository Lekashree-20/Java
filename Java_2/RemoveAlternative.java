//Remove even alternative
import java.util.Scanner;

public class RemoveAlternative {

    class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }
    
    Node head = null;

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deletion() {
        if (head != null) {
            Node temp = head;
            while (temp != null && temp.next != null) {
                temp.next = temp.next.next;
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        RemoveAlternative s = new RemoveAlternative();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter values to be inserted (enter -1 to stop):");
        
        while (true) {
            int value = sc.nextInt();
            if (value == -1) {
                break;
            }
            s.add(value);
        }
        
        System.out.println("Linked list after insertion:");
        s.display();
        
        s.deletion();
        
        System.out.println("Linked list after removal of even alternative nodes:");
        s.display();
        
        sc.close();
    }
}
