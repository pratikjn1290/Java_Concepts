package stringAssignment; 

public class StringSplitfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Split with space");
		
		stringFunc("Hello How are you!", " ");
		
		System.out.println("Split with -");
		
		stringFunc("Hello_How_Are_You_guys!", "_");

		System.out.println("Split with -");
		
		stringFunc("Hello-How-Are-You-guys!", "-");
	}
	
	
	public static void stringFunc(String str, String reg)
	{
		String [] arr  = str.split(reg);
		for(String elem : arr)
		{
			System.out.println(elem);
		}
		
	}

}
