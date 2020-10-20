package constructorConcept;

import java.util.ArrayList;

public class UniversityTest {

	public static void main(String [] args)
	{
		
	
		University uni1 = new University("BU", "INDIA");
		System.out.println(uni1.name + " " + uni1.country);
		
		University uni2 = new University("BHU", "INDIA", "01-01-2000");
		System.out.println(uni2.name + " " + uni2.country + " " +uni2.establishedDate);
		
		ArrayList<String> courseDetails = new ArrayList<String>();
		courseDetails.add("BE");
		courseDetails.add("AI");
		courseDetails.add("ML");
		
		University uni4 = new University("BGHY", "INDIA", "04-03-2012", courseDetails);
		System.out.println(uni4.name + " " + uni4.country + " " +uni4.establishedDate + " " + uni4.course);
		
	}
	
}