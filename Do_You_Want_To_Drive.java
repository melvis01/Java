import java.util.*;
public class Do_You_Want_To_Drive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		Scanner input = new Scanner(System.in);
		
				 
		
		System.out.print("What's the journey Distance:");
		
		int distance;
		
		distance = input.nextInt();
		
		 
		
		System.out.print("How many gallons were used?");
		
		int gallons;
		
		gallons = input.nextInt();
		 
		
		int mpg;
		
		mpg = distance / gallons;
		
		 
		
		System.out.println(" The Miles-Per-Gallon used in this trip are " + mpg );
		
		 
	
		}
		
		}

