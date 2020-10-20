/**
 * 
 */
package assignment217092020;

/**
 * @author Pratik
 *
 *
 */

//Write a program to create a static Array, having following cricket data:
//--name, age, team name, DOB, gender, Strike Rate
//--Try to create multiple Object Arrays for different players 
//--Try to print all the values of each player on the console
public class Assignment7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test();
		test1();
		test2();

	}

	public static void test() {

		Object[] obj = new Object[5];
		obj[0] = "Sachin";
		obj[1] = 23;
		obj[2] = "CSK";
		obj[3] = "Male";
		obj[4] = 100.21;

		for (int val = 0; val < obj.length; val++) {
			System.out.println(obj[val]);
		}
		System.out.println("--------End Of First Array--------");
	}

	public static void test1()
	{
		Object[] obj1 = new Object[5];
		obj1[0] = "Sehwag";
		obj1[1] = 23;
		obj1[2] = "MI";
		obj1[3] = "Male";
		obj1[4] = 101.24;

		for (int num = 0; num < obj1.length; num++) {
			System.out.println(obj1[num]);
		}
		System.out.println("--------End Of Second Array--------");
	}

	public static void test2() {
		Object[] obj2 = new Object[5];
		obj2[0] = "Dhoni";
		obj2[1] = 34;
		obj2[2] = "CSK";
		obj2[3] = "Male";
		obj2[4] = 109.34;

		for (int n = 0; n < obj2.length; n++) {
			System.out.println(obj2[n]);
		}
		System.out.println("--------End Of Third Array--------");
	}
}
