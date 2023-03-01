package abstraction.java;

public class AbstractionClass_B extends AbstractionClass_A{

	
	public void employeeName() {
		System.out.println("Tahidul Haque");
		
	}


	public void employeeID() {
		System.out.println(234);
		
	}


	public void employeeSalary() {
		System.out.println(150 +"k");
		
	}
	
	public static void main(String[] args) {
		
		AbstractionClass_B obj = new AbstractionClass_B();
		
		obj.companyName();
		obj.employeeID();
		obj.employeeName();
		obj.employeeDepartment();
		obj.employeeSalary();
		obj.employeeRegion();
	}

}
