package BinarySearchTrees;

public class MirrorBST {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        mirror(root);
        inorder(root);
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+ " ");
        inorder(root.right);
    }

    public static Node mirror(Node root){
        if(root == null){
            return null;
        }

        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
