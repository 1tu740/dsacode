/**
 * pattern
 */
public class pattern {

    public static void main(String args[]) {

        // question-1

        // for (int i = 1; i <= 4; i++) {

        // for (int j = 1; j <= 5; j++) {

        // System.out.print("*");

        // }
        // System.out.println("*");
        // }

        // question-2

        // int n = 4;
        // int m = 5;

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= m; j++) {

        // if (i == 1 || i == n || j == 1 || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }

        // }
        // System.out.println();
        // }

        // question-3

        // int n = 4;

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // question-4

        // int n = 4;

        // for (int i = n; i >= 1; i--) {

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }

        // question-6

        // int n = 5;

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // question-7

        // int n = 5;

        // for (int i = n; i >= 1; i--) {

        // for (int j = 1; j <= i; j++) {

        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // question-8

        // int n = 5;
        // int k = 0;

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= i; j++) {
        // k++;
        // System.out.print(k);
        // }
        // System.out.println();
        // }

        // question-9

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                int sum = i + j;

                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}
