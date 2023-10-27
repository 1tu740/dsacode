import java.util.*;

public class two_d_array {

    public static int findsmallestnumber(int numbers[][]) {

        int n = Integer.MAX_VALUE;

        // smallest number
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {

                if (n > numbers[i][j]) {

                    n = numbers[i][j];
                }

            }

        }

        return n;

    }

    public static int findgreatesttnumber(int numbers[][]) {

        int n = Integer.MIN_VALUE;

        // smallest number
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {

                if (n < numbers[i][j]) {

                    n = numbers[i][j];
                }

            }

        }

        return n;

    }

    public static void printnum(int numbers[][]) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int numbers[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {

                numbers[i][j] = sc.nextInt();

            }
        }

        printnum(numbers);
        System.out.println("smallest number is " + findsmallestnumber(numbers));
        System.out.println("smallest number is " + findgreatesttnumber(numbers));

    }
}
