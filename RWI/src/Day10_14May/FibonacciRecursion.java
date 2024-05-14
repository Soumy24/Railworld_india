package Day10_14May;

public class FibonacciRecursion {

    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Method to print the Fibonacci series up to n terms
    public static void printFibonacciSeries(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        int terms = 10; // Number of terms to print
        System.out.println("Fibonacci series up to " + terms + " terms:");
        printFibonacciSeries(terms);
    }
}

