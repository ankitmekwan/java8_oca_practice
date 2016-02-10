import java.util.Scanner;

public class Exercise2 {

	public static void main (String [] args) {

    Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);


   		System.out.print("Enter first word: ");
		String firstWord = scanner.nextLine();

		System.out.print("Enter second word: ");
		String secondWord = scanner2.nextLine();

		buildText(firstWord,secondWord);

	}

	private static void buildText (String firstText, String secondText) {
		firstText = firstText.replaceAll(" ", "");
		secondText = secondText.replaceAll(" ", "");
		StringBuilder sb = new StringBuilder(firstText);
		sb.append(secondText);
		sb.reverse();
		System.out.println(sb);
		for(int i=0;i<sb.length();i=i+2) {

			sb.insert(i,'*');
			sb.deleteCharAt(i+1);
		}
		System.out.println(sb);
	}
}
