package BinarySearchTrees;

import Queues.Deque;

import java.util.ArrayList;

public class DeleteNode {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(Node root){

        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+ " ");
        inorder(root.right);
    }

    public static Node Delete(Node root,int val){
        if(root.data<val){
            root.right = Delete(root.right,val);
        } else if (root.data>val) {
            root.left = Delete(root.left,val);
        }else{
            // case 1
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2
            if(root.right == null){
                return root.left;
            }

            else if(root.left == null){
                return root.right;
            }

            //case 3
            Node IS = findInorderSuccessorr(root.right);
            root.data = IS.data;
            root.right = Delete(root.right,val);
        }
        return root;
    }
    public static Node findInorderSuccessorr(Node root){
        while(root.left != null ){
            root = root.left;
        }
        return root;
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data> val){
            root.left = insert(root.left,val);
        }

        if(root.data<val){
            root.right = insert(root.right,val);
        }

        return root;
    }

    public static void printInRange(Node root,int k1,int k2){
        if(root == null){
            return;
        }
          if(root.data>= k1 && root.data<= k2){
              printInRange(root.left,k1,k2);
              System.out.println(root.data+" ");
              printInRange(root.right,k1,k2);
          } else if (root.data<k1) {
              printInRange(root.left,k1,k2);
          }else{
              printInRange(root.right,k1,k2);
          }
    }

    public static void printtoleaf(ArrayList<Integer> path){
        for (int i = 0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }


        path.add(root.data);
        if(root.left == null && root.right == null){
            printtoleaf(path);
        }
        rootToLeaf(root.left,path);
        rootToLeaf(root.right,path);
        path.remove(path.size()-1);
    }

    public static boolean isValidBST(Node root, Node min,Node max){
        if (root == null){
            return true;
        }

        if(min!= null && root.data<= min.data){
            return false;
        }
        if(max!= null && root.data>= max.data){
            return false;
        }

        return isValidBST(root.left,min,root) &&
                isValidBST(root.right,root,max);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i =0;i< values.length;i++){
            root = insert(root,values[i]);
        }

        inorder(root);
        System.out.println();
        /*root = Delete(root,1);
        System.out.println();
        inorder(root);*/

       // printInRange(root,5,12);
       // rootToLeaf(root,new ArrayList<>());
        if(isValidBST(root,null,null)){
            System.out.println("isValid");
        }else {
            System.out.println("is not valid");
        }
    }


}
