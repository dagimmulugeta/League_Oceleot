import java.util.Random;

//1. Run the program.  What number appears?

//2. Make the number random.

//3. Limit the random number between 0 and 100

//4. Limit the random number between 25 and 75.  (highest value - lowest value) + lowest value

//5. Limit the random number between -222 and 88

public class IntroToRandom {
	public static void main(String[] args) {
		//Create an object of the Random class here
		Random dagi = new Random();
		
		int i = dagi.nextInt(52)+25;
		
		System.out.println(i);
	}
}
