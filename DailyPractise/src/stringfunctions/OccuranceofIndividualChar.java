package stringfunctions;

public class OccuranceofIndividualChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mystring("Hello");
	}

	public static void mystring(String input) {

		int counter[] = new int[256];

		// String length
		int len = input.length();
		for (int i = 0; i < len; i++)
			counter[input.charAt(i)]++;

		int flag = 0;
		char[] ch = new char[input.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = input.charAt(i);
			for (int j = 0; j < i; j++) {
				if (input.charAt(i) == ch[j]) {
					flag++;
				}
			}

			if (flag == 1) {
				System.out
						.println("Occurrence of char " + input.charAt(i) + " in the String is:" + ch[input.charAt(i)]);
			}
		}
	}

}