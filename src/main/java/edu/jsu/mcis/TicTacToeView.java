package edu.jsu.mcis;
import edu.jsu.mcis.*;
public class TicTacToeView{

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
		
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
		System.out.print("\n\n");
                System.out.print("  ");
                for(int col = 0; col < model.getWidth(); col++) {
                    System.out.print(col);
                }
                    System.out.print("\n\n");
                    for(int row = 0; row < model.getWidth(); row++) {
                        System.out.print(row + " ");
                        for(int col = 0; col < model.getWidth(); col ++) {
                            if(!model.isSquareMarked(row, col)) {
                                System.out.print(TicTacToeModel.Mark.EMPTY);
                            
                            }
                            else {
                                System.out.print(model.getMark(row, col));
                            }
                        }
                            System.out.print("\n");
                        }
                    System.out.print("\n\n");
                    }
                    
	public TicTacToeModel getModel() {
		return model;
	}
	public void setModel(TicTacToeModel model) {
		this.model = model;
	}
    

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
		if(model.isXTurn()) {
			System.out.println("X. Enter the row and column numbers, seperated by a space: ");
		} else {
			System.out.println("O. Enter the row and column numbers, seperated by a space: ");
		}

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
		System.out.println("The input is invalid");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}