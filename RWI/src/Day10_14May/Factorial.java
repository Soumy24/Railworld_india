package Day10_14May;
// Print the Factorial Using Recursionpublic class Factorial {
public class Factorial {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) { // Base case: factorial of 0 is 1
            return 1;
        } else { // Recursive case
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 23; // Change this value to test other numbers
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}
