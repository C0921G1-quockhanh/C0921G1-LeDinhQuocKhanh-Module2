package ss3_array_method_java.thuc_hanh;

public class findMinimum {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValueIndex(arr);
        System.out.println("The smallest element in the array is " + arr[index]);
    }

    public static int minValueIndex(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
