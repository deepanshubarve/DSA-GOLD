package Heaps;

import java.util.ArrayList;

public class Heap {
    static class heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {

            arr.add(data);

            int child = arr.size() - 1;
            int parent = (child-1)/2;

            while (arr.get(child) < arr.get(parent)) {
                int temp = arr.get(child);
                arr.set(child, arr.get(parent));
                arr.set(parent, temp);

                child = parent;
                parent = (child-1)/ 2;
            }

        }

        public int peek() {
            return arr.get(0);
        }

        public void heapify(int i) {

            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            //1st and last will swap
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            //2nd remove last idx
            arr.remove(arr.size() - 1);

            //3rd fix the heap
            heapify(0);
            return data;

        }

    }

        public static void main(String[] args) {
           Heap heap = new Heap();



    }
    }

