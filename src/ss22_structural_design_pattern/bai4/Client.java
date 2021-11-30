package ss22_structural_design_pattern.bai4;

public class Client {
    public static void main(String[] args) {
        RandomListFacade randomListFacade = new RandomListFacade(new RandomList(), new ListFilter(), new ListPrinter());
        randomListFacade.printRandomEvenList();
    }
}
