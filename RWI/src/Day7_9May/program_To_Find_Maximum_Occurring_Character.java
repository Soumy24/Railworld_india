package Day7_9May;

public class program_To_Find_Maximum_Occurring_Character {
    public static void main(String[] args) {
        String s= "madarchod bahenchod lavde ke bal landkebal tatto ke saudagar machhar ki zaat bahenke lovde";
        s = s.replaceAll("\\s" , "");
        // this is only for remove all the space.
        int[] arr = new int[256];
        int a = s.length();
        for (int i =0; i<a; i++){
            arr[s.charAt(i)] = arr[s.charAt(i)]+1;
        }
        int max = -1;
        char c = ' ';
        for (int i =0; i<a; i++){
            if(max<arr[s.charAt(i)]){
                max = arr[s.charAt(i)];
                c = s.charAt(i);
            }
        }
        System.out.println("The Maximum Occuring Charecter Is : "+c);
    }
}
