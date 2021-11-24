package ss17_file_serialization_java.bai_tap.bai1.controller;

import ss17_file_serialization_java.bai_tap.bai1.models.Product;
import ss17_file_serialization_java.bai_tap.bai1.services.ProductManager;

import java.util.List;

public class ProductSystemTesting {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        List<Product> productList = productManager.getProductList();

        Product product1 = new Product(1,"Co Gai Ha Lan","Dutch Lady",27000);
        Product product2 = new Product(2,"Milo","Milo Company",30000);
        Product product3 = new Product(3,"Yomost","Yomost Company",25000);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        ProductSystem productSystem = new ProductSystem(productManager);
        productSystem.displaySystem();
    }
}
