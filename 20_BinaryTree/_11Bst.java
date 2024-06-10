import java.util.*;
public class _11Bst{

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data < val){
            root.right = insert(root.right, val);
        }
        else{
            root.left = insert(root.left, val);
        }
        
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return ;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    /*search in the bst */
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return search(root.left, key);
        }

        else{
            return search(root.right, key);
        }
    }

    public static void main(String args[]){

        /*
                            5
                          /   \
                         1     7
                         \
                          3
                         / \
                        2   4
         */

        int val[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<val.length; i++){
            root = insert(root, val[i]);
        }

        inorder(root);
        System.out.println();

        if(search(root, 6)){
            System.out.println("key is found");
        }
        else{
            System.out.println("key is not found");
        }
    }
}