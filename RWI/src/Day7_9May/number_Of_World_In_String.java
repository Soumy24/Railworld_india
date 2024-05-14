package Day7_9May;

public class number_Of_World_In_String {
    public static void main(String[] args) {
        String s = "Anis is a good boy";
        int a = s.length();
        char[] ch = new char[a];
        int count =0;
        for (int i=0; i<a; i++){
            ch[i] = s.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) ){

                count = count+1;
            }
        }
        System.out.println("the number of world in given string is : = "+count);
    }
}
