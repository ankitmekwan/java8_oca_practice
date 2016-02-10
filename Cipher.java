import java.util.Scanner;

public class Cipher {
  public static void main (String[] args)
  {
    // create a scanner so we can read the command-line input
    Scanner offsetScanner= new Scanner(System.in);

    System.out.print("Enter your offset number: ");
    String offsetInput = offsetScanner.nextLine();
    Integer offset = Integer.parseInt(offsetInput);

    // create a scanner so we can read the command-line input
    Scanner textScanner= new Scanner(System.in);

    System.out.print("Enter your offset number: ");
    String textInput = textScanner.nextLine();
  }


  public String doEncrypt(Integer offset, String textInput) {
    
  }
}
