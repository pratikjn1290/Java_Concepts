package stringAssignment;

public class StringExistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		existance("Hello How are you!", "Hello");
		existance("Hello, How are you!", "hello");
		}
	
	
	public static int existance(String str, String str2)
	
	{
		
		if(str.contains(str2))
		{
			System.out.println("Word is existed: " +str2);
			System.out.println(str.indexOf(str2));
			return str.indexOf(str2);
		}
		
		else
		{
			System.out.println("Word is not existed");
		}
		return -1;
	}
}
