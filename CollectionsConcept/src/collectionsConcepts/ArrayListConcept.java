package collectionsConcepts;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Object> ar = new ArrayList <Object> ();
		ar.add("Hello");
		ar.add('h');
		ar.add(32);
		ar.add("You");
		
		System.out.println(ar.get(3));
		System.out.println(ar.size());
		System.out.println("Hi" +(ar.size()-1));
		System.out.println("LI" +0);
	}

}
