import java.util.Scanner;
public class Tree {
    treeNode root=null;
    class treeNode{
        int data;
        treeNode left;
        treeNode right;
        treeNode(int val){
            data=val;
            left=null;
            right=null;
        }
    }
    void insert(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the root value:");
        int val=sc.nextInt();
        if(val!=-1){
            treeNode new_node = new treeNode(val);
            root = new_node;
            insert(root);
        }
    }
    void insert(treeNode curr){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the left value of "+curr.data+":");
        int left_val=sc.nextInt();
        if(left_val!=-1){
            treeNode newnode=new treeNode(left_val);
            curr.left=newnode;
            insert(curr.left);
        }
        System.out.print("Enter the right value of "+curr.data+":");
        int right_val=sc.nextInt();
        if(right_val!=-1){
            treeNode newnode=new treeNode(right_val);
            curr.right=newnode;
            insert(curr.right);
        }
    }
    void pre_order(){
        pre_order(root);
        System.out.println();
    }
    void in_order(){
        in_order(root);
        System.out.println();
    }
    void post_order(){
        post_order(root);
        System.out.println();
    }
    void pre_order(treeNode curr){
        if(curr==null){
            return;
        }
        System.out.print(curr.data+" ");
        pre_order(curr.left);
        pre_order(curr.right);
    }
    void in_order(treeNode curr){
        if(curr==null){
            return;
        }
        in_order(curr.left);
        System.out.print(curr.data+" ");
        in_order(curr.right);
    }
    void post_order(treeNode curr){
        if(curr==null){
            return;
        }
        post_order(curr.left);
        post_order(curr.right);
        System.out.print(curr.data+" ");
    }

    boolean Search(int key){
        return Search(root,key);
    }

    boolean Search(treeNode curr,int key){
        if(curr==null){
            return false;
        }
        else if(curr.data==key){
            return true;
        }
        else{
            return Search(curr.left,key)||Search(curr.right,key);
        }
    }
    int count(){
        return count(root);

    }

    int count(treeNode curr){
        if(curr==null){
            return 0;
        }
        return 1+count(curr.left)+count(curr.right);

    }
    int sum(){
        return sum(root);

    }

    int sum(treeNode curr){
        if(curr==null){
            return 0;
        }
        return curr.data+sum(curr.left)+sum(curr.right);
    } 

    int leaf_count(){
        return leaf_count(root);
    }
    int leaf_count(treeNode curr){
        if(curr==null){
            return 0;
        }
        else if(curr.left==null && curr.right==null){
            return 1;
        }
        return leaf_count(curr.left)+leaf_count(curr.right);
    }


    int findMin() {
        return findMin(root);
    }

    int findMin(treeNode curr) {
        if (curr == null) {
            return Integer.MAX_VALUE;
        }
        int leftMin = findMin(curr.left);
        int rightMin = findMin(curr.right);
        return Math.min(curr.data, Math.min(leftMin, rightMin));
    }

    int height(){
        return height(root);
    }
    int height(treeNode curr){
        if(curr==null){
            return 0;
        }
        return 1+Math.max(height(curr.left),height(curr.right));
    }
    public static void main(String[] args) {
        Tree t=new Tree();
        t.insert();
        t.pre_order();
        t.in_order();
        t.post_order();
        System.out.println("Searched value is "+" "+t.Search(40));
        System.out.println("Count of nodes in tree"+" "+t.count());
        System.out.println("Sum of value in tree"+" "+t.sum());
        System.out.println("Leaf nodes in tree"+" "+t.leaf_count());
        System.out.println("Min value in tree"+" "+t.findMin());
        System.out.println("Height of thr tree"+" "+t.height());
        



    }
} 