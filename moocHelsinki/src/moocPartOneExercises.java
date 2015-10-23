import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import javax.annotation.processing.SupportedSourceVersion;

public class moocPartOneExercises {
	public static void main(String[] arhs){
		
		
		//Create a program that prints your name to the screen
		
		System.out.println("Rob Akers");
		
		
		//Create a program that prints two things and a line break
		
		System.out.println("Hello world!");
		System.out.println("(And all the people of the world)");
		
		
		// Create a program that prints a spruce tree
		 
		System.out.println("    *");
		System.out.println("   ***");
		System.out.println("  *****");
		System.out.println(" *******");
		System.out.println("*********");
		System.out.println("    *");
		
		
		
		//Exercise 4
		
		int Chickens = 9000;
		double Bacon = 0.1;
		String Tractor = "Zetor";
		
		System.out.println("Chickens:");
		System.out.println(Chickens);
		System.out.println("Bacon (kg):");
		System.out.println(Bacon);
		System.out.println("A tractor:");
		System.out.println(Tractor);
		System.out.println();
		System.out.println("In a nutshell:\n" + Chickens + "\n"  + Bacon + "\n" + Tractor);
		
		
		//Exercise 5
		
		int secondsInAnHour = 60 * 60;
		
		int timeInADay = secondsInAnHour * 24;
		
		int secondsInAYear = timeInADay * 365;
		
		System.out.println("There are " + secondsInAYear + " seconds in a year");

		
		//Exercise 6
		
		int intOne = 5;
		int intTwo = 4;
		int intSum = intOne + intTwo;
		
		
		System.out.print(intOne + " + ");
		System.out.print(intTwo + " ");
		System.out.println("= " + intSum);
		
		
		//Exercise 7
		int multiOne = 2;
		int multiTwo = 8;
		int multiEquals = multiOne * multiTwo;
		
		System.out.print(multiOne + " * ");
		System.out.print(multiTwo);
		System.out.println( " = " + multiEquals);
		
		
		/*//Exercise 8
		
		Scanner newScanner = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		int firstScan = Integer.parseInt(newScanner.nextLine());
		
		System.out.println("Type another number: ");
		int secondScan = Integer.parseInt(newScanner.nextLine());
		
		System.out.println("Sum of the numbers: " + firstScan + secondScan);*/
		
		
		//Exercise 9
		/*
		Scanner scannerQuotient = new Scanner(System.in);
		System.out.println("Type a number: ");
		int scanQuotient = Integer.parseInt(scannerQuotient.nextLine());
		
		System.out.println("Type another number: ");
		int scanQuotient2 = Integer.parseInt(scannerQuotient.nextLine());
		
		System.out.println("Division: " + (double)scanQuotient / scanQuotient2 );*/
		
		//Exercise 10
		
		/*Scanner newScanner = new Scanner(System.in);
		
		System.out.println("Type the radius: ");
		int scanRadius = Integer.parseInt(newScanner.nextLine());
		
		System.out.println("Circumference of the circle: " + 2 * Math.PI * scanRadius);*/
		
		//Exercise 11
		
	/*	Scanner newScanner = new Scanner(System.in);
		System.out.println("Type a number");
		int bigNum = Integer.parseInt(newScanner.nextLine());
		
		System.out.println("Type another number: ");
		int biggerNum = Integer.parseInt(newScanner.nextLine());
		
		int highNum = Math.max(bigNum, biggerNum);
		
		System.out.println(highNum);*/
		
		//Exercise 12
		
		/*Scanner newScanner = new Scanner(System.in);
		System.out.println("Type your name: ");

		String inputName = newScanner.nextLine();
		
		System.out.println("Type your age: ");
		int newInt = Integer.parseInt(newScanner.nextLine());
		
		System.out.println("Type your name: ");
		String inputNameTwo = newScanner.nextLine();
		
		System.out.println("Type your age: ");
		int newIntTwo = Integer.parseInt(newScanner.nextLine());
		
		int finalInt = newInt + newIntTwo;
		
		System.out.println(inputName + " and " + inputNameTwo + " are " + finalInt + " years old in total.");*/
		
		
		//Exercise 13 - Unable to complete, requires imported Helsinki software. 
		
		//Exercise 14
		
		/*Scanner newScanScan = new Scanner(System.in);
		System.out.println("Type a number: ");*/
		
	/*	Misunderstood the directions. Instead of figuring out if a number is positive or negative
	 * This code determines if the number is even or odd. 
	 * 
	 * int newIntInt = Integer.parseInt(newScanScan.nextLine());
		newIntInt = newIntInt % 2;
		if(newIntInt == 0)
		{
			System.out.println("The number is even");
		}else
		{
			System.out.println("The number is odd.");
		}
			*/
		
		/*Scanner newScanScan = new Scanner(System.in);
		System.out.println("Type a number: ");
		
		int newIntInt = Integer.parseInt(newScanScan.nextLine());
		
		if(newIntInt >= 0)
		{
			System.out.println("Your number is postive");
			
		}else 
		{
			System.out.println("Your number is negative.");
		}
		
		*/
		
		/*Scanner newScanner = new Scanner(System.in);
		System.out.println("How old are you? ");
		
		int newIntInt = Integer.parseInt(newScanner.nextLine());
		
		if(newIntInt <= 18)
		{
			System.out.println("You have not reached the age of majority yet! ");
		}else
		{
			System.out.println("You have reached the age of majority!");
			
		}
		*/
		
		/*Scanner newScanner = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		int newIntInt = Integer.parseInt(newScanner.nextLine());
		
		if(newIntInt % 2 == 0)
		{
			System.out.println("Number " + newIntInt + " is even.");
		}else
		{
			System.out.println("Number " + newIntInt + " is odd.");
		}
				
		*/
		
		//Exercise 17
		
		/*Scanner newScanner = new Scanner(System.in);
		System.out.println("Type the first number: ");
		int newIntInt = Integer.parseInt(newScanner.nextLine());
		
		System.out.println("Type the second number: ");
		int newIntIntTwo = Integer.parseInt(newScanner.nextLine());
		
		if(newIntInt > newIntIntTwo)
		{
			System.out.println("Greater Number: " + newIntInt);
		}else if(newIntIntTwo > newIntInt)
		{
			System.out.println("Greater number: " + newIntIntTwo);
		}
		else
		{
			System.out.println("The numbers are equal. ");
		}
			*/
			
		/*Scanner newScanner = new Scanner(System.in);
		System.out.println("Type the points [0 - 60]: ");
		
		int newIntInt = Integer.parseInt(newScanner.nextLine());
		
		if(newIntInt <= 29)
		{
			System.out.println("failed");
		}else if(newIntInt <= 34)
		{
			System.out.println("1");
		}else if(newIntInt <= 39)
		{
			System.out.println("2");
		}else if(newIntInt <= 44)
		{
			System.out.println("3");
			
		}else if(newIntInt <= 49)
		{
			System.out.println("4");
			
		}else if(newIntInt < 60)
		{
			System.out.println("5");
		}*/
		
		
		//Exercise 19
		/*
		Scanner newScanScan = new Scanner(System.in);
		System.out.println("How old are you?");
		
		int newIntInt = Integer.parseInt(newScanScan.nextLine());
		
		if (newIntInt >= 0 && newIntInt <= 120){
			System.out.println("OK");
		}else
		{
			System.out.println("Impossible");
		}
		
		
		
		*/
		
	/*	Scanner newScanScan = new Scanner(System.in);
		System.out.println("Type your username: ");
		String userName = newScanScan.nextLine();
		
		System.out.println("Type your password: ");
		String passWord = newScanScan.nextLine();
		
		if(userName.equals("alex") && passWord.equals("mightyducks") || 
				userName.equals("emily") && passWord.equals("cat"))
		{
			System.out.println("You are now logged into the system.");
		}else
			System.out.println("Your username and password was invalid!");
	}
		*/
		
		
		//Exercise 21
		
		/*Scanner newScanner = new Scanner(System.in);
		System.out.println("Type a year: ");
		int leapYear = Integer.parseInt(newScanner.nextLine());
		
		if(leapYear % 4 == 0 || leapYear % 100 == 0 && leapYear % 400 == 0)
		{
			System.out.println("The year is a leap year");
		}else
		{
			System.out.println("The year is not a leap year.");
		}
	}
		*/
		
		
		//break command will stop an infinite loop
		
		
		//Exercise 22
		
		
		/*Scanner newSc = new Scanner(System.in);
		while(true){
			
		System.out.println("Type the password: ");
		String nameString = newSc.nextLine();
		
		String password = "carrot";
		
		if(nameString.equals(password))
		{
			System.out.println("Right!");
			System.out.println("The secret is: jryy qbar!");
			break;
		}else 
			System.out.println("Wrong!");
		}*/
		
		
		//Exercise 23
		//Unable to complete, imported Helsinki component.
		
		//Exercise 24
		//Unable to complete, imported Helsinki component.
		
		
		
		
		
		
		
	}
}