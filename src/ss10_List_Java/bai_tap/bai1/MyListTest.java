package ss10_List_Java.bai_tap.bai1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>(6);

        listInteger.add(0,1);
        listInteger.add(1,2);
        listInteger.add(2,3);
        listInteger.add(3,4);

        System.out.println(listInteger.size());

        for (int i = 0; i < listInteger.size(); i++) {
            System.out.print(listInteger.get(i) + "\t");
        }

        listInteger.remove(1);

        System.out.println();
        System.out.println(listInteger.size());

        for (int i = 0; i < listInteger.size(); i++) {
            System.out.print(listInteger.get(i) + "\t");
        }
    }
}
