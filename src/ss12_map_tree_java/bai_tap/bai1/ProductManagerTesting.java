package ss12_map_tree_java.bai_tap.bai1;

public class ProductManagerTesting {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        Product product1 = new Product("Co Gai Ha Lan",1,27000);
        Product product2 = new Product("Yomost",2,25000);
        Product product3 = new Product("Milo",3,30000);
        Product product4 = new Product("Vinamilk",4,26000);

        //Check addProduct()
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.addProduct(product4);

        productManager.displayProduct(productManager.getProductList());

        //Check editProduct()
        productManager.editProduct(5);

        productManager.displayProduct(productManager.getProductList());
    }
}
