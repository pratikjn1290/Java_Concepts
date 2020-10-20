package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Use to create custom exception

		try {
			System.out.println("helloooooooooooooooo");

			throw new Exception("Some exception occurs");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
