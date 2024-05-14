package Day7_9May;

public class reversA_String {
    public static void main(String[] args) {
        /*
        This is very basic way to revers a String.
         */
        String s = "Saajan , Yogesh";
        int a = s.length() - 1;
        String revers = "";
        //     StringBuilder revers  = new StringBuilder();
        for (int i = a; i >= 0; i--) {
            revers = revers + s.charAt(i);
            // revers.append(s.charAt(i));
        }
        System.out.println(revers);
    }
}
