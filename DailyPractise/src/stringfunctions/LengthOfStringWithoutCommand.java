package stringfunctions;

public class LengthOfStringWithoutCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(slowLength("Hello"));
		String s = "HelloHowareyou";
		char[] str = s.toCharArray();
		int count = 0;

		for (int i = 0; i < str.length; i++) {
			count++;
		}
		System.out.println(count);
	}

	public static int slowLength(String myString) {
		int j = 0;
		try {
			while (true) {
				myString.charAt(j);
				j++;
			}
		} catch (IndexOutOfBoundsException e) {
			return j;
		}
	}

}
