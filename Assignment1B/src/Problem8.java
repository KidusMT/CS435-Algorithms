import java.util.ArrayList;
import java.util.List;

/**
 * @author KidusMT
 * Date: 5/19/2021
 */
public class Problem8 {

    public static void main(String[] args) {
        System.out.println(smallestCommon(4, 6));
        System.out.println(smallestCommon(3, 5));
        System.out.println(smallestCommon(7, 14));
    }

    public static int smallestCommon(int x, int y) {
        //implement
        List<Integer> factorOfMax = new ArrayList<>();
        int min = x < y ? x : y;
        int max = x == min ? y : x;
        int factorOfMin = min;
        int fact = 1;
        while (!factorOfMax.contains(factorOfMin)) {
            factorOfMax.add(max * fact);
            factorOfMin = min * fact;
            fact++;
        }
        return factorOfMin;
    }

}
