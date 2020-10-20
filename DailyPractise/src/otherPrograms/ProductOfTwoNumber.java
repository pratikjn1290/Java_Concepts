package otherPrograms;

import java.util.Scanner;

public class ProductOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		System.out.println(prod(n1, n2));
	}

	public static int prod(int number1, int number2) {
		int result = number1 * number2;
		return result;
	}
}
