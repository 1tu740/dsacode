import java.util.*;

public class oddfunction {

    public static int odd(int n) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int a = odd(5);
        System.out.println(a);
    }

}
