package stringAssignment;

public class LastHalf {

	public static void main(String[] args) {
		//Write a program that gives you the last half of the string
		
		String s1 = "Hello Are You!";
		int len = s1.length();
		
		System.out.println(s1.substring(len/2));
		
	}

}
