import java.util.Scanner;

public class MoocMethodWork {

	// Exercises 12 and 13 - Methods
	// Methods are called within below the outermost brackets
	// but outside of the main method

	// Creating a method called greet

	public static void main(String[] args) {

		
	//Exercises 37 and 38	
		
		System.out.println("How many? ");
		printText();

	}

	public static void printText() {
		Scanner newScanner = new Scanner(System.in);
		int i = 1;
		int howMany = Integer.parseInt(newScanner.nextLine());
		while (i <= howMany) {
			System.out.println("In the beginning there were the swamp, the hoe and Java.");
			i++;
		}

	}
}
