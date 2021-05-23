import java.util.*;

/**
 * @author KidusMT
 * Date: 5/19/2021
 */
public class Problem6 {

    public static void main(String[] args) {
        System.out.println(powerSet(Arrays.asList(1, 2)));
    }

    public static List<Set<Integer>> powerSet(List<Integer> list) {
        List<Set<Integer>> wholeSet= new ArrayList<>() ;
        Set<Integer> subsetCreated = new HashSet<Integer>();
        subsetCreator(wholeSet,subsetCreated, list,0);
        return wholeSet;
    }

    private static void subsetCreator(List<Set<Integer>> wholeSet, Set<Integer> subsetCreated, List<Integer> list, int start) {
        wholeSet.add(new HashSet<>(subsetCreated));
        System.out.println("===>wholeSet: "+wholeSet);
        for (int i=start;i<list.size();i++){
            subsetCreated.add(list.get(i));
            System.out.format("addedItem: %s\n",list.get(i));
            subsetCreator(wholeSet,subsetCreated,list,i+1);
            System.out.println("****>wholeSet: "+subsetCreated);
            System.out.format("removedItem: %s\n",list.get(subsetCreated.size()-1));
            subsetCreated.remove(subsetCreated.size()-1);
        }
    }
}
