//Example Function_Methods
package Day4_6May;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = new String("   hel  lo   ");
        String s3 = new String("Hello");
        String s2 = "hello";

        System.out.println(s1);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s3));
//        System.out.println(s1.intern()==s2);
//        System.out.println(s1);
//        String s4 =s1.replace('o','p');
//        System.out.println(s4);
//        System.out.println("args = " + Arrays.toString(args));
//        System.out.println(s1.hashCode());
//        System.out.println(s1.hashCode());
//        s1+="World";
//        System.out.println(s1.hashCode());
        System.out.println(s1.strip());


    }
}