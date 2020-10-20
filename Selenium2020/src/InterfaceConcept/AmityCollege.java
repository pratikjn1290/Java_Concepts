package InterfaceConcept;

public class AmityCollege implements UKUniversity, CanadaUniversity, IndianUniversity {

	@Override
	public void courseMedical() {

		System.out.println("Medical Course Affiliated to UK UNiversity");

	}

	@Override
	public void courseEngineering() {
		// TODO Auto-generated method stub
		System.out.println("Engineering Course Affiliated to UK UNiversity");
	}

	@Override
	public void courseBcom() {
		// TODO Auto-generated method stub
		System.out.println("B.Com Course Affiliated to UK UNiversity");

	}

	@Override
	public void courseBtech() {
		// TODO Auto-generated method stub
		System.out.println("BTECH Course Affiliated to CANADA UNiversity");
	}

	@Override
	public void courseMS() {
		// TODO Auto-generated method stub
		System.out.println("MS Course Affiliated to CANADA UNiversity");
	}

	@Override
	public void courseMBBS() {
		// TODO Auto-generated method stub
		System.out.println("MBBS Course Affiliated to CANADA UNiversity");
	}

	@Override
	public void courseMasters() {
		System.out.println("MASTERS Course Affiliated to INDIAN UNiversity");
		
	}

	@Override
	public void courseMscIT() {
		// TODO Auto-generated method stub
		System.out.println("MSCIT Course Affiliated to INDIAN UNiversity");
	}

	@Override
	public void couseCloud() {
		// TODO Auto-generated method stub
		System.out.println("Cloud Course Affiliated to INDIAN UNiversity");
	}

	@Override
	public void Affiliation() {
		System.out.println("This college is Affiliated.");
		
	}

}
