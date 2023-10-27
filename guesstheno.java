import java.util.*;

public class guesstheno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int guessno = rand.nextInt(100);

        for (int i = 0; i < 5; i++) {

            int a = sc.nextInt();
            if (guessno == a) {
                System.out.println("you win");
            } else if (guessno < a) {
                System.out.println("guess some small");

            }

            else if (guessno > a) {
                System.out.println("guess some big");
            }
        }

        System.out.println("the no. is " + guessno);

    }
}
