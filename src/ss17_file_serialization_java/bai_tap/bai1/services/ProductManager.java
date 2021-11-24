package ss17_file_serialization_java.bai_tap.bai1.services;

import ss17_file_serialization_java.bai_tap.bai1.models.Product;
import ss17_file_serialization_java.bai_tap.bai1.services.PriceComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner sc = new Scanner(System.in);

    private List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void createProduct() {
        System.out.println("Enter product ID: ");
        int ID = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the name of product: ");
        String productName = sc.nextLine();

        System.out.println("Enter the name of manufacturer: ");
        String manufacturer = sc.nextLine();

        System.out.println("Enter the price of product: ");
        double price = Double.parseDouble(sc.nextLine());

        Product product = new Product(ID,productName,manufacturer,price);
        productList.add(product);
    }

    public Product searchProduct(int ID) {
        boolean checkID = false;
        int index = 0;

        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);

            if (product.getID() == ID) {
                checkID = true;
                index = i;
                break;
            }
        }

        if (checkID)
            return productList.get(index);
        else
            return null;
    }

    public Product deleteProduct(int ID) {
        boolean checkID = false;
        int index = 0;

        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);

            if (product.getID() == ID) {
                checkID = true;
                index = i;
                break;
            }
        }

        if (checkID)
            return productList.remove(index);
        else
            return null;
    }

    public void displaySortedSystem() {
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(productList,priceComparator);

        for (Product product: productList) {
            System.out.println(product);
        }
    }

}
