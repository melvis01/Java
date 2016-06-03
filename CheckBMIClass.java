
public class CheckBMIClass {

	public static void main(String[] args) {
		
		
			 BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);// create an object
			 System.out.println("The BMI for " + bmi1.getName() + " is " // invoke instance method
			 + bmi1.getBMI() + " " + bmi1.getStatus());
			
			 BMI bmi2 = new BMI("Susan King", 215, 70);// create an object
			 System.out.println("The BMI for " + bmi2.getName() + " is " // invoke instance method
			 + bmi2.getBMI() + " " + bmi2.getStatus());
		 }
			 }