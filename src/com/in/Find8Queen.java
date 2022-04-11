package com.in;

/**
 * 2022/4/11 17:37
 *
 * @author Yin Haozhen, yhz8074@qq.com
 */
public class Find8Queen {
    public static void main(String[] args) {
        int[] board = new int[8];
        solution(board, 0);

        for (int col = 0; col < 8; col++) {
            for (int row = 0; row < board[col]; row++) {
                System.out.print("\t");
            }
            System.out.println("*");
        }
    }
    static boolean solution(int[] board, int column) {
        if (column == 8) {
            return true;
        }

        for (int row = 0; row < 8; row++) {
            boolean valid = isValid(board, row, column);
            if (valid) {
                board[column] = row;
                if (solution(board, column + 1)) {
                    return true;
                } else {
                    board[column] = 0;
                }
            }
        }

        return false;
    }

    private static boolean isValid(int[] board, int tarRow, int tarCol) {
        for (int col = 0; col < tarCol; col++) {
            // row
            if (board[col] == tarRow) {
                return false;
            }
            // diagonal
            if (board[col] - col == tarRow - tarCol) {
                return false;
            }
        }

        return true;
    }
}
