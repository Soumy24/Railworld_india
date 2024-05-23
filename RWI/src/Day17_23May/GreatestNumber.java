package Day17_23May;

public class GreatestNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 15;

        int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("The greatest number among " + a + ", " + b + ", and " + c + " is: " + greatest);
    }
}
