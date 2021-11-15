package ss3_array_method_java.bai_tap;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,6,0,3,2,1};
        int X = 7;
        int indexDel = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                indexDel = i;
            }
        }

        for (int i = indexDel; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;

        System.out.printf("%-30s%s", "Delete Element List:", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
