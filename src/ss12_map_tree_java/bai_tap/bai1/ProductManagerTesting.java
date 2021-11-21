package ss12_map_tree_java.bai_tap.bai1;

import java.util.List;

public class ProductManagerTesting {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        List<Product> productList = productManager.getProductList();

        Product product1 = new Product("Co Gai Ha Lan",1,27000);
        Product product2 = new Product("Yomost",2,25000);
        Product product3 = new Product("Milo",3,30000);
        Product product4 = new Product("Vinamilk",4,26000);

        //Check addProduct()
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.addProduct(product4);

        productManager.displayProduct(productList);

//        //Check editProduct()
//        productManager.editProduct(3);
//
//        System.out.println("\nThe product list after editing:");
//        productManager.displayProduct(productList);

//        //Check deleteProduct()
//        System.out.println("\nThe product you want to delete: ");
//        System.out.println(productManager.deleteProduct(2));
//
//        System.out.println("\nThe product list after removing: ");
//        productManager.displayProduct(productList);

//        //Check findProduct()
//        System.out.println("\nThe product you want to find: ");
//        System.out.println(productManager.findProduct("Co Gai Ha Lan"));

//        //Check sortProductList()
//        System.out.println("\nAfter sorted: ");
//
//        productManager.sortProductList(productList);
//        for (Product product: productList) {
//            System.out.println(product);
//        }
    }
}
