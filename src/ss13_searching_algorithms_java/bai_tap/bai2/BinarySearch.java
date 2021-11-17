package ss13_searching_algorithms_java.bai_tap.bai2;

import java.util.Scanner;

public class BinarySearch {
    static int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    static int binarySearch(int[] arr, int left, int right, int value) {
        int middle = (right + left) / 2;

        if (right >= left) {
            if (value == arr[middle])
                return middle;
            if (value < arr[middle])
                return binarySearch(arr,left,middle-1,value);
            return binarySearch(arr,middle+1,right,value);
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("The number " + number + " at index " + binarySearch(arr,0,arr.length-1,number));
    }
}
