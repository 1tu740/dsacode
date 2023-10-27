import java.util.*;

public class countinputs {
    public static void main(String[] args) {
        int n = 100;
        int zero = 0;
        int positivenumber = 0;
        int negativenumber = 0;
        for (int i = 1; i <= n; i++) {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            if (a == 0) {

                zero++;
                System.out.println("total number of zero is " + zero);
                System.out.println("positive number is" + positivenumber);
                System.out.println("negative number is" + negativenumber);

            }

            else if (a > 0) {

                positivenumber++;
                System.out.println("positive number is" + positivenumber);
                System.out.println("total number of zero is " + zero);
                System.out.println("negative number is" + negativenumber);

            }

            else {

                negativenumber++;
                System.out.println("positive number is" + positivenumber);
                System.out.println("total number of zero is " + zero);

                System.out.println("negative number is" + negativenumber);

            }

        }

    }
}
