import java.util.Scanner;

public class Exercise1 {
	
	public static void main (String [] args) {
		// create a scanner so we can read the command-line input
    		Scanner scanner = new Scanner(System.in);

		

    		//  prompt for the user's name
   		 System.out.print("Enter your complete name: ");

		String name = scanner.nextLine();
		determineNameLength(name);
	}	

	private static void determineNameLength (String name) {
		String [] nameSplit = name.split(" ");
		String loweredName = name.toLowerCase();
		
		if(loweredName.length() > 20) {
			System.out.println("You have such a long name, "+ loweredName +"("+(nameSplit.length-1)+")");		
		}
		else {
			String upperName = loweredName.toUpperCase();
			System.out.println(upperName+" - "+loweredName.length());			
			}
	}
}
