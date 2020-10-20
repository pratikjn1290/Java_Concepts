/**
 * 
 */
package assignment217092020;

/**
 * @author Pratik
 *
 */

//Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
public class Assignment5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while (i < 10) {
			if (i % 7 == 0) {
				
				System.out.println("Divide By Seven and Break " +i);
				break;
			}
			System.out.println(i);	
			i++;
		}
		

	}

}
