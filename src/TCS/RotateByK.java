package TCS;

import java.io.*;

public class RotateByK {
    public static void main(String[] args) {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        int it;
        String str;
        try {
            str = bfn.readLine();
            it = Integer.parseInt(bfn.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The player is " + str + it);
    }
}
