package TCS;
import java.util.Scanner;
import java.util.*;

public class Input {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        for(String a : arr){
            System.out.println(a);
        }
    }
}
