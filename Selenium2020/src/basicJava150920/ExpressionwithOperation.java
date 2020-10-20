package basicJava150920;

public class ExpressionwithOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);
		System.out.println(20 + -3 * 5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);

		int num1 = 5;
		int num2 = 8;
		int num3 = 6;
		int num4 = 9;
		int num5 = 55;

		int expres1 = -num1 + num2 * num3;
		System.out.println(expres1);

		int expres2 = (num5 + num4) % num4;
		System.out.println(expres2);

	//	int expres3 = (num1 + (-num2) * num3 / num4);
	//	System.out.println(expres3);

		// int expres4 = (num1 + num2 / num3 * num4 - num5 % num4);
		// System.out.println(expres4);
	}

}
