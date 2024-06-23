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


    /*deleat function */
    /* case 1 -> leaf node
     * case 2 -> single child
     * case 3 -> 2 child
     */

     public static Node deleat(Node root, int val){
        if(root.data > val){
            root.left = deleat(root.left, val);
        }
        
        else if(root.data < val){
            root.right = deleat(root.right, val);
        }

        else{
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3
                Node IS = findInorderSucessor(root.right);
                root.data = IS.data;
                root.right = deleat(root.right, IS.data);
        }

        return root;
     }

     public static Node findInorderSucessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
     }


     /*Range between two nodes */
     public static void printInRange(Node root, int k1, int k2){
        //base case
        if(root == null){
            return;
        }

        /*case -1 => k1 <= root <= k2 */
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }

        //case -2 => root > k1  i.e all elements are present in the right side
        else if(root.data > k1){
            printInRange(root.right, k1, k2);
        }

        //case -3 => root < k1 value are in the left side
        else{
            printInRange(root.left, k1, k2);
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

        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<val.length; i++){
            root = insert(root, val[i]);
        }

        /*inorder(root);
        System.out.println();

        if(search(root, 6)){
            System.out.println("key is found");
        }
        else{
            System.out.println("key is not found");
        }*/


        //deleat node 
        // inorder(root);
        // System.out.println();

        // root = deleat(root, 5);
        // System.out.println();
        // inorder(root);
        // System.out.println();


        /*print the range */
        inorder(root);
        System.out.println();
        printInRange(root, 5, 12);
        System.out.println();
    }
}