package Greedy;


import java.util.Arrays;
import java.util.Collections;

public class ChocolateProblem {
    public static void main(String[] args) {
        int n = 4; int m = 6;
        Integer [] VerCost = {2,1,3,1,4 };
        Integer [] HozCost ={4,1,2};

        Arrays.sort(VerCost, Collections.reverseOrder());
        Arrays.sort(HozCost, Collections.reverseOrder());

        int h = 0, v =0 ;
        int hp = 1;
        int vp = 1;
        int cost = 0;

        while(h<HozCost.length && v<VerCost.length){
            //Horizontal cut
            if(VerCost[v] <= HozCost[h]){
                cost += HozCost[h] * vp;
                h++;
                hp++;
            }else{
                cost+= VerCost[v] * hp;
                v++;
                vp++;
            }
        }

        while (h<HozCost.length){
            cost += HozCost[h] * vp;
            h++;
            hp++;
        }

        while (v< VerCost.length){
            cost+= VerCost[v] * hp;
            v++;
            vp++;
        }

        System.out.println("The minimum cost of the chocolate pieces " + cost);
    }
}
