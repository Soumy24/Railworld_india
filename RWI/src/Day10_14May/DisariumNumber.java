package Day10_14May;
// Print the Disarium Number Using Recursion
public class DisariumNumber {

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

    // Recursive method to calculate the sum of digits powered to their respective positions
    public static int sumOfPowers(int num, int position) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return power(digit, position) + sumOfPowers(num / 10, position - 1);
    }

    // Method to check if a number is a Disarium number
    public static boolean isDisarium(int num) {
        int numDigits = countDigits(num);
        return num == sumOfPowers(num, numDigits);
    }

    public static void main(String[] args) {
        int number = 135; // Change this value to test other numbers
        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }
    }
}
