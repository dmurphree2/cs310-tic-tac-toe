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
