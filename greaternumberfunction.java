import java.util.*;

public class greaternumberfunction {

    public static int greater(int a, int b) {

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {

            return a;
        }

        else if (a < b) {

            return b;
        }

        else {

            return a;
        }

    }

    public static void main(String[] args) {

        int a = greater(1, 1);
        System.out.println(a);

    }

}
