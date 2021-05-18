import lab1.powerset.PowerSet;

import java.util.*;

/**
 * @author KidusMT
 * Date: 5/17/2021
 */
public class Problem3 {
    public static void main(String[] args) {
        System.out.println(sumFound(new LinkedList<>(Arrays.asList(1, 3, 9, 4, 8, 5)), 21));  // Example 1
        System.out.println(sumFound(new LinkedList<>(Arrays.asList(1, 3, 9, 4, 8, 5)), 22));  // Example 2
        System.out.println(sumFound(new LinkedList<>(Arrays.asList(1, 3, 9, 4, 8, 5)), 31));  // Example 3
        System.out.println(sumFound(new LinkedList<>(Arrays.asList(1, 3, 9, 4, 8, 5)), 0));   // Example 4
    }

    public static boolean sumFound(List list, int k) {
        //implement
        if (list == null) return false;
        List<Set<Integer>> temp = PowerSet.powerSet(list);
        for (Set<Integer> setItems : temp) {
            // since iteration through list is easy we can convert the distinct items in
            // list into a list item
            List<Integer> tempInt = convertSetToList(setItems);
            int tempSum = 0;
            for (int i = 0; i < tempInt.size(); i++) {
                for (int j = i; j < tempInt.size(); j++) {
                    if (tempSum < k) tempSum += j;        //
                    else if (tempSum == k) return true;   //
                    else break;                           //
                }
            }
        }

        return false;
    }

    /**
     *
     * @param set distinct items
     * @param <T> currently Integer value
     * @return List of Object
     */
    public static <T> List<T> convertSetToList(Set<T> set) {
        List<T> list = new ArrayList<>();
        for (T t : set)
            list.add(t);
        return list;
    }
}
