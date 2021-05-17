/**
 * @author KidusMT
 * Date: 5/17/2021
 */
public class Problem1 {

    public static void main(String[] args) {
        System.out.println(sumFound(new int[]{1, 4, 2, 3}, 5));  // case 1
        System.out.println(sumFound(new int[]{3, 3, 4, 7}, 6));  // case 2
        System.out.println(sumFound(new int[]{1}, 2));           // case 3
    }

    public static boolean sumFound(int[] arr, int z) {
        if (arr == null || arr.length < 2) {
            return false;
        }
        //implement
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] != arr[j] && arr[i] + arr[j] == z) {
//                    System.out.format("arr[i]: %d arr[j]: %d", arr[i], arr[j]);
                    return true;
                }
            }
        }

        return false;
    }
}
