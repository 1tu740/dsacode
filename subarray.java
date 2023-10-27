import java.util.*;

public class subarray {

    public static void subarr(int numbers[]) {

        int max = 0;
        for (int i = 0; i < numbers.length; i++) {

            int sum = 0;
            int m = 0;

            for (int j = i + 1; j <= numbers.length; j++) {

                for (int k = i; k < j; k++) {
                    System.out.print(" " + numbers[k]);

                    m = k;
                }

                sum = sum + numbers[m];
                System.out.println(" sum of number is " + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            max = max + numbers[i];

        }
        System.out.println("maximum sum is " + max);

    }

    public static void main(String[] args) {

        int numbers[] = { 2, 4, 6, 8, 10, 3, 5 };

        subarr(numbers);
    }

}
