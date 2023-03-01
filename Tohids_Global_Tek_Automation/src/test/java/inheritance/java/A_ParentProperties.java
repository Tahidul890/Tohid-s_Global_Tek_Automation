package inheritance.java;

public class A_ParentProperties extends A_GrandParentProperties{
	protected void getCar() {
		System.out.println("BMW M3-Competition");
	}
	
	protected void getBankAccount() {
		System.out.println("Family joint bank account");
	}
	
	protected void getHouse() {
		System.out.println("Apple Park");
	}
	
	public static void main(String[] args) {
		
		A_ParentProperties obj = new A_ParentProperties();
		
		obj.getBuisiness();
		obj.getFamilyName();
		obj.getMansion();
		obj.getBankAccount();
		obj.getCar();
		obj.getHouse();
	}
}
