package abstractConcepts;

public abstract class Page {

	public Page()
	{
		System.out.println("Constructor");
	}
	
	public abstract void pageTitle();
	
	public abstract void url();
	
	public static void logo()
	{
		System.out.println("Logo");
	}
	
}
