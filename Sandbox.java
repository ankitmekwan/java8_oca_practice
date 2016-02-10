import java.util.Scanner;

public class Sandbox {

  public static void main (String[] args)
  {
    // create a scanner so we can read the command-line input
    Scanner scanner = new Scanner(System.in);

    //  prompt for the user's name
    System.out.print("Enter your text: ");

    // Convert to char array.
    char[] shift = scanner.nextLine().toCharArray();

    // Loop over characters.
    for (int i = 0; i < shift.length; i++) {

      // Shift letter, moving back or forward 26 places if needed.
      char letter = shift[i];
      letter = (char) (letter + shift[i]);
      if (letter > 'z') {
        letter = (char) (letter + 2);
      } else if (letter < 'a') {
        letter = (char) (letter - 2);
      }
      shift[i] = letter;
    }

    System.out.println(shift);
  }
}
