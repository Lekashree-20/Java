//import TreeNode.treeNode;

public class BinarySearchTree {
    TreeNode root=null;
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode (int val){
            data=val;
            left=null;
            right=null;
        }
    }
    void insert(int val){
        root=insert(root,val);
    }
    TreeNode insert(TreeNode curr, int val){
        if(curr==null){
            TreeNode newNode=new TreeNode(val);
            return newNode;
        }
        else if(val<curr.data){
            curr.left=insert(curr.left, val);
        }
        else if(val>curr.data){
            curr.left=insert(curr.right, val);
        }
        return curr;
    }

    void in_order(){
        in_order(root);
        System.out.println();
    }

    void in_order(TreeNode curr){
        if(curr==null){
            return;
        }
        in_order(curr.left);
        System.out.println(curr.data+" ");
        in_order(curr.right);
    }

    boolean search(int key){
        return search(root,key);
    }

    boolean search(TreeNode curr, int key){
        if(curr==null){
            return false;
        }
        else if(key==curr.data){
            System.out.println(curr.data+" ");
            return true;
        }
        else if(key<curr.data){
            System.out.println(curr.data+" ");
            return search(curr.left,key);
        }
        else{
            return search(curr.right,key);
        }
    }
}
