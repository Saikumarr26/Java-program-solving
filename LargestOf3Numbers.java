package Practice;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter firts number");
		int num1 = sc.nextInt();

		System.out.println("enter second number ");
		int num2 = sc.nextInt();

		System.out.println("enter third number ");
		int num3 = sc.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " is greater than " );
		} else if (num2 > num3) {
			System.out.println(num2 + " is greater than ");
		} else {
			System.out.println(num3 +" is greater ");
		}

	}

}
