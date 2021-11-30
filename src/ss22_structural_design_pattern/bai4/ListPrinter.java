package ss22_structural_design_pattern.bai4;

import java.util.List;

public class ListPrinter {
    public void printList(List<Integer> numbers){
        for (Integer number: numbers) {
            System.out.print(number + " ");
        }
    }
}
