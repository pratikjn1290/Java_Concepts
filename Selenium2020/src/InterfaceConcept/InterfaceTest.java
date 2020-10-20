package InterfaceConcept;

public class InterfaceTest extends AmityCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmityCollege AC = new AmityCollege();
		AC.courseBcom();
		AC.courseEngineering();
		AC.courseMedical();
		AC.courseBtech();
		AC.courseMS();
		AC.courseMBBS();
		AC.courseMasters();
		AC.couseCloud();
		AC.courseMscIT();
		AC.AllCourse();
		AC.Affiliation();
		UKUniversity.fees();

		// Top Casting
		UKUniversity uk = new AmityCollege(); // Child class object refered by parent class reference variable
		uk.courseMedical();
		uk.courseBcom();
		uk.courseEngineering();
		uk.AllCourse();
	}

}
