package Method;
import models.Bill;
import service.BillService;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class BillMethod {

    private BillService billService= new BillService();
    private Scanner scanner = new Scanner(System.in);

    public void billing() throws SQLException {
        System.out.println("1. Add Bill");
        System.out.println("2. Get All Bill Data");
        System.out.println("3. Update BillData");
        System.out.println("4. Delete Bill Data");
        System.out.println("5. View Bill Data by ID");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        switch (choice) {
            case 1:
                addBill();
                break;
            case 2:
                getAllBills();
                break;
            case 3:
                updateBill();
                break;
            case 4:
                deleteBill();
                break;
            case 5:
                getBillById();
                break;
            case 6:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }


    public void addBill() throws SQLException {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Amount: ");
        double amoutn = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Date: ");
        String date = scanner.nextLine();

        Bill bill = new Bill();
        bill.setCustomerId(id);
        bill.setTotalAmount(amoutn);
        bill.setDate(date);

        billService.addBill(bill);
        System.out.println("Bill added successfully!");
    }

    public void getAllBills() throws SQLException {
        List<Bill> bills = billService.getAllBills();
        System.out.println("\nBill List:");
        for (Bill bill : bills) {
            System.out.println("ID: " + bill.getId() + ", Customer ID: " + bill.getCustomerId() +
                    ", Amout: " + bill.getTotalAmount() + ", Date: " + bill.getDate());
        }
    }

    public void updateBill() throws SQLException {
        System.out.print("Enter bill ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter new Customer ID: ");
        int id1 = scanner.nextInt();
        System.out.print("Enter new Amount: ");
        double amoutn = scanner.nextDouble();
        System.out.print("Enter new Date: ");
        String date = scanner.nextLine();

        Bill bill = new Bill();
        bill.setId(id);
        bill.setCustomerId(id1);
        bill.setTotalAmount(amoutn);
        bill.setDate(date);

        billService.updateBill(bill);
        System.out.println("Bill updated successfully!");
    }

    public void deleteBill() throws SQLException {
        System.out.print("Enter bill ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        billService.deleteBill(id);
        System.out.println("bill deleted successfully!");
    }

    public void getBillById() throws SQLException {
        System.out.print("Enter bill ID to view: ");
        int id = Integer.parseInt(scanner.nextLine());

        Bill bill = billService.getBillById(id);
        if (bill != null) {
            System.out.println("ID: " + bill.getId() + ", Customer ID: " + bill.getCustomerId() +
                    ", Amout: " + bill.getTotalAmount() + ", Date: " + bill.getDate());
        } else {
            System.out.println("Employee not found with ID: " + id);
        }
    }
}
