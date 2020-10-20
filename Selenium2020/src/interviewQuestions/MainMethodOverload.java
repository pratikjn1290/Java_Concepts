/**
 * 
 */
package interviewQuestions;

/**
 * @author Pratik
 *
 */
public class MainMethodOverload {

	/**
	 * @param args
	 */

	// Method overloading means in same class method name is same but signature is
	// different, with different sequence of parameter data type
	// Main method can be overloaded,
	// Method which is overloaded is called as overloaded method,
	// Method overloading is called as compile time polymorphism,
	// it belongs to the concept of polymorphism,
	// polymorphism means multiple ways
	//JVM look for method having String Array as argument method if this type of method is not available error will be triggered.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------------Main method---------------");
		main(10, "pratik");
		
	}

	public static void main(int a) {
		System.out.println("Main with single argument");
	}

	public static void main(int a, String n) {
		System.out.println("Main with two arguments: " +a +" " +n);
	}
}
