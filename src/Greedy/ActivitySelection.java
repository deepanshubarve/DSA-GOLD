package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] ={1,3,0,5,8,5};
        int end[] = {6,4,2,7,2,9};
        selection(start,end);
    }

    public static void selection(int start[] , int end[]){
        //for end sorted
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //for unsorted end array
        int activities[][] = new int [start.length][3];
        for(int i =0;i< activities.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lambda function to sort coloum 2
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        //first element
        count = 1;
        ans.add(activities[0][0]);
        int lastend = activities[0][2];

        for(int i =1;i<activities.length;i++){
            if(activities[i][1]>= lastend){
                count++;
                ans.add(activities[i][0]);
                lastend = activities[i][2];
            }
        }
        System.out.println("the maximum activity =" + count);
        for(int i = 0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

    }
}
