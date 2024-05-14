package Day6_8May;

public class HighestPeakElement {

    public static Integer findPeak(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return arr[i];
            }
        }
        return null; // No such element found
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 7, 2, 1, 8};
        Integer peakElement = findPeak(array);
        if (peakElement != null) {
            System.out.println("Peak element not smaller than its neighbors: " + peakElement);
        } else {
            System.out.println("No such element found.");
        }
    }
}