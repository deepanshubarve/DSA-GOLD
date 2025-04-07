package BinaryTree;

import Queues.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class BuildPreorder {

    public static void main(String[] args) {
        int nodes[] = { 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =  BinaryTree.buildTree(nodes);
        BinaryTree.Preorder(root);
        BinaryTree.inorder(root);
        BinaryTree.postorder(root);
        BinaryTree.levelOrder(root);

    }
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right =null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            Node leftTree = buildTree(nodes);
            Node rightTree = buildTree(nodes);

            return newNode;
        }

        public static void Preorder(Node root){

            if(root == null){
                return;
            }
            System.out.println(root.data+" ");
           Preorder(root.left);
           Preorder(root.right);

        }

        public static void inorder(Node root)
        {
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root){

            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data+" ");
        }

        //level order trevarsal

        public static void levelOrder(Node root){

            if(root == null){
                return;
            }

            Queue<Node> q =new LinkedList<>();
            q.add(root);
            q.add(null);


            while (!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();

                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else {
                    System.out.println(currNode.data+ " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!= null){
                        q.add(currNode.right);
                    }
                }
            }
        }

    }
}
