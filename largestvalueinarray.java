
import java.util.*;

public class largestvalueinarray {

    public static int greatestnumber(int number[]) {
        int greaternumber = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (greaternumber < number[i]) {
                greaternumber = number[i];
            }
        }
        return greaternumber;

    }

    public static void main(String[] args) {
        int[] number = { 10, 13, 15, 17, 21, 25 };
        System.out.println("the greater number is " + greatestnumber(number));
    }
}
