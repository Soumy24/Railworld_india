package Day17_23May;

import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};
        findUnionAndIntersection(arr1, arr2);

        int[] arr3 = {2, 5, 6};
        int[] arr4 = {4, 6, 8, 10};
        findUnionAndIntersection(arr3, arr4);
    }

    public static void findUnionAndIntersection(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        for (int num : arr1) {
            unionSet.add(num);
        }

        for (int num : arr2) {
            if (!unionSet.contains(num)) {
                unionSet.add(num);
            } else {
                intersectionSet.add(num);
            }
        }

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }
}
