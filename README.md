# cs310-tic-tac-toe

This is an assignment I did over a year ago for CS310. The program is run via the command
line or running it in java, creating a tic-tac-toe board and prompting the player to play with an AI.
The folders labled "test" were created by the instructor of the class, and will not be
covered in this readme. Not all code belongs to me, as the instructor made an incomplete
set of code for the students to complete.


TicTacToe.java

private static final int DEFAULT_WIDTH = 3 and int width = DEFAULT_WIDTH sets the board's
parameters to the standard 3x3 square board.

The player can create a custom board at the command line as an argument.

The TicTacToeModel, View, and Controller variables call the other classes associated with
the TicTacToe program.

The main loop of the program is constantly checking to see if the game has ended. While the
game is still going on, the TicTacToe board remains visible and the player can still make
actions during their turn.

Once the game has ended in the favor of the player or the opponent, the game will end
and the results of the game will print on the screen.


TicTacToeController.java

This program allows the player to make moves within the permitted ranges. If the player
tries to make a move outside the designated squares, or on a square already inhabited by
another X or O mark, the game will notify the player they've made an invalid input.
Valid inputs will be put on the board and control will be given to the opponent.

import java.util.Scanner, private Scanner keyboard, and keyboard = new Scanner(System.in)
allows the player to input text when prompted, such as the what position they want to 
place their mark. 

public void controlModel() houses the code prompting the player to make their move
and checks to see if the move the player has chosen is allowed within the rules of the
game, notifying the player if the move isn't allowed and giving control back to the player
until they make a valid move.


TicTacToeModel.java establishes the structure and requirements for a win, loss, or tie
in a game of Tic Tac Toe. This includes the appearance of the empty spaces, X's and O's as the player and opponent marks, checking if the game has ended with a win, loss, or tie, and notifies the player if they have won, lost, or tied.

private enum Mark establishes X, O, and - as the player marks and empty space for the board.

public enum Result shows the player if X or O has won, if the match ended with a Tie, or if the match is ongoing it will simply say "None."

public TicTacToeModel(int width) sets up the width of the board and starts as X's turn.

for(int i=0; i < width; i++) block sets all the squares to empty. public boolean makeMark(int row, int col) block allows the empty squares to be filled with an X or O if it's allowed(not currently filled or out of bounds.)

private boolean isValidSquare(int row, int col) block establishes what qualifies as a valid square.

public boolean isSquareMarked(int row, int col) block checks if there is still squares which are marked.

public Mark getMark(int row, int col) block ensures the marks and empty spaces remain their intended values between turns.

public Result getResult() block returns the results of the match, whether it be a victory for X or O, a tie, or if the game is still ongoing.

private boolean isMarkWin(Mark mark) block checks all the squares to see if there's a complete line of X's or O's, declaring the mark in a complete line the winner.

private boolean isTie() block inspects the board when no other actions can be made, and if there's no winner it will declare the game a tie.

public boolean isGameover() is declared when the game ends in a win, loss, or tie.

public boolean isXTurn() is the getter method for xTurn

public int getWidth() is the getter method of width


TicTacToeView.java displays the board and all text needed for this game. This includes notifying the player of who's turn it is, whether a move is not allowed, telling the player how to place a mark on the board, and who the winner is.

public void viewModel() block prints the board onto the consle, to the specifications of the player's initial parameters with all squares empty.

public void showNextMovePrompt() block asks the player for their next move.

public void showInputError() block notifies the player if an invalid move has been made.

public void showResult(String r) block prints the name of the winner, along with an exclamation point at the end for emphasis.
