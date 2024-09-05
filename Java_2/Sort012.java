import java.util.Scanner;

public class Sort012 {
    
        
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
    
        public void sort(){
            Node i=head;
            Node j=head;
            while(j!=null){
                if(j.data==0){
                    int k=i.data;
                    i.data=j.data;
                    j.data=k;
                    i=i.next;
                    j=j.next;
                }
                else{
                    j=j.next;
                }
            }
            j=i;
            while(j!=null){
                if(j.data==1){
                    int k=i.data;
                    i.data=j.data;
                    j.data=k;
                    i=i.next;
                    j=j.next;
                }
                else{
                    j=j.next;
                }
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

        public static void main(String[] args) {
        Sort012 s = new Sort012();
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

        System.out.println("After sorting:");
        s.sort();
        s.display();
        sc.close();

    
    }
}