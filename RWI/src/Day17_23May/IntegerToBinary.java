package Day17_23May;

public class IntegerToBinary {
    public static void main(String[] args) {
        int number = 67;

        // Convert integer to binary string
        String binaryString = Integer.toBinaryString(number);

        // Print the original integer and its binary representation
        System.out.println("Original value: " + number);
        System.out.println("Binary representation: " + binaryString);
    }
}

