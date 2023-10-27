import java.util.*;

public class decreaseorderrecursuionnum {

    public static int recursion(int n) {

        // if (n == 1) {
        // System.out.println(n);
        // return;

        // }
        // System.out.println(n + " ");
        // recursion(n - 1);
        //

        if (n == 0) {
            return 1;
        }

        int sum = n * recursion(n - 1);
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
}
