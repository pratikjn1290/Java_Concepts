package basicJava150920;

public class StringConcat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//approach 1
		
		String s = "Your Total amount is.";
		int num1 = 100;
		int num2 = 200;
		int num3 = 3400;
		
		System.out.println(s + (num1+num2+num3));

		
		//approach 2
		
		int sum = num1+num2+num3;
		System.out.println(s+sum);
		
	}

}
