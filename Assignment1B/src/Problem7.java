/**
 * @author KidusMT
 * Date: 5/19/2021
 */
public class Problem7 {

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            System.out.println(generate(i));
        }
        //Your output should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765.
    }

    public static int generate(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        //implement
        int a1 = 0;
        int a2 = 1;
        int accum = a1 + a2;
        for (int i = 1; i <= n; i++) {
            accum = a1 + a2;
            a1 = a2;
            a2 = accum;
        }

        return accum;
    }

}
