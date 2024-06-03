package Method;
import models.Product;
import service.ProductService;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ProductMethod {

    private ProductService productService = new ProductService();
    private Scanner scanner = new Scanner(System.in);


    public void product() throws SQLException {
        System.out.println("1. Add Product");
        System.out.println("2. View All Product");
        System.out.println("3. Update Product");
        System.out.println("4. Delete Product");
        System.out.println("5. View Product by ID");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        switch (choice) {
            case 1:
                addProduct();
                break;
            case 2:
                viewAllProduct();
                break;
            case 3:
                updateProduct();
                break;
            case 4:
                deleteProduct();
                break;
            case 5:
                viewProductById();
                break;
            case 6:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public void addProduct() throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int qut = scanner.nextInt();

        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(qut);

        productService.addProduct(product);
        System.out.println("Product added successfully!");
    }

    public void viewAllProduct() throws SQLException {
        List<Product> products = productService.getAllProducts();
        System.out.println("\nProduct List:");
        for (Product product : products) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() +
                    ", Price: " + product.getPrice() + ", Quantity: " + product.getQuantity());
        }
    }

    public void updateProduct() throws SQLException {
        System.out.print("Enter employee ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter new ID: ");
        int nid = scanner.nextInt();
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new Price: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter new quantity: ");
        int qt = scanner.nextInt();


        Product product = new Product();
        product.setId(nid);
        product.setName(name);
        product.setPrice(salary);
        product.setQuantity(qt);

        productService.updateProduct(product);
        System.out.println("product updated successfully!");
    }

    public void deleteProduct() throws SQLException
    {
        System.out.print("Enter product ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        productService.deleteProduct(id);
        System.out.println("product deleted successfully!");
    }

    public void viewProductById() throws SQLException
    {
        System.out.print("Enter product ID to view: ");
        int id = Integer.parseInt(scanner.nextLine());

        Product product = productService.getProductById(id);
        if (product != null)
        {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() +
                    ", Price: " + product.getPrice() + ", Quantity: " + product.getQuantity());
        }
        else
        {
            System.out.println("Employee not found with ID: " + id);
        }
    }
}
