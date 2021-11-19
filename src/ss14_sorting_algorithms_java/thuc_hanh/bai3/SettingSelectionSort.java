package ss14_sorting_algorithms_java.thuc_hanh.bai3;

public class SettingSelectionSort {
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i+1; j < list.length; j++) {
                if (list[j] > currentMax) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }

    static double[] arr = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void main(String[] args) {
        selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
