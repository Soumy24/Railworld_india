package Day7_9May;

public class revers_Array_String {
    public static void main(String[] args) {
        String[] s = {"anis","yogesh","saurav","sajan"};
        int a = s.length-1;
        for (int i=0; i<a-i; i++){
            String temp = s[i];
            s[i] = s[a-i];
            s[a-i] = temp;
        }
        // System.out.println(Arrays.toString(s)); // this method is direct print tha element.
        for (int i =0; i<s.length; i++){
            System.out.print(s[i]+",");
        }
    }
}
