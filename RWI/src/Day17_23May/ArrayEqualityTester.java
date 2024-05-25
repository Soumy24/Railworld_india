package Day17_23May;

public class ArrayEqualityTester {

    public static boolean arraysAreEqual(int[] array1, int[] array2) {
        // Check if the arrays have the same length
        if (array1.length != array2.length) {
            return false;
        }

        // Iterate through each element and compare
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        // Arrays are equal
        return true;
    }

    public static void main(String[] args) {
        // Sample arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        // Test array equality
        boolean result = arraysAreEqual(array1, array2);

        // Print the result
        if (result) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}
