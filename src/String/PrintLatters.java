package String;

public class PrintLatters {
    public static void main(String[] args) {

        String str = "Deepanshu Barve";
        printLetter(str);
    }

    public static void printLetter(String str){
        for(int i =0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
