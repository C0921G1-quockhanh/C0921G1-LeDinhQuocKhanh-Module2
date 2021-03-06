package ss17_file_serialization_java.bai_tap.bai1.services;

import ss17_file_serialization_java.bai_tap.bai1.models.Product;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if (p1.getPrice() > p2.getPrice())
            return 1;
        else if (p1.getPrice() < p2.getPrice())
            return -1;
        return 0;
    }
}
