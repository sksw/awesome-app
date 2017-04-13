package com.connectedlab.awesomeapp;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 RULES OF TICTACTOE

 Create a class that represents a game of tic tac toe
 constructor takes a 3x3 char array
 values are 'O', 'X', and ' ' (char)
 getPlayersTurn() returns "X" or "O" or null if game is over
 getWinner() returns "X" or "O" or "cat's game" (if game is tied) or null (if game is not complete)```

 */
public class TicTacToeGameTest {
    @Test
    public void getPlayerTurn_whenEmptyBoard_returnO() throws Exception {
        TicTacToeGame sut = new TicTacToeGame(new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        });
        assertThat(sut.getPlayerTurn(), is(equalTo('O')));
    }

    @Test
    public void getPlayerTurn_whenBoardHasO_returnX() throws Exception {
        TicTacToeGame sut = new TicTacToeGame(new char[][]{
                {' ', ' ', ' '},
                {' ', 'O', ' '},
                {' ', ' ', ' '},
        });
        assertThat(sut.getPlayerTurn(), is(equalTo('X')));
    }

    @Test
    public void getPlayerTurn_whenBoardIsFilled_returnNull() throws Exception {
        TicTacToeGame sut = new TicTacToeGame(new char[][]{
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'X', 'O', 'X'},
        });
        assertNull(sut.getPlayerTurn());
    }

    @Test
    public void getWinner_whenFirstRowX_returnX() throws Exception {
        TicTacToeGame sut = new TicTacToeGame(new char[][]{
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        });
        assertThat(sut.getWinner(), is(equalTo("X")));
    }

    @Test
    public void getWinner_whenFirstRowO_returnO() throws Exception {
        TicTacToeGame sut = new TicTacToeGame(new char[][]{
                {'O', 'O', 'O'},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        });
        assertThat(sut.getWinner(), is(equalTo("O")));
    }

    @Test
    public void getWinner_whenThirdRowO_returnO() throws Exception {
        TicTacToeGame sut = new TicTacToeGame(new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'O', 'O', 'O'},
        });
        assertThat(sut.getWinner(), is(equalTo("O")));
    }

    @Test
    public void getWinner_whenMiddleCol0_returnO() throws Exception {
        TicTacToeGame sut = new TicTacToeGame(new char[][]{
                {' ', 'O', ' '},
                {' ', 'O', ' '},
                {' ', 'O', ' '},
        });
        assertThat(sut.getWinner(), is(equalTo("O")));
    }

    @Test
    public void getWinner_whenThirdColX_returnX() throws Exception {
        TicTacToeGame sut = new TicTacToeGame(new char[][]{
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        });
        assertThat(sut.getWinner(), is(equalTo("X")));
    }

    @Test
    public void getWinner_whenDiagonalX_returnX() throws Exception {
        TicTacToeGame sut = new TicTacToeGame(new char[][]{
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        });
        assertThat(sut.getWinner(), is(equalTo("X")));
    }

    @Test
    public void getWinner_whenReverseDiagonalX_returnX() throws Exception {
        TicTacToeGame sut = new TicTacToeGame(new char[][]{
                {' ', ' ', 'X'},
                {' ', 'X', ' '},
                {'X', ' ', ' '},
        });
        assertThat(sut.getWinner(), is(equalTo("X")));
    }

    @Test
    public void getWinner_whenNoWinner_returnCatsGame() throws Exception {
        TicTacToeGame sut = new TicTacToeGame(new char[][]{
                {'O', 'X', 'X'},
                {'X', 'O', 'O'},
                {'O', 'O', 'X'},
        });
        assertThat(sut.getWinner(), is(equalTo("Cat's Game")));
    }

    @Test
    public void getWinner_whenGameNotFinished_returnNull() throws Exception {
        TicTacToeGame sut = new TicTacToeGame(new char[][]{
                {'O', 'X', 'X'},
                {'X', ' ', 'O'},
                {'O', 'O', 'X'},
        });
        assertNull(sut.getWinner());
    }
}