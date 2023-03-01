package inheritance.java;

public class MultipleInheritance_Class implements MultipleInheritance_B, MultipleInheritance_A{

	public void employeeInfo() {
		System.out.println("Tahidul Haque");
		
	}

	public void employeeDepartment() {
		System.out.println("QA Automation Engineer");
		
	}

	public void salary() {
		System.out.println("150k");
		
	}

	public void region() {
		System.out.println("New York");
		
	}
	
	public static void main(String[] args) {
		
		MultipleInheritance_Class obj = new MultipleInheritance_Class();
		
		obj.employeeInfo();
		obj.employeeDepartment();
		obj.region();
		obj.salary();
	}

	

}
