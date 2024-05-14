package Day7_9May;

import java.util.Scanner;

public class sub_String {
    public static void main(String[] args) {
        /*
        Find the smallest and largest sub string in  main string
        input = welcometojava and 3
        output is = ava and wel
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your String ");
        String s = scan.nextLine();
        System.out.println("enter sub string size");
        int k = scan.nextInt();
        s=s.replaceAll("\\s","");
        String smallest;
        String largest;
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        for(int i=0; i<=s.length()-k; i++ ){
            String str = s.substring(i,k+i);
            if (smallest.compareTo(str)>0){
                smallest = str;
            }
            if(largest.compareTo(str)<0){
                largest=str;
            }
            System.out.print(str+" ,");
        }
        System.out.println();
        System.out.println("smallest sub string is "+smallest);
        System.out.println("largest sub string is "+largest);
    }
}
