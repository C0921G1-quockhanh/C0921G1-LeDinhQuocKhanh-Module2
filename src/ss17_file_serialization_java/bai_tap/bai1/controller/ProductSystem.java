package ss17_file_serialization_java.bai_tap.bai1.controller;

import ss17_file_serialization_java.bai_tap.bai1.models.Product;
import ss17_file_serialization_java.bai_tap.bai1.services.ProductManager;

import java.util.Scanner;

public class ProductSystem {
    Scanner sc = new Scanner(System.in);

    ProductManager productManager;

    public ProductSystem() {
    }

    public ProductSystem(ProductManager productManager) {
        this.productManager = productManager;
    }

    public void displaySystem() {
        int choice = -1;

        while (choice != 0) {
            System.out.println("Product Management System: ");
            System.out.println("1. Creating new product");
            System.out.println("2. Searching product by ID");
            System.out.println("3. Deleting product by ID");
            System.out.println("4. Displaying sorted system");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    productManager.createProduct();
                    break;

                case 2:
                    System.out.println("Enter the id of product you want to search: ");
                    int ID1 = Integer.parseInt(sc.nextLine());

                    Product foundProduct = productManager.searchProduct(ID1);
                    System.out.println(foundProduct);
                    break;

                case 3:
                    System.out.println("Enter the id of product you want to delete: ");
                    int ID2 = Integer.parseInt(sc.nextLine());

                    Product removedProduct = productManager.deleteProduct(ID2);
                    System.out.println(removedProduct);
                    break;

                case 4:
                    productManager.displaySortedSystem();
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}
