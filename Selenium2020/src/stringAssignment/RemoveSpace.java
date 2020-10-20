package stringAssignment;

public class RemoveSpace {
//Remove all  spaces in a String
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "         Hello      Everyone       ";
		
		String s2 = s1.trim();
		String s3 = s1.replaceAll(" ", "");
		System.out.println(s3);
		
	}

}
