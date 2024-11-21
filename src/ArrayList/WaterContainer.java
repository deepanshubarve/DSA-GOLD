package ArrayList;

import java.util.ArrayList;

public class WaterContainer {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(8);
        height.add(3);
        height.add(2);
        height.add(1);
        height.add(7);
        height.add(6);
        height.add(0);
        height.add(4);
        System.out.println(trapWater(height)) ;
    }
    public static int trapWater(ArrayList<Integer> height){

        int maxWater = 0;

//        for(int i=0;i< height.size();i++){
//            for (int j = i+1;j< height.size();j++){
//                int minHeight = Math.min(height.get(i), height.get(j));
//                int width = j-i;
//                int currentWater = minHeight*width;
//                maxWater = Math.max(maxWater,currentWater);
//            }
//        }

        //2 pointers approach
        int LP = 0;
        int RP = height.size()-1;
        while (LP<RP){
            int ht = Math.min(height.get(LP), height.get(RP));
            int width = RP-LP;
            int currentWater = ht*width;
            maxWater = Math.max(maxWater,currentWater);

            if(height.get(LP)< height.get(RP)){
                LP++;
            }else {
                RP--;
            }
        }
        return maxWater;
    }
}
