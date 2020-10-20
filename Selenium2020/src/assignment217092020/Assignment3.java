/**
 * 
 */
package assignment217092020;

/**
 * @author Pratik
 *
 */

//WAP to print 10 to 1 using for, while and do-while loop
public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Using For Loop");
		
		for (int value = 10; value >= 1; value--) {
			System.out.println(value);
		}

		System.out.println("Using While Loop");
		
		int val = 10;
		while (val >= 1) {
			System.out.println(val);
			val--;
		}

		System.out.println("Using Do While Loop");
		
		int number = 10;
		do {
			System.out.println(number);
			number= number-1;
		}

		while (number >= 1);
		}
}