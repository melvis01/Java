import java.util.*;

public class Hex2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner input = new Scanner(System.in);
      System.out.print("Please Enter a hex number: ");
      String hex = input.nextLine();
      
      System.out.println("the decimal value for hex is " + hex + " is " + hexToDecimal(hex.toUpperCase()));
	}

	public static int hexToDecimal(String hex) {
		// TODO Auto-generated method stub
		int decimalValue = 0;
		for(int i = 0; i < hex.length(); i++) {
			
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			
			
		}
		return decimalValue;
	}

	public static int hexCharToDecimal(char ch){
		// TODO Auto-generated method stub
		
		if(ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		
		else
			
			return ch - '0';		
				
		
	}

}
