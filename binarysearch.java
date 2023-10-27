import java.util.*;

public class binarysearch {

    public static int binary(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                return mid;
            }

            else if (number[mid] < key) {
                start = mid + 1;

            }

            else {
                end = mid - 1;

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] number = { 25, 38, 45, 55, 70 };

        System.out.println("index of the key is " + binary(number, 55));
    }
}
