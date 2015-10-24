import java.util.Scanner;

public class moocPartTwoExercises {
	public static void main(String[] args) {

		// Exercise 25

		/*
		 * Scanner newScanner = new Scanner(System.in);
		 * 
		 * int sum = 0; int read;
		 * 
		 * System.out.println("Enter a number: "); sum =
		 * Integer.parseInt(newScanner.nextLine());
		 * 
		 * System.out.println("Enter a number: "); sum = sum +
		 * Integer.parseInt(newScanner.nextLine());
		 * 
		 * System.out.println("Enter a number: "); sum = sum +
		 * Integer.parseInt(newScanner.nextLine());
		 * 
		 * System.out.println("Sum: " + sum);
		 */

		// Exercise 26
		/*
		 * Scanner newScanner = new Scanner(System.in); int sum = 0;
		 * 
		 * while(true){ int read = Integer.parseInt(newScanner.nextLine());
		 * if(read == 0) { break; }else { sum = sum + read; System.out.println(
		 * "The sum is: " + sum); } } System.out.println("The final sum is: " +
		 * sum);
		 */

		// Exercise 27

		int intttt = 1;
		while (intttt <= 100) {
			System.out.println(intttt);
			intttt++;
		}

		// Exercise 28

		int inttttt = 100;
		while (inttttt >= 1) {
			System.out.println(inttttt);
			inttttt--;
		}

		// Exercise 29
		int inttt = 2;
		while (inttt <= 100) {
			System.out.println(inttt);
			inttt += 2;
		}

		// Exercise 30
		/*
		 * Scanner newScannerr = new Scanner(System.in); int intyint = 1;
		 * System.out.println("Up to what number? "); int upTo =
		 * Integer.parseInt(newScannerr.nextLine());
		 * 
		 * while (intyint <= upTo){ System.out.println(intyint); intyint++; }
		 * 
		 */

		// Exercise 31

		/*
		 * Scanner newScanner = new Scanner(System.in); System.out.println(
		 * "First: "); int intyint = Integer.parseInt(newScanner.nextLine());
		 * 
		 * System.out.println("Second: "); int intuint =
		 * Integer.parseInt(newScanner.nextLine());
		 * 
		 * while(intyint <= intuint){ System.out.println(intyint); intyint++; }
		 */

		// Exercise 32

		/*
		 * Scanner newScanner = new Scanner(System.in);
		 * 
		 * System.out.println("Enter a number: "); int takeInt =
		 * Integer.parseInt(newScanner.nextLine()); int i = 1; int getSum = 0;
		 * 
		 * while( i <= takeInt){ getSum = getSum + i; i++;
		 * 
		 * 
		 * } System.out.println(getSum);
		 */

		// Exercise 33

		/*
		 * Scanner newScanner = new Scanner(System.in);
		 * 
		 * 
		 * int firstVar, secondVar; int sumOf = 0;
		 * 
		 * 
		 * System.out.println("Enter a number: "); firstVar =
		 * Integer.parseInt(newScanner.nextLine());
		 * 
		 * System.out.println("Enter another number: "); secondVar =
		 * Integer.parseInt(newScanner.nextLine());
		 * 
		 * 
		 * while(firstVar <= secondVar) { sumOf = sumOf + firstVar; firstVar++;
		 * }
		 * 
		 * 
		 * System.out.println("The sum is: " + sumOf);
		 */

		// Exercise 34

		/*
		 * Scanner newScanner = new Scanner(System.in);
		 * 
		 * System.out.println("Type a number: "); int takeInt =
		 * Integer.parseInt(newScanner.nextLine());
		 * 
		 * int i = 1; int sumInt = 1 ; while (i <= takeInt) { i++;
		 * 
		 * sumInt = sumInt * i;
		 * 
		 * 
		 * if (i == takeInt) { System.out.println(sumInt); break; }
		 * 
		 * }
		 */

		// Exercise 35

		/*
		 * Scanner newScanner = new Scanner(System.in);
		 * 
		 * System.out.println("Type a number: "); int newInt =
		 * Integer.parseInt(newScanner.nextLine());
		 * 
		 * int i = 0; int value = 0;
		 * 
		 * while (i <= newInt) { value = (int) Math.pow(2, i) + value; i++; }
		 * 
		 * System.out.println("The result is: " + value);
		 * 
		 * 
		 * 
		 * 
		 * Scanner newScanner2 = new Scanner(System.in);
		 * 
		 * System.out.println("Type a number: "); int newInt2 =
		 * Integer.parseInt(newScanner2.nextLine());
		 * 
		 * int i2 = 0; int value2 = 0;
		 * 
		 * while (i2 <= newInt2) { value2 = (int)Math.pow(2, i2) + value2; i2++;
		 * if(i2 == newInt2){
		 * 
		 * System.out.println("The result is: " + value2); break;
		 */
		/*
		 * }
		 * 
		 * }
		 */

		// Exercise 36

	/*	Scanner newScanner = new Scanner(System.in);

		int typeNumbers = 0;
		int typeSum = 0;
		int amountNum = 0;
		int returnRight = 0;
		double averageNum;
		int evenNum = 0;
		int oddNum = 0;

		System.out.println("Type numbers: ");
		while (typeNumbers != -1) {

			typeNumbers = Integer.parseInt(newScanner.nextLine());
			if (typeNumbers % 2 == 0) {
				evenNum++;
			} else {
				oddNum++;
			}
			amountNum++;
			typeSum = typeSum + typeNumbers;

			if (typeNumbers == -1) {
				typeSum++;
				amountNum--;
				oddNum--;
				averageNum = (double) typeSum / amountNum;
				System.out.println("Thank you and see you later!");
				System.out.println("The sum is " + typeSum);
				System.out.println("How many numbers: " + amountNum);
				System.out.println("Average: " + averageNum);
				System.out.println("Even Numbers: " + evenNum);
				System.out.println("Odd Numbers:" + oddNum);
				break;
			}
		}*/
		
		
		
		
		
		
		
		
		
		

	}
}
