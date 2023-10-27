import java.util.*;

public class spiralmatrix {

    public static void printmatrix(int matrix[][]) {

        int startcoloum = 0;
        int startrow = 0;
        int endrow = matrix.length - 1;
        int endcoloum = matrix[0].length - 1;

        while (startrow <= endrow && startcoloum <= endcoloum) {
            // Top
            for (int j = startcoloum; j <= endcoloum; j++) {
                System.out.print(matrix[startrow][j] + " ");

            }

            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcoloum] + " ");
            }

            // bottom
            for (int j = endcoloum - 1; j >= startrow; j--) {

                System.out.print(matrix[endrow][j] + " ");
            }

            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {

                System.out.print(matrix[i][startcoloum] + " ");

            }
            startrow++;
            startcoloum++;
            endrow--;
            endcoloum--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printmatrix(matrix);
    }
}
