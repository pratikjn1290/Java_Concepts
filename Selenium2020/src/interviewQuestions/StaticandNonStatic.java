/**
 * 
 */
package interviewQuestions;

/**
 * @author Pratik
 *
 */
public class StaticandNonStatic {

	/**
	 * @param args
	 */

	// We can call non static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void login() {
		search();
	}

	public void search() {
		profile();
	}

	public void profile() {
		addtocart();
	}

	public void addtocart() {
		payment();
	}

	public static void buyproduct() {
		payment();
	}

	public static void payment() {
		
		
	}
}
