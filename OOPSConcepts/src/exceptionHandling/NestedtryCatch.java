package exceptionHandling;

public class NestedtryCatch {

	String name = "pratik";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NestedtryCatch nc= new NestedtryCatch();
		nc = null;
		
		
		try {
		
			
			int p = 9/3;
			System.out.println(nc.name);
			
		
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
