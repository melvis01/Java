public class JavaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Create and initialise your variables	
	int lives = 3;
	boolean isGamover = (lives < 1);
	
	//Print Results
	
	System.out.println(isGamover);
	if (isGamover)
		System.out.println("Game Over");
	else
		System.out.println("You are still alive");

	}

}