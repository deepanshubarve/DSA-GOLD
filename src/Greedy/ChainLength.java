package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class ChainLength {
    public static void main(String[] args) {

        int pairs[][]= {{5,24},{39,50},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int count =1;
        int chainEnd = pairs[0][1];

        for(int i =1;i<pairs.length;i++){
            if(pairs[i][0] > chainEnd){
                count++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("THe chain of word with length " + count);

    }
}
