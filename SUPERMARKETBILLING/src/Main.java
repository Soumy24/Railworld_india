import java.sql.SQLException;
import java.util.Scanner;

import Method.BillMethod;
import Method.CustomerMethod;
import Method.ProductMethod;


public class Main {

    private static CustomerMethod cusMethode = new CustomerMethod();
    private static ProductMethod proMethode = new ProductMethod();
    private static BillMethod billMethode = new BillMethod();

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("SuperMarket Billing System");
            System.out.println("1. Costomer");
            System.out.println("2. Billing");
            System.out.println("3. Product");
            int add=scanner.nextInt();
            switch(add){
                case 1:
                    cusMethode.customer();
                    break;
                case 2:
                    billMethode.billing();
                    break;
                case 3:
                    proMethode.product();

                    break;
                default:
                    System.out.println("Invalid");
            }

        }
    }
}
