package otherPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Armstrong number means qube of number is same as number

		int number = 153;
		int temp;
		int sum = 0;
		temp = number;

		while (number != 0) {

			int rev = number % 10;
			sum = sum + (rev * rev * rev);
			number = number / 10;

		}

		if (temp == sum) {
			System.out.println("Number is Armstrong Number");
		}

		else {
			System.out.println("Number is not Armstrong Number");
		}
	}

}
