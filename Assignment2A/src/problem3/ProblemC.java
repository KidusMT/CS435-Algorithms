package problem3;

import java.util.Arrays;

/**
 * @author KidusMT
 * Date: 5/20/2021
 */
public class ProblemC {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[] {1, 4, 5, 8, 17}, new int[] {2, 4, 8, 11, 13, 21, 23, 25})));
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            result[count] = arr1[i];
            count++;
        }

        for (int i = 0; i < arr2.length; i++) {
            result[count] = arr2[i];
            count++;
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = i; j < result.length; j++) {
                if (result[j] < result[i]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        return result;
    }
}
