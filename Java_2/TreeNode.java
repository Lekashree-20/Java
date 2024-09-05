import java.util.Scanner;

public class TreeNode {
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

    treeNode root;

    TreeNode() {
        root = null;
    }

    void insert(Scanner sc){
        treeNode root;
        int val=sc.nextInt();
        if(val!=-1){
            //treeNode newNode=new treeNode(val);
            root = new treeNode(val);
            insert(root,sc);
        }
    }
    void insert(treeNode curr,Scanner sc){
        
        System.out.println("Enter left value of: "+curr.data);
        int left_val=sc.nextInt();
        if(left_val!=-1){
            treeNode newNode=new treeNode(left_val);
            curr.left=newNode;
            insert(curr.left,sc);
        }
        System.out.println("Enter right value of: "+curr.data);
        int right_val=sc.nextInt();
        if(right_val!=-1){
            treeNode newNode=new treeNode(right_val);
            curr.right=newNode;
            insert(curr.right,sc);
        }
    }


    void pre_order(treeNode curr){
        if(curr==null){
            return;
        }
        System.out.println(curr.data);
        pre_order(curr.left);
        pre_order(curr.right);
    }

    void in_order(treeNode curr){
        if(curr==null){
            return;
        }
        in_order(curr.left);
        System.out.println(curr.data);
        in_order(curr.right);
    }

    void post_order(treeNode curr){
        if(curr==null){
            return;
        }
        post_order(curr.left);
        post_order(curr.right);
        System.out.println(curr.data);
    }

    public static void main(String[] args) {
        TreeNode t=new TreeNode();
        Scanner sc=new Scanner(System.in);
        t.insert(sc);
        
        System.out.println("Pre-order traversal:");
        t.pre_order(t.root);

        System.out.println("In-order traversal:");
        t.in_order(t.root);

        System.out.println("Post-order traversal:");
        t.post_order(t.root);

        sc.close();


    }


}
