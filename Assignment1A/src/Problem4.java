import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author KidusMT
 * Date: 5/17/2021
 */
public class Problem4 {
    public static void main(String[] args) {
        sort(new ArrayList<>(Arrays.asList(1, 3, 9, 4, 8, 5)));
        sort(new LinkedList<>(Arrays.asList(1, 3, 9, 4, 8, 5)));
    }

    // works for ArrayList
    public static void sort(ArrayList<Integer> list) {
        //implement
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(i)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }

    // works for LinkedList
    public static void sort(LinkedList<Integer> list){
        //implement
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(i)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}
