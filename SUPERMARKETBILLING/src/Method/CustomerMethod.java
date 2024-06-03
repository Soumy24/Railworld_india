package Method;

import models.Customer;
import service.CustomerService;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class CustomerMethod
{

    private CustomerService customerService = new CustomerService();
    private Scanner scanner = new Scanner(System.in);

    public void customer() throws SQLException
    {
        System.out.println("1. Add Customer");
        System.out.println("2. View All Customers");
        System.out.println("3. Update Customer");
        System.out.println("4. Delete Customer");
        System.out.println("5. View Customer by ID");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice)
        {
            case 1:
                addCustomer();
                break;
            case 2:
                viewAllCustomer();
                break;
            case 3:
                updateCustomer();
                break;
            case 4:
                deleteCustomer();
                break;
            case 5:
                viewCustomerById();
                break;
            case 6:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    public void addCustomer() throws SQLException
    {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Contact: ");
        String cont = scanner.nextLine();

        Customer customer = new Customer();
        customer.setName(name);
        customer.setContact(cont);

        customerService.addCustomer(customer);
        System.out.println("Customer added successfully!");
    }

    public void viewAllCustomer() throws SQLException
    {
        List<Customer> customers = customerService.getAllCustomers();
        System.out.println("\nEmployee List:");
        for (Customer customer : customers)
        {
            System.out.println("ID: " + customer.getId() + ", Name: " + customer.getName() +
                    ", Contact Number: " + customer.getContact());
        }
    }
    public void updateCustomer() throws SQLException
    {
        System.out.print("Enter Customer ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new Contact Number: ");
        String cont = scanner.nextLine();

        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(name);
        customer.setContact(cont);

        customerService.updateCustomer(customer);
        System.out.println("Customer updated successfully!");
    }

    public void deleteCustomer() throws SQLException
    {
        System.out.print("Enter Customer ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        customerService.deleteCustomer(id);
        System.out.println("Customer deleted successfully!");
    }

    public void viewCustomerById() throws SQLException
    {
        System.out.print("Enter Customer ID to view: ");
        int id = Integer.parseInt(scanner.nextLine());


        Customer customer = customerService.getCustomerById(id);
        if (customer != null)
        {
            System.out.println("ID: " + customer.getId() + ", Name: " + customer.getName() +
                    ", Contact number: " + customer.getContact());
        }
        else
        {
            System.out.println("Customer not found with ID: " + id);
        }
    }
}
