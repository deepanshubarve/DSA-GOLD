package Recursion;

public class RemoveDuplicates {
     public static void main(String[] args) {
       removeDupli("appnnacollege",0,new StringBuilder(" "),new boolean[26]);
    }

    public static void removeDupli(String str,int idx ,StringBuilder newString,boolean map[]){

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        //kaam
        char currentChar = str.charAt(idx);
        if((map[currentChar-'a']) == true){
            removeDupli(str,idx+1,newString,map);
        }else{
            map[currentChar-'a'] = true;
            removeDupli(str,idx,newString.append(currentChar),map);
        }
    }
}
