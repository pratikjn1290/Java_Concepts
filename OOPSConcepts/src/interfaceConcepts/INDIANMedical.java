package interfaceConcepts;

public interface INDIANMedical extends WHO{
	
	
	public void physocology();
	
	public void gatrology();
	
	public void gynacology();


	public static void philosphy() {
		
		System.out.println("Static method in India");
	}
	
	default public void emergancy()
	{
		System.out.println("Default Emergancy");
	}

}

