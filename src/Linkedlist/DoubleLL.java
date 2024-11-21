package Linkedlist;

import jdk.jshell.spi.SPIResolutionException;
import org.w3c.dom.Node;

public class DoubleLL {

    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public int removeFirst(int data){
        if(head == null){
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = tail=null;
            size--;
            return val;
        }
         int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }


    public void print(){
        Node temp  = head;
        while(temp!= null){
            System.out.println(temp.data+"<->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public static void main(String[] args) {
         LinkedList ll = new LinkedList();
         ll.addFirst(1);
         ll.addFirst(2);
         ll.addFirst(3);

         ll.printLL();
        System.out.println(ll.size);

        ll.removeFirst();
        ll.printLL();
        System.out.println(ll.size);

        ll.reverse();
        ll.printLL();
        

    }


}
