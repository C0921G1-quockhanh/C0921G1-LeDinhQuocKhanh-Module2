package ss12_map_tree_java.bai_tap.bai1;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if (p1.getPrice() > p2.getPrice())
            return 1;
        if (p1.getPrice() < p2.getPrice())
            return -1;
        return 0;
    }
}
