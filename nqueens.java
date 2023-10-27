public class nqueens {
    public static boolean isSafe(char board,int row,int column){
        // vertical up
        for(int i=row-1,j=column;i<board.length;i--){

        }
        // diagonal right 
        for(int i=row-1.j=column+1;){
        // diagonal left
        for(int i=row-1,j=column-1;){
            
        }

    }

    public static void nqueens(char board[][], int row) {
        // base conndition
        if (row == board.length) {
            printar(board);
            return;
        }
        // traversing columnn wise
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, column)) {
                board[row][j] = 'q';
                nqueens(board, row + 1);
                board[row][j] = 'x';
            }
        }

    }

    public static void printar(char board[][]) {
        System.out.println("---------chess board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nqueens(board, 0);

    }

}
