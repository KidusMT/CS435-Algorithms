package problem5;

import java.util.Arrays;

/**
 * @author KidusMT
 * Date: 5/21/2021
 */
public class ProblemC {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{66, 33, 22, 11, 44, 55, 99})));
    }

    public static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            boolean isSorted = true;
            for (int j = 0; j < len - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSorted = false;
                }
            }
            if (isSorted)
                break;
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
