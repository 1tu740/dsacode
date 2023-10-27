import java.util.*;

public class staircase_search {

    public static void staircase(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("the key is find on " + row + "," + col);
                break;
            }

            else if (matrix[row][col] > key) {
                col--;
            }

            else {
                row++;
            }
        }

    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        staircase(matrix, 33);
    }
}
