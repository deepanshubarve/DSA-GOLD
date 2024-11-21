package Linkedlist;

import org.w3c.dom.Node;

public class LinkedList {


    public static class Node{
        int data;
        Node next;
        public  Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){

        //create a node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        //newNode next = head
        newNode.next = head;

        //head = new node
        head = newNode;
    }

    public void addLast(int data){

        Node newNode = new Node(data);

        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = tail;

        tail = newNode;
    }

    public void printLL(){

        if(head == null){
            System.out.println("linkedlist is empty");
            return;
        }
        Node temp = head;

        while (temp!= null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int data, int index){
        if(index ==0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;

        int i =0;
        while (i<index-1){
            temp =temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){

        if(size == 0){
            System.out.println("Ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
       //previous = size -2
        Node prev =head;
        for(int i = 0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //Search Itretive
    public int Search(int key){
        Node temp = head;
        int i =0;

        while(temp!= null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;

        }
        return -1;
    }

    //recursive search

    public int recSearch(int key){
        return helper(key,head);
    }

    public int helper(int key, Node head){

        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(key,head.next);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Node Delete from end

    public void deleteFromEnd(int n){
       int sz =0 ;
       Node temp =  head;
       while(temp!= null){
           temp = temp.next;
           sz++;
       }

       if(sz == n){
           head = head.next;
           return;
       }

       //to reach sz-n
        int i = 1;
       int iToFind = sz-n;
       Node prev = head;

       while(i<iToFind){
           prev = prev.next;
           i++;
       }

       prev.next = prev.next.next;
       return;
    }

    //find middle node
    //Slow fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrom(){

        if(head == null || head.next == null){
            return true;
        }
        //find middle
        Node midNode = findMid(head);

        //reverse the 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        
       while (curr!= null) {
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }

       Node right = prev; // right half head
       Node left = head;
        //equals both half


        while (right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }



    public static void main(String[]args){

        LinkedList ll = new LinkedList();


        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.add(4,1);
        ll.printLL();
        System.out.println(ll.size);
        ll.removeFirst();
        System.out.println(ll.size);
        ll.removeLast();
        ll.printLL();
        System.out.println(ll.Search(2));
        System.out.println(ll.recSearch(2));
        System.out.println(ll.Search(10));
        System.out.println(ll.recSearch(10));
        ll.reverse();
        ll.printLL();
        System.out.println(ll.checkPalindrom());
    }
}
