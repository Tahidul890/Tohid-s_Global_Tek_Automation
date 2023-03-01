package inheritance.java;

public class ChildProperties extends A_ParentProperties{
	
	protected void gotJob() {
		System.out.println("QA Automation Engineer");
	}
	
	protected void gotCar() {
		System.out.println("Mercedes GT-63");
	}
	
	protected void gotCash() {
		System.out.println("Has 1M dollars");
	}
	
	public static void main(String[] args) {
		
		ChildProperties obj = new ChildProperties();
		
		obj.getBuisiness();
		obj.getFamilyName();
		obj.getMansion();
		obj.getBankAccount();
		obj.getCar();
		obj.getHouse();
		obj.gotJob();
		obj.gotCash();
		obj.gotCar();
	}
}
