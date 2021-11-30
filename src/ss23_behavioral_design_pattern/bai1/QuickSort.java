package ss23_behavioral_design_pattern.bai1;

import java.util.List;

public class QuickSort implements SortStrategy{
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Quick sort");
    }
}
