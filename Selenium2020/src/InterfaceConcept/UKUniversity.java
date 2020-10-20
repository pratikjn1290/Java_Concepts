package InterfaceConcept;

public interface UKUniversity {

	double fees = 10.00;
	
	public void courseMedical();
	
	public void courseEngineering();
	
	public void courseBcom();
	
	//Java 1.8
	default void AllCourse() {
		
		System.out.println("All Courses Offered By UK university");
	}
	
	//Static Method with body we can add
	public static void fees()
	{
		System.out.println("Minimum Fee :- " +fees);
	}
}
