import java.util.Scanner;

public class CountNodes {
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

   

    public static void main(String[] args) {
        CountNodes c = new CountNodes();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter values to be inserted (enter -1 to stop):");
        
        int count=0;
        while (true) {
            int value = sc.nextInt();
            if(value!=-1){
                count++;
            }
            if (value == -1) {
                break;
            }
            c.add(value);
        }

        System.out.println("Node count:"+count);
        sc.close();
    }
}
