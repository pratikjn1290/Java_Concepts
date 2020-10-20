package stringAssignment;

public class ContainsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to verify a word or a character contained in the sentence.

		String s1 = "Hello How are you! James?";
		System.out.println(s1.contains("Hello"));// true

		System.out.println(s1.contains("H"));// true

		System.out.println(s1.contains("Hi")); // false
	}

}
