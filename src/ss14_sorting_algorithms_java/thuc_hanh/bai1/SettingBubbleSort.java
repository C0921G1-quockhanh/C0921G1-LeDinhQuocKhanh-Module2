package ss14_sorting_algorithms_java.thuc_hanh.bai1;

public class SettingBubbleSort {
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int i = 0; i < list.length - 1 && needNextPass; i++) {
            needNextPass = false;

            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    static int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
