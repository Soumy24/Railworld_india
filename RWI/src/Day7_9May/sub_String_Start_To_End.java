package Day7_9May;

import java.util.Scanner;

public class sub_String_Start_To_End {
    /*
       Sample Input
         Helloworld
           3 7

          Sample Output
            lowo
        */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        char[] ch = new char[S.length()];


        for (int i = 0; i < S.length(); i++) {
            ch[i] = S.charAt(i);
        }
        for(int i=start;i<end;i++) {
            System.out.print(ch[i]);
        }
    }
}
