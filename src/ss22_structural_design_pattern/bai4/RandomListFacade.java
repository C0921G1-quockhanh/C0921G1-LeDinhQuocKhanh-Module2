package ss22_structural_design_pattern.bai4;

import java.util.List;
import java.util.Scanner;

public class RandomListFacade {
    Scanner sc = new Scanner(System.in);

    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade(RandomList randomList, ListFilter listFilter, ListPrinter listPrinter) {
        this.randomList = randomList;
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
    }

    public void printRandomEvenList() {
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        System.out.println("Enter min value: ");
        int minValue = sc.nextInt();
        System.out.println("Enter max value: ");
        int maxValue = sc.nextInt();

        List<Integer> numbers = randomList.generateList(size,minValue,maxValue);
        List<Integer> newEvenList = listFilter.filterOdd(numbers);
        System.out.print("The even list is: " );
        listPrinter.printList(newEvenList);
    }
}
