/**
 * @author KidusMT
 * Date: 5/17/2021
 */
public class Problem1 {

    public static void main(String[] args) {
        System.out.println(sumFound(new int[]{1, 4, 2, 3}, 5));  // Example 1
        System.out.println(sumFound(new int[]{3, 3, 4, 7}, 6));  // Example 2
        System.out.println(sumFound(new int[]{1}, 2));           // Example 3
    }

    // I haven't take FPP but I think this is the best I can come up with for this solution
    public static boolean sumFound(int[] arr, int z) {
        if (arr == null || arr.length < 2) {
            return false;
        }
        //implement
        for (int i = 0; i < arr.length; i++) {
            // letting "j" start with the current position of "i", making it efficient
            // by not repeating items in loop iteration
            for (int j = i; j < arr.length; j++) {
                if (arr[i] != arr[j] && arr[i] + arr[j] == z) {
                    System.out.format("arr[i]: %d arr[j]: %d \n", arr[i], arr[j]);
                    return true;
                }
            }
        }

        return false;
    }
}
