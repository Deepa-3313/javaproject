package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
	public static List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        char[][] board = new char[n][n];
        
        for (char[] row : board) Arrays.fill(row, '.');

        backtrack(0, board, results, n);
        return results;
    }

    private static void backtrack(int row, char[][] board, List<List<String>> results, int n) {
        if (row == n) {
            results.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                backtrack(row + 1, board, results, n);
                board[row][col] = '.'; 
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col, int n) {
       
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    private static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);

        int count = 1;
        for (List<String> sol : solutions) {
            System.out.println("Solution " + count++ + ":");
            for (String row : sol) {
                System.out.println(row);
            }
            System.out.println();
        }

		

	}

}
