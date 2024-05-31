import java.util.*;
public class _01Structure{

    public static class Node{
        int data;
        Node left;
        Node right;

        //constructor
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preOrder(Node root){

        //base case
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    
    public static void postOrder(Node root){

        //base case
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    
    public static void inOrder(Node root){

        //base case
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }



    public static void main(String args[]){
        /*
                        1
                      /   \
                     2     3
                    / \     \
                   4   5     6
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.right = new Node(6);

         preOrder(root);
         System.out.println();
         postOrder(root);
         System.out.println();
         inOrder(root);
         System.out.println();

    }
}