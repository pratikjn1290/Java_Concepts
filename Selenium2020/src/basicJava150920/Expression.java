package basicJava150920;

import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))

		float num1 = 25.5f;
		float num2 = 3.5f;
		float num3 = 40.5f;
		float num4 = 4.5f;
		
		float expression = (num1 * num2 - num2 * num2)/ (num3 - num4);
		
		System.out.println("Result of Expression:- " +expression);
		
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		System.out.println(inputString);
		
		
		
		
	}

}
