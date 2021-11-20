package ss12_map_tree_java.bai_tap.bai1;

import java.util.ArrayList;
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

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void editProduct(int id) {
        boolean checkID = false;
        int index = 0;

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                checkID = true;
                index = i;
                break;
            }
        }

        if (checkID) {
            Product product = productList.get(index);

            System.out.println("Enter new name: ");
            String newName = sc.nextLine();
            product.setName(newName);

            System.out.println("Enter new price: ");
            double newPrice = sc.nextDouble();
            product.setPrice(newPrice);
        } else {
            System.out.println("Please check the ID of the product!");
        }
    }

   public void displayProduct(List<Product> productList) {
        for (Product product: productList) {
            System.out.println(product);
        }
   }
}
