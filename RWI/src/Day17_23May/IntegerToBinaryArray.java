package Day17_23May;

public class IntegerToBinaryArray {
    public static void main(String[] args) {
        int number = 56;

        if (number < 0) {
            System.out.println("Negative numbers cannot be represented in simple binary.");
            return;
        }


        int numBits = 32;
        int[] binaryArray = new int[numBits];


        int index = numBits - 1;
        while (number > 0) {
            binaryArray[index] = number % 2;
            number /= 2;
            index--;
        }


        System.out.println("Original value: " + number);
        System.out.print("Binary representation: ");
        for (int i = 0; i < numBits; i++) {
            System.out.print(binaryArray[i]);
        }
    }
}