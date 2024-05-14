package Day7_9May;

public class number_Of_Char_In_String {
    public static void main(String[] args) {
        String s = "anis is a good boy ";
        s =s.replaceAll("\\s" , "");
        int a = s.length();
        int[] arr = new int[256];
        for (int i=0; i<a; i++){
            arr[s.charAt(i)]++;
        }
        char[] ch = new char[a];
        for (int i=0; i<a; i++){
            ch[i] = s.charAt(i);
            int count = 0;
            for(int j=0; j<a-1; j++){
                if(s.charAt(i)==ch[j]){
                    count = count+1;
                }
            }
            if(count==1){
                System.out.println("maximum number of character  "+s.charAt(i)+" is repeated "+arr[s.charAt(i)]);
            }
        }
    }
}
