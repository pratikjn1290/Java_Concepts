package otherPrograms;

public class SwapUsingThreevar {

	static int n1 = 20;
	static int n2 = 30;
	static int temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		swap(10,20);
	}

	public static void swap(int number1, int number2) {

		System.out.println("----------Before Swap-----------");
		System.out.println(number1);
		System.out.println(number2);
		//logic
		temp = number1;  //temp = 10,
		number1 = number2;    //n1 = 20
		number2 = temp; //n2 = 10

		System.out.println("----------After Swap-----------");
		System.out.println(number1);
		System.out.println(number2);
	}

}