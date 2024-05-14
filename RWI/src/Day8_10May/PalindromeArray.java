package Day8_10May;

import java.util.Arrays;

public class PalindromeArray {
    public static void main(String[] args) {
        String[] s = {"a","b","c","c","b","a"};
        String[] s1 = {"a","b","c","c","b","a"};
        int a = s.length-1;
        for (int i =0; i<a-i; i++){
            String temp = s[i];
            s[i] = s[a-i];
            s[a-i] = temp;
        }
        if(Arrays.equals(s, s1)){
            System.out.println("p");
            for (String no : s ){
                System.out.print(no+",");
            }
        }else {
            System.out.println("n");
        }
    }
}