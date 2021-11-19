package ss14_sorting_algorithms_java.bai_tap.bai1;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;

            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j+1] = list[j];
            }

            list[j + 1] = currentElement;
        }
    }

    static int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
