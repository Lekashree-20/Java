package ZohoSet1.FaceTraining;

class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ExSeven {
    
    public static void main(String[] args) {
        
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;
        Node n4 = new Node(4);
        n3.next = n4;
        Node n5 = new Node(5);
        n4.next = n5;

        Node head = n1;
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.err.println(slow.data);
    }
}
