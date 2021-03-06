/**
 * @author KidusMT
 * Date: 5/17/2021
 */
public class Problem2 {
    public static void main(String[] args) {
        System.out.println(secondSmallest(new int[]{1, 4, 2, 3}));  // Example 1
        System.out.println(secondSmallest(new int[]{3, 3, 4, 7}));  // Example 2
        System.out.println(secondSmallest(new int[]{9}));           // Example 3
    }

    public static int secondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        //implement
        int smallest = arr[0] < arr[1] ? arr[0] : arr[1];
        // System.out.println("==>"+smallest);
        int secondSmallest = smallest == arr[0] ? arr[1] : arr[0];
        // System.out.println("==>"+secondSmallest);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < smallest) {
                // if there is another smallest then replacing the second smallest with the old
                // smallest and continuing to check if there is more
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest) {
                    secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }

}
