package TCS;

public class capitalizeFirstAndLast {

    public static void main(String[] args) {
        String str = "take u forward awesome";
        StringBuffer sb = new StringBuffer();
        int n = str.length();

        for(int i =0;i<str.length();i++){
            if(i == 0 || i == (n-1) && (int)str.charAt(i) >= 97){
                sb.setCharAt(i, (char)((int)str.charAt(i)-32));
            }else if(str.charAt(i) == ' '){

                if((str.charAt(i-1)-32) >= 65){
                   sb.setCharAt(i-1, (char)((int)str.charAt(i)-32));
                }

                if((str.charAt(i+1)-32 ) >= 65){
                    sb.setCharAt(i+1, (char)((int)str.charAt(i)-32));
                }
            }
        }
        System.out.println(sb.toString());
    }
}
