package ss12_map_tree_java.bai_tap.bai1;

import java.util.*;

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

    public Product deleteProduct(int id) {
        boolean checkID = false;
        int index = 0;
        Product removedProduct = null;

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                checkID = true;
                index = i;
                break;
            }
        }

        if (checkID) {
            removedProduct = productList.remove(index);
        } else {
            System.out.println("Please check the ID of the product!");
        }

        return removedProduct;
    }

    public void displayProduct(List<Product> productList) {
        for (Product product: productList) {
            System.out.println(product);
        }
    }

    public Product findProduct(String name) {
        boolean checkName = false;
        int index = 0;
        Product foundProduct = null;

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName() == name) {
                checkName = true;
                index = i;
                break;
            }
        }

        if (checkName) {
            foundProduct = productList.get(index);
        } else {
            System.out.println("Please check the ID of the product");
        }

        return foundProduct;
    }

    public void sortProductList(List<Product> productList) {
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(productList,priceComparator);
    }
}
