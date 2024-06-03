package service;
import models.Product;
import Dao.ProductDao;
import java.util.List;

public class ProductService {
    private ProductDao productDao = new ProductDao();

    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    public Product getProductById(int id) {
        return productDao.getProductById(id);
    }

    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    public void updateProduct(Product product) {
        productDao.updateProduct(product);
    }

    public void deleteProduct(int id) {
        productDao.deleteProduct(id);
    }

}
