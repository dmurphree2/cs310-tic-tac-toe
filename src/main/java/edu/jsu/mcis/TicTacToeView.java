/*package edu.jsu.mcis;
import edu.jsu.mcis.*;
public class TicTacToeView{

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	/*
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
		
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
		/*System.out.print("\n\n");
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
	/*	if(model.isXTurn()) {
			System.out.println("X. Enter the row and column numbers, seperated by a space: ");
		} else {
			System.out.println("O. Enter the row and column numbers, seperated by a space: ");
		}

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
	/*	System.out.println("The input is invalid");

    }

    public void showResult(String r) {

        /* Display final winner */

 /*       System.out.println(r + "!");

    }
	
}*/

package edu.jsu.mcis;
import edu.jsu.mcis.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeView extends JPanel implements ActionListener {
    
    TicTacToeModel model;

    private JButton[][] squares;
    private JPanel squaresPanel;
    private JLabel resultLabel;

    public TicTacToeView(TicTacToeModel model) {

        this.model = model;

        int width = model.getWidth();

        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        squares = new JButton[width][width];
        squaresPanel = new JPanel(new GridLayout(width,width));
        resultLabel = new JLabel();
        resultLabel.setName("ResultLabel");
        
        for (int row = 0; row < width; row++){
            
            for (int col = 0; col < width; col++){
                
                squares[row][col] = new JButton(); 
                squares[row][col].addActionListener(this);
                squares[row][col].setName("Square" + row + col);
                squares[row][col].setPreferredSize(new Dimension(64,64));
                squaresPanel.add(squares[row][col]);
                
            }
            
        }

        this.add(squaresPanel);
        this.add(resultLabel);
        
        resultLabel.setText("Welcome to Tic-Tac-Toe!");

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        /* Handle button clicks.  Extract the row and col values from the name
           of the button that was clicked, then make the mark in the grid using
           the Model's "makeMark()" method.  Finally, use the "updateSquares()"
           method to refresh the View.  If the game is over, show the result
           (from the Model's "getResult()" method) in the result label. */
        
        String name = ((JButton) event.getSource()).getName(); // Get button name
        
        // INSERT YOUR CODE HERE
		int row;
		int col;
		row = Character.getNumericValue(name.charAt(6));
		col = Character.getNumericValue(name.charAt(7));
		
		model.makeMark(row, col);
		updateSquares();
		showResult(" ");
		
		if(model.isGameover()) {
			showResult(model.getResult().toString());
			for(int i = 0; i < model.getWidth(); i++) {
				for(int j = 0; j < model.getWidth(); j++) {
					squares[i][j].setEnabled(false);
				}
			}
		}

    }
        
    public void updateSquares() {

        /* Loop through all View buttons and (re)set the text of each button
           to reflect the grid contents (use the Model's "getMark()" method). */
		for(int row = 0; row < model.getWidth(); row++) {
			for(int col = 0; col < model.getWidth(); col++) {
				squares[row][col].setText(model.getMark(row, col).toString());
			}
		}
    }
        
    public void showResult(String message) {
        resultLabel.setText(message);
    }

}