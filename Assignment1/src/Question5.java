/**
 * @author KidusMT
 * Date: 5/17/2021
 */
public class Question5 {
    public static void main(String[] args) {
        System.out.println(find(new int[]{2, 8, 3, 4}, 3));
        System.out.println(find(new int[]{2, 8, 3, 4}, 5));
    }

    public static boolean find(int[] arr, int z) {
        //implement
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]==z) return true;
        }
        return false;
    }
}
