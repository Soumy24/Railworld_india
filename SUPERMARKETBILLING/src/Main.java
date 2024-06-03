
import java.sql.SQLException;
import java.util.Scanner;
import Method.BillMethod;
import Method.CustomerMethod;
import Method.ProductMethod;


public class Main {

    private static CustomerMethod customerMethod = new CustomerMethod();
    private static ProductMethod productMethod = new ProductMethod();
    private static BillMethod billMethod = new BillMethod();

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("SuperMarket Billing System");
            System.out.println("1. Customer");
            System.out.println("2. Product");
            System.out.println("3. Billing");
            int add=scanner.nextInt();
            switch(add){
                case 1:
                    customerMethod.customer();
                    break;
                case 2:
                    productMethod.product();
                    break;
                case 3:
                    billMethod.billing();

                    break;
                default:
                    System.out.println("Invalid");
            }

        }
    }
}
