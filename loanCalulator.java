import java.util.*;
public class loanCalulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner
		 Scanner input = new Scanner(System.in);
		
		 // Enter annual interest rate in percentage
		 System.out.print("Enter annual interest rate: ");
		 double annualInterestRate = input.nextDouble();
		
		 // Get monthly interest rate
		 double monthlyInterestRate = annualInterestRate / 1200;
		
		 // Enter number of years
		 System.out.print( "Enter number of years: ");
		 int numberOfYears = input.nextInt();
		
		 // Enter loan amount
		 System.out.print("Enter loan amount £: ");
		 double loanAmount = input.nextDouble();
		
		 // Calculate payment
		 double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		 double totalPayment = monthlyPayment * numberOfYears * 12;
		 
		  // Display results
		  System.out.println("The monthly payment is £" + (int)(monthlyPayment * 100) / 100.0);
		  System.out.println("The total payment is £" +  (int)(totalPayment * 100) / 100.0);

	}

}
