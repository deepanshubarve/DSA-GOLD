package Heaps;


import java.util.Comparator;
import java.util.*;

public class PriorityQueue {

    static class student implements Comparable<student> {
        String Student;
        int rank;

        public student(String Student,int rank){
            this.Student = Student;
            this.rank = rank;
        }

        @Override
        public int compareTo(student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        java.util.PriorityQueue<student> pq = new java.util.PriorityQueue<>();
        pq.add(new student("A",4 ));
        pq.add(new student("B",2 ));
        pq.add(new student("C",11 ));
        pq.add(new student("D",1 ));


        while (!pq.isEmpty()){
            System.out.println(pq.peek().Student + " -->" + pq.peek().rank);
            pq.remove();
        }
    }
}
