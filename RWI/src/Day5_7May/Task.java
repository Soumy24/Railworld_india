package Day5_7May;

import java.text.DecimalFormat;

//take a float variable and print up to 2nd decimal place in java
public class Task {
    public static void main(String[] args) {
        float num = 4.1415926535F;
        String formattedNum = String.format("%.2f", num);
        System.out.println(formattedNum);

        double num1 = 4.1415926535;
        String formattedNum1 = String.format("%.2f", num1);
        System.out.println(formattedNum1);

        double d = 1.234567;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print(df.format(d));
    }
}