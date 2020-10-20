package stringAssignment;

public class Occuranceofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Welcome to Naveen Automation Labs !";
		
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.indexOf('e'));
		
		System.out.println(s1.indexOf('e', (s1.lastIndexOf('e')-1)));
		
	}
	
	public static void abc()
	{
		System.out.println("ABC");
		Occuranceofchar oc = new Occuranceofchar();
		oc.xyz();
	}

	
	public void xyz()
	{
		System.out.println("XYZ");
		abc();
	}
}
