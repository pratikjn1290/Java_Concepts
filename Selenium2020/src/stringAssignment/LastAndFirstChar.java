package stringAssignment;

public class LastAndFirstChar {

	public static void main(String[] args) {

		//Write a program that will  print out the last character and first character of a word
		// TODO Auto-generated method stub
		
		String s1 = "Hello";
		int len = s1.length();
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(len-1));
	}

}
