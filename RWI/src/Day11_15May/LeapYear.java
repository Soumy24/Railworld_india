package Day11_15May;



import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Year :");
        int a= sc.nextInt();

        if (a%100==0) {
            if (a %400==0) {
                System.out.println(a+" is Leap Year");

            }
            else
                System.out.println(a+" is not Leap year");

        }
        else if (a%4==0){
            System.out.println(a+" is Leap year");
        }
        else
            System.out.println(a+" is not Leap year");
    }
}