package abstraction_b;

public class Abstraction_Class extends Abstraction_A{

	
	void subBrand() {
		System.out.println("Rolls-Royce");
	}
	
	
	
	void carModel() {
		System.out.println("M8 Grand Coupe Competition");
		
	}
	
	public static void main(String[] args) {
		
		Abstraction_Class obj = new Abstraction_Class();
		
		obj.companyName();
		obj.carModel();
		obj.subBrand();
	}
	

}
