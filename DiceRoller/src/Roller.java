import java.util.Scanner;
public class Roller {

	
	public static int generateRandomDieRoll(int sides,int min) {
	    // Static method to return an randomly generated integer 
		int roll = (int)Math.floor(Math.random()*(sides-min+1)+min);		
	    return roll;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		boolean cont = true;
		int count = 1;
		
		do {
			
			System.out.println("How many sides should each die have?");
			// Setting the minimum number of sides needed in order to use as a parameter for the method
			int sides = scnr.nextInt();
			final int min = 1;
			
			System.out.println("Roll #" + count + ":");
			
			System.out.println(generateRandomDieRoll(sides,min));
			System.out.println(generateRandomDieRoll(sides,min));
			count += 1;
			
			System.out.println("Would you like to continue? y/n");
			String keepGoing = scnr.next();
			
			if (!keepGoing.equalsIgnoreCase("y")){
				cont = false;
			}

		} while (cont);
		
		scnr.close();
		
	
		
	}

}
