
public class FibonaciTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact = 0;

		int temp = 0;

		for (int i = 1; i < 100; i++)

		{

			fact = temp;

			fact = fact + i;

			temp = fact;

			System.out.println(temp);
		}
	
	}

}
