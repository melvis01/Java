import java.util.*;
public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int)(Math.random()* 101);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Guess a number between 0 and 100");
		
		int guess = -1;
		while (guess != number) {
			//prompt the user to enter a number
			System.out.println("\nEnter your guess: ");
			guess = input.nextInt();
			
			if (guess == number)
			System.out.println("Yes, the number is " + number);	
			else if (guess > number)
				
			System.out.println("Your guess is too high");
			else
			System.out.println("Your guess is too low");
			
			
		} // End of loop
		

	}

}
