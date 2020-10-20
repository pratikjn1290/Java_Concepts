package basicJava150920;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 25;
		int number2 = 88;
		int number3 = 87;

		if (number1 > number2 && number1 > number3) {
			
			System.out.println("Number 1 is greatest number:- " + number1);
		}

		else if(number3 > number2 && number3>number1)
			{
				{
					System.out.println("Number 3 is Greatest Number:- " +number3);
				}
			}
		else
		{
			System.out.println("Number 2 is greatest:- " +number2);
		}
	}

}
