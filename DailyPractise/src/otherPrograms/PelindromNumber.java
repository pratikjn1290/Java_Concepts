package otherPrograms;

public class PelindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 1221;
		int rev = 0;

		int temp = number;
		
		while (number != 0) {
			
			int digit = number % 10;
			rev = digit + (rev * 10);
			number = number / 10;

		}
		System.out.println(rev);

		if (rev == temp) {
			System.out.println("Number is Pelindrom");
		}

		else {
			System.out.println("Number Is normal Number");
		}

	}

}
