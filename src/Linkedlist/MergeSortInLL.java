package Linkedlist;


public class MergeSortInLL {

    public static class Node{
        int data;
        Node next;
        public  Node (int data){
            this.data = data;
            this.next = null;
        }
    }


    private Node mergeSort(Node head1,Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head1 != null || head2!= null){
            if(head1.data<= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp= temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp= temp.next;
        }

        while (head2!= null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    private Node getMid(Node head){

        Node slow = head;
        Node fast = head.next;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node MergeSort( Node head){

        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getMid(head);

        //sort left and right
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeftHead = MergeSort(head);
        Node newRightHead = MergeSort(rightHead);

        //merge
        return mergeSort(newLeftHead,newRightHead);

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(3);
        ll.addFirst(7);
        ll.addFirst(1);

        ll.printLL();




    }
}
