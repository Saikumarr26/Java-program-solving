package Practice;

import java.util.Scanner;

public class PositiveOrNegitive {

	public static void main(String[] args) {
		String yn="";
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();

		if(num > 0) {
			System.out.println( num + " is positive number");
		}
		else if(num < 0) {
			System.out.println( num + " is negitive number");
		}
		else {
			System.out.println("the entered number is zero");
		}
		System.out.println("do you want to continue enter y");
		yn=sc.next();
		}
		while(yn.equalsIgnoreCase("y"));
		
	}
}
