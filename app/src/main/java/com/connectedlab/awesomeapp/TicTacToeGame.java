package com.connectedlab.awesomeapp;

public class TicTacToeGame {

    private char[][] mBoard;

    public TicTacToeGame(char[][] board) {
        this.mBoard = board;
    }

    public Character getPlayerTurn() {
        int xCount = 0;
        int oCount = 0;

        for (int i = 0; i < mBoard.length; i++) {
            for (int j = 0; j < mBoard.length; j++) {
                if (mBoard[i][j] == 'O') {
                    oCount++;
                } else if (mBoard[i][j] == 'X') {
                    xCount++;
                }
            }
        }
        if (xCount + oCount == mBoard.length * mBoard.length) {
            return null;
        }
        return oCount - xCount == 0 ? 'O' : 'X';
    }

    public String getWinner() {
        if (mBoard[0][0] == mBoard[1][1] && mBoard[2][2] == mBoard[1][1] && mBoard[0][0] != ' ') {
            return String.valueOf(mBoard[0][0]);
        } else if (mBoard[2][0] == mBoard[1][1] && mBoard[0][2] == mBoard[1][1] && mBoard[2][0] != ' ') {
            return String.valueOf(mBoard[2][0]);
        }
        for (int i = 0; i < mBoard.length; i++) {
            if (mBoard[i][0] == mBoard[i][1] && mBoard[i][0] == mBoard[i][2] && mBoard[i][0] != ' ') {
                return String.valueOf(mBoard[i][0]);
            } else if (mBoard[0][i] == mBoard[1][i] && mBoard[0][i] == mBoard[2][i] && mBoard[0][i] != ' ') {
                return String.valueOf(mBoard[0][i]);
            }
        }

        if (getPlayerTurn() == null) {
            return "Cat's Game";
        }
        else {
            return null;
        }
    }
}
