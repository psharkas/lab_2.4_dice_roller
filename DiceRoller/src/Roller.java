import java.util.Scanner;
public class Roller {

	
	public static int generateRandomDieRoll(int sides,int min) {
	    int roll = (int)Math.floor(Math.random()*(sides-min+1)+min);		
	    return roll;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("How many sides should each die have?");
		
		int sides = scnr.nextInt();
		final int min = 1;
		
		System.out.println("Roll #: ");
		
		System.out.println(generateRandomDieRoll(sides,min));
		System.out.println(generateRandomDieRoll(sides,min));

		
	}

}
