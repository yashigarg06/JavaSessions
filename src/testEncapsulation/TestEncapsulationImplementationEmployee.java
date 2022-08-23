package testEncapsulation;

public class TestEncapsulationImplementationEmployee {

	public static void main(String[] args) {
		EnpasulationImplementationEmployee e1=new EnpasulationImplementationEmployee();
		e1.setName("prateek");
		e1.setAge(33);
		e1.setGender('M');
		e1.setActive(true);
		System.out.println("employee data is : "+ e1.getEmployeeInfo());
		e1.setName("rahul");
		System.out.println("------------");
		System.out.println("employee data is : "+ e1.getEmployeeInfo());

	}

}
