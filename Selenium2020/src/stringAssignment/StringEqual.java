package stringAssignment;

public class StringEqual {

	//Write a program to check two different strings equality
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello how are you?";
		String s2 = "Hello How Are You?";
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		
	}

}
