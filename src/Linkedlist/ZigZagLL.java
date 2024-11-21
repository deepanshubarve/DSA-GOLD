package Linkedlist;

import org.w3c.dom.Node;

import static Linkedlist.LinkedList.head;

public class ZigZagLL {
    public static class Node{
        int data;
        Node next;
        public  Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void zigzag(Node head){

        //find mid

        Node slow = head;
        Node fast = head.next;

        while (slow != fast){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        //Reverse 2nd half

        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        Node leftHead = head;
        Node rightHead = prev;
        Node nextLeft;
        Node nextRight;
        //Alternate merging
        while (leftHead != null && rightHead != null){
            nextLeft  = leftHead.next;
            leftHead.next = rightHead;
            nextRight = rightHead.next;
            rightHead.next = nextLeft;

            leftHead = nextLeft;
            rightHead = nextRight;
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node head =  null;
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printLL();
        zigzag(head);
        ll.printLL();

    }
}
