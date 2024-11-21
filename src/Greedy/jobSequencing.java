package Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class jobSequencing {
    static class job{
        int deadline;
        int id;
        int profit;

        public job(int i, int d, int p){
            id = i;
            deadline =d ;
            profit = p;
        }

        public static void main(String[] args) {
            int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

            ArrayList<job> jobs = new ArrayList<>();

            for(int i =0;i<jobsInfo.length;i++){
                jobs.add(new job(i,jobsInfo[i][0],jobsInfo[i][1]));
            }

            Collections.sort(jobs,(obj1,obj2) -> obj2.profit-obj1.profit);

            ArrayList<Integer> seq = new ArrayList<>();
            int time = 0;

            for(int i = 0;i<jobs.size();i++){
                job curr = jobs.get(i);
                if(curr.deadline > time){
                    seq.add(i);
                    time++;
                }
            }
            System.out.println("The max number of job = " +seq.size());
            for (int i =0;i<seq.size();i++){
                System.out.println(seq.get(i));
            }
        }
    }
}
