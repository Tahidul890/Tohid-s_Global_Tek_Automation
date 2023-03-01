package j_inheritance.java;

public class MultipleInheritance_Class implements MultipleInheritance_B, MultipleInheritance_A{

	public void emolpyeeName() {
		System.out.println("Tahidul Haque");
		
	}

	public int salary() {
		
		return 150000;
	}

	public void department() {
		System.out.println("Software Developer");
		
	}

	public String region() {
		
		return "USA";
	}

	public static void main(String[] args) {
		
		MultipleInheritance_Class obj = new MultipleInheritance_Class();
		
		obj.emolpyeeName();
		obj.department();
		System.out.println(obj.salary());
		System.out.println(obj.region());
	}
	
	

}
