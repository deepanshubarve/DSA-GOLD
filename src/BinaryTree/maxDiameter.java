package BinaryTree;

public class maxDiameter {

    static class Node {
        int data;
        Node left ;
        Node right;
        Node(int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        int height = lh+rh+1;
        return Math.max(lh,rh)+1;
    }

    public static int Diameter(Node root){

        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int ld = Diameter(root.left);

        int rh = height(root.right);
        int rd = Diameter(root.right);

        int selfDiam = lh+rh+1;

        return Math.max(selfDiam,Math.max(ld,rd));
    }

    public static class Info{
        int dim;
        int ht;

        public Info(int dim,int ht){
            this.dim = dim;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){

        if(root == null){
            return new Info(0,0);
        }

        Info leftinfo = diameter(root.left);
        Info rightinfo = diameter(root.right);

        int diam = Math.max(Math.max(leftinfo.dim, rightinfo.dim), leftinfo.ht+ rightinfo.ht+1);
        int height = Math.max(leftinfo.ht, rightinfo.ht)+1;

        return new Info(diam,height);
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(Diameter(root));
        System.out.println(diameter(root).dim);
        System.out.println(diameter(root).ht);
    }
}
