package TCS;

public class removeVowels {
    public static void main(String[] args) {
        String s = "take u forward";
        System.out.println(remove(s));
    }

    public static String remove(String s){
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                s = s.substring(0,i)+s.substring(i+1);
            }
        }
        return s;
    }
}
