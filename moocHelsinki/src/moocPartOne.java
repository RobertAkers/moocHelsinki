import java.util.Scanner;

public class moocPartOne {
	public static void main(String[] args){
		
		
		
		System.out.println("Hello world!"); 
		//ln inserts a line break.
		
		
		System.out.print("Hello "); System.out.print("world");
		System.out.println("!");
		//semicolons separate different commands. Notice there is no
		//"ln" so no line break is inserted after "Hello " or "world"
		
		
		System.out.println("Hello");
		//"Hello" is a parameter being passed into the 
		//System.out.print command.
		
		
		//You can print special characters in printed text, the most 
		// important is \n (which inserts a line break).
		
		System.out.println("First\nSecond\nThird");
		
		//The int variable type cannot hold decimals, but the decimal
		//type can hold integers, because whole numbers are also decimal numbers.
		
		double decimalNumber = 0.42;
		System.out.println(decimalNumber);
		
		decimalNumber = 1;
		System.out.println(decimalNumber);
		
		
		//Order of operations, this equals 23.
		int calcWithParens = (1 + 1) + 3 * (2 + 5);
		System.out.println(calcWithParens);
		
		//Order of operations, this equals 13. Example 2.
		
		
		int mathWithParens = 1 + 1;
		mathWithParens = mathWithParens + 3 * 2;
		mathWithParens = mathWithParens + 5;
		System.out.println(mathWithParens);
		
		
		//Calculating the division and remained of whole numbers.
		//If you use two int variable types, then the result will come back as a whole number.
		// Example, 3/2 = 1
		
		int first = 3;
		int second = 2;
		System.out.println(first / second);
		
		//However, If either (or both) are a double type variable, then the result will have a decimal.
		//Example, 3/2.0 = 1.5
		
		int firstInt = 3;
		double firstDecimal = 2.0;
		System.out.println(firstInt / firstDecimal);
		
		
		//If  needed, you can transform an int variable type into a variable with the cast operation.
		
		int wholeFirst = 3;
		int wholeSecond = 2;
		
		double result1 = (double)wholeFirst/wholeSecond; 
		System.out.println(result1); //result is 1.5
		
		
		double result2 = wholeFirst / (double)wholeSecond;
		System.out.println(result2);
		
		
		//Casting does not come first in the order of operations.
		
		double result3 = (double)(wholeFirst / wholeSecond); 
		
		System.out.println(result3);
		
		//The operation wholeFirst / wholeSecond is done first, resulting in the answer 1.
		//then the answer (1) is casted.
		
	
		
		//You can also transform an int by multiplying it by a decimal number.
		//result 1.5
		int dividend = 3;
		int divisor = 2;
		
		double quotient = 1.0 * dividend / divisor;
		System.out.println(quotient);
		
		
		//but be sure to get the order of operations right
		//result 1.0
		
		int dividend2 = 3;
		int divisor2 = 2;
		
		double quotient2 = dividend2 / divisor2 * 1.0;
		System.out.println(quotient2);
		
		
		
		//When you concatenate a string with an int, something interesting happens.
		
		//Concatenating strings and int types follows the order of operations. 
		
		System.out.println("This number: " + 2 + 2);

		//While you  may think this would print "This number: 4"
		//it actually prints, "This number: 22"
		
		//The correct way to do this would be:
		
		System.out.println("This number: " + (2 + 2));
		//This will print, "This number: 4"
		
		
		//parseint is a lot like getInt. Look it up on stackoverflow for more information.
		
	/*	Scanner newScanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int inputNumb = Integer.parseInt(newScanner.nextLine());
		
		System.out.println("You entered: " + inputNumb);
		*/
	
		//Section 8 - Conditional Statements
		
		int number = 11;
		
		if(number > 10)
		{
			System.out.println("The number was greater than 10.");
		}

		//A block (the code between the curly braces after the conditional statement) 
		// can contain any code, including other if statements. 
		
		int x = 45;
		int conNumber = 55;
		
		if (number > 0)
		{
			System.out.println("The number is positive!");
			
			if (conNumber > x)
			{
				System.out.println("and greater than the value of the variable x");
				System.out.println("after all, the value of variable x is " + x);
			}
		}
		
		int firstt = 1;
		int secondd = 3;
		
		boolean isGreater = firstt > secondd;
		
		int firsttTwo = 1;
		int seconddTwo = 3;
		
		boolean isLesser = firsttTwo < seconddTwo;
		
		if(isLesser)
		{
			System.out.println(firsttTwo + " is less than " + seconddTwo);
		}
		
		int nomNoms = 4;
		
		if (nomNoms > 5)
		{
			System.out.println("Your number is greater than 5!");
		}else
		{
			System.out.println("Your number is equal to or less than 5");
		}
		
		
	//Comparing Strings - use the .equals command. 
		
		String horse = "horse";
				
				
			if(horse.equals("Puma"))
			{
				System.out.println("The text says Puma.");
			}else if (horse.equals("horse"))
			{
				System.out.println("The text says horse.");
			}else
			{
				System.out.println("The text is unreadable.");
			}
					
			
			//Conditional statements can be made more complicated
			//with logical operations.
			// && means both conditions must be true
			// || means only one condition must be true to achieve a true value
			// !condition is true if the condition is false. 
			
			// Example &&
			
			System.out.println("Is the number between 5-10?");
			
			int numNums = 7;
			
			if (numNums > 4 && numNums < 11)
			{
				System.out.println("Yes! :)");
				
			}else 
			{
				System.out.println("Nope :(");
			}
		
		//Example ||
		
		System.out.println("Is the number less than zero or greater than 100?");
		int intInts = 145;
		
		if(intInts < 0 || intInts > 100)
		{
			System.out.println("Yes! :)");
		}else
			System.out.println("No :(");
		
		//Example !condition
		
		System.out.println("Is the string equal to 'milk'?");
		
		String water = "Water";
		
		if(!(water.equals("milk")))
		{
			System.out.println("No!");
		}else 
		{
			System.out.println("Yes!");
		}
				
		//It is possible to use multiple logical operators. 
	
		
		int numberThree = 150;
		
		if (numberThree > 0 && numberThree < 10  || numberThree > 100)
		{
			System.out.println("The number was in the 1-9 range or greater than 100");
		}else{
			System.out.println("The number was equal to or less han 0 or it was in the range of 10-99");
		
		}
	
			/*
			while(true)
			{
				System.out.println("I can program");
				
				System.out.println("Continue? ('no' to quit)? ");
				
				Scanner newScan = new Scanner(System.in);
				String command = newScan.nextLine();
				if (command.equals("no"))
				{
					break;
				}
			}
			System.out.println("Thank you and see you later!");*/
			
			
			
			//This program creates a calculator program that loops
		
		/*
			Scanner newNewScanner = new Scanner(System.in);
			System.out.println("Welcome to calculator");
			
			while(true){
				System.out.println("Enter a command (sum, difference, quit): ");
				String inputString = newNewScanner.nextLine();
					if(inputString.equals("quit")){
			
						break;
			}
		
					
					System.out.println("Enter the numbers: ");
					
			int inputFirst = Integer.parseInt(newNewScanner.nextLine());
			int inputSecond = Integer.parseInt(newNewScanner.nextLine());
			
			if(inputString.equals("sum")){
			int outputSum = inputFirst + inputSecond;
			System.out.println("The sum of the numbers is " + outputSum);
				
				
			}else if(inputString.equals("difference"))
			{
				
				int outputDiff = inputFirst - inputSecond;
				System.out.println("The difference of the numbers is " + outputDiff);
			}else{
			
				System.out.println("Unknown command");
			}	
			
		}
			
			
			System.out.println("Thanks, bye!");
			*/
			
		
	}
}
		
		
		
	