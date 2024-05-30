import java.util.Scanner;

import Dao.CustomerDao;
import models.Customer;
import service.BillService;
import service.CustomerService;
import service.ProductService;

public class Main {


    private static CustomerService customerService = new CustomerService();
    private static ProductService productService = new ProductService();
    private static BillService billService = new BillService();

private static Customer customer= new Customer();
    private static CustomerDao customerDao= new CustomerDao();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("SuperMarket Billing System");

            System.out.println("1. Add Customer");
            System.out.println("2. Get All Customers");
            System.out.println("3. Update Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. View Customer by ID");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    customerDao.addCustomer();
                    break;

                case 2:
                    customerDao.getAllCustomers();
                    break;
                case 3:
                    customerDao.updateCustomer();
                    break;
                case 4:
                    customerDao.deleteCustomer();
                    break;
                case 5:
                    customerDao.getCustomerById();
                    break;
                case 6:

                    System.out.println("Exiting...");

                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }










    }

