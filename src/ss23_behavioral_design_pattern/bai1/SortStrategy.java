package ss23_behavioral_design_pattern.bai1;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
