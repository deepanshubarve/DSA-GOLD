package Fundamental;

public class ArrayCC {
    public static void main(String[] args) {
          int marks[] = {97,98,99,90};
          update(marks);

          for (int i =0;i<marks.length;i++) {
              System.out.print(marks[i]+" ");
          }
        System.out.println();
    }

    public static void update(int marks[]){
        for (int i = 0;i<marks.length;i++){
           marks[i] = marks[i] + 1;
        }
    }
}
