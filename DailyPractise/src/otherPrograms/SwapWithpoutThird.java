package otherPrograms;

public class SwapWithpoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		swap(-2, -1);
	}

	public static void swap(int number1, int number2) {
		if (number2 > number1) {
			System.out.println("-------------Before Swap------------");
			System.out.println(number1);
			System.out.println(number2);
			number1 = number1 + number2; // 10+20= 30
			number2 = number1 - number2; // 30-20 = 10
			number1 = number1 - number2; // 10 -3
			System.out.println("-------------After Swap------------");
			System.out.println(number1);
			System.out.println(number2);
		}
		else {
			System.out.println("-------------Before Swap------------");
			System.out.println(number1);
			System.out.println(number2);
			number2 = number2 + number1; // 10+20= 30
			number1 = number2 - number1; // 30-20 = 10
			number2 = number2 - number1;
			System.out.println("-------------After Swap------------");
			System.out.println(number1);
			System.out.println(number2);
		}

	}
}