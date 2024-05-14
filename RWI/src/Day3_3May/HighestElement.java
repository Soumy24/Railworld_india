package Day3_3May;



import java.util.*;
public class HighestElement {


    public static void main(String args[]){
        int n = 5;
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }


            int largest = arr[0];
            for(int i = 0; i< arr.length;i++){

                if(arr[i] > largest){
                    largest = arr[i];
                }
            }
            System.out.println(largest);


             int secondLargest = arr[0];
            for(int i = 0; i< arr.length; i++){

                // if (arr[i] > secondLargest && secondLargest != largest) {
                    if (arr[i] > secondLargest && arr[i] < largest){
                    secondLargest = arr[i];

                }
            }
            System.out.println(secondLargest);


    }
    }
