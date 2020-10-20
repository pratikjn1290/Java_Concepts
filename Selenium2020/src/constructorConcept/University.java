package constructorConcept;

import java.util.ArrayList;

public class University {

	// Design a University class template with the following features:

	String name;
	String country;
	String establishedDate;
	ArrayList<String>course;

	
	public University(String name, String country)
	{
		this.name = name;
		this.country = country;
	}
	
	public University(String name, String country, String establishedDate)
	{
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
	}
	
	public University(String name, String country, String establishedDate, ArrayList<String> course)
	{
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}

	public String getEstablishedDate() {
		return establishedDate;
	}

	public ArrayList<String> getCourse() {
		return course;
	}		
}
