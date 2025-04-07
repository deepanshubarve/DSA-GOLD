package TCS;

import java.util.Scanner;

public class countStarAndHash {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        System.out.println(count(s,n));
    }

    public static int count(String s,int n){
        if(s.length() % 2 != 0){
            System.out.println("Odd length hai");
        }

        int result = 0;

        int countStar = 0;
        int countHash = 0;

        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '#'){
                countHash++;
            }

            if(s.charAt(i) == '*'){
                countStar++;
            }
        }

        if(countHash > countStar){
            result = n/2-countHash;
        }

        if(countStar > countHash){
            result = countStar - n/2;
        }
        return result;
    }
}
