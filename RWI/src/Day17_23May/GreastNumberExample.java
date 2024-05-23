package Day17_23May;

import java.util.Scanner;

 class GreatestNumberExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter three numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        scanner.close();

        // Find the greatest number using ternary operator
        int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        // Print the result
        System.out.println("The greatest number among " + a + ", " + b + ", and " + c + " is: " + greatest);
    }
}
