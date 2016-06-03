import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class GuessingGame extends JFrame {
	private JTextField txtGuess; // User guess input
	private JLabel lblOutput;   // Displays the output
	private int theNumber;     //  Guess number
	private int triesLeft = 5;// Give the user 5 tries
	
	public void checkGuess(){ // method to check too high/ too low
		
		String guessText = txtGuess.getText();
		String message = "";
		try {
			
		

			// check the guess for too high/too low
			int guess = Integer.parseInt(guessText);
			
			//decrease count value
			
			triesLeft--;

			// too high
			if(guess > theNumber)
			{
				message = guess + " was too high.";
				message += "You have " + triesLeft + " tries Left."; 
				lblOutput.setText(message);
			}
			// too low
			else if (guess > theNumber)
			{
				message = guess + " was too low.";
				message += "You have " + triesLeft + " tries Left.";
				lblOutput.setText(message);

			}
			else // guessed correctly
			{
				message = guess + " is right! You Win! Lets play again!";
				lblOutput.setText(message);
				newGame();
			}
			
			if (triesLeft <= 0){
				javax.swing.JOptionPane.showConfirmDialog(null,
						"Sorry, You've ran out of tries. The number was "
						+ theNumber + ". Play again!");
				newGame();
			}
		
		}
		
		catch(Exception e){
			
			lblOutput.setText("Enter a whole number between 1 and 100.");
		}
		
		finally{
			txtGuess.requestFocus();
			txtGuess.selectAll();
		}
	}
	
	public void newGame(){ // create a new random number 1 to 100
		theNumber = (int)(Math.random()* 100 + 1);
		triesLeft = 5;
	}	
	
	public GuessingGame() {
		setTitle("Melvis Hi-Lo Guessing Game");
		getContentPane().setBackground(new Color(204, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblMelvisHiloGuessing = new JLabel("Melvis Hi-Lo Guessing Game");
		lblMelvisHiloGuessing.setBounds(40, 34, 434, 17);
		lblMelvisHiloGuessing.setFont(new Font("Consolas", Font.BOLD, 16));
		lblMelvisHiloGuessing.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblMelvisHiloGuessing);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 255));
		panel.setBounds(111, 88, 342, 70);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		txtGuess = new JTextField();
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		txtGuess.setHorizontalAlignment(SwingConstants.CENTER);
		txtGuess.setBounds(276, 35, 56, 20);
		panel.add(txtGuess);
		txtGuess.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Guess a number between 1 and 100:");
		lblNewLabel.setBackground(new Color(51, 255, 255));
		lblNewLabel.setBounds(10, 36, 264, 19);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 15));
		
		JButton btnGuess = new JButton("Guess");
		btnGuess.setBackground(new Color(153, 255, 255));
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setBounds(236, 205, 88, 27);
		getContentPane().add(btnGuess);
		btnGuess.setFont(new Font("Consolas", Font.PLAIN, 15));
		
		lblOutput = new JLabel("Enter a number above. You have 5 Tries..");
		lblOutput.setFont(new Font("Consolas", Font.PLAIN, 15));
		lblOutput.setBounds(104, 266, 349, 23);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(630, 430));
		theGame.setVisible(true);

	}
}
