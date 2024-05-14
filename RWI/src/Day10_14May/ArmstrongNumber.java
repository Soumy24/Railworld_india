package Day10_14May;
// Print the Armstrong Number Using Recursion
public class ArmstrongNumber {

    // Method to count the number of digits in a number
    public static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigits(num / 10);
    }

    // Recursive method to calculate the power of a digit
    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    // Recursive method to calculate the sum of the digits raised to the power of the number of digits
    public static int sumOfPowers(int num, int numDigits) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return power(digit, numDigits) + sumOfPowers(num / 10, numDigits);
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int numDigits = countDigits(num);
        return num == sumOfPowers(num, numDigits);
    }

    public static void main(String[] args) {
        int number = 153; // Change this value to test other numbers
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}