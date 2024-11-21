package Linkedlist;

public class DetectCylce {
    public static class Node{
        int data;
        Node next;
        public  Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static boolean cycle (Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(cycle(head));
    }
}
