package Day17_23May;

public class IntegerToBinaryExample {

    public static void main(String[] args) {
        int number = 56; // The integer you want to convert

        // Ensure the number is positive
        if (number < 0) {
            System.out.println("Negative numbers cannot be represented in simple binary.");
            return;
        }

        // Create a StringBuilder to store the binary representation
        StringBuilder binary = new StringBuilder();

        // Perform the binary conversion
        while (number > 0) {
            // Append the least significant bit of the number to the binary string
            binary.insert(0, number % 2);

            // Divide the number by 2 to shift to the next bit
            number /= 2;
        }
// Print the original integer and its binary representation
        System.out.println("Original value: " + number);
        System.out.println("Binary representation: " + binary);
}
}

