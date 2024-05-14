package Day3_3May;

public class Swap {
    public static void main(String args[]) {
        int x = 10;
        int y = 5;
        x = x + y; // x now becomes 15
        y = x - y; // y becomes 10(15-5)
        x = x - y; // x becomes 5(15-10)
        System.out.println("After awapping : " + "x = " + x + " y = " + y);
    }
}
