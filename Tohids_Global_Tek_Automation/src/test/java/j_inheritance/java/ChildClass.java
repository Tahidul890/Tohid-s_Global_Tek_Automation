package j_inheritance.java;

public class ChildClass extends ParentClass{
	
		void haveJob(){
			System.out.println("Software Developer");
		}
		
		void haveCar() {
			System.out.println("Lamborgini");
		}
		
		public static void main(String[] args) {
			
			ChildClass obj = new ChildClass();
			
			System.out.println(obj.getFamilyName());
			obj.getFamilyHouse();
			obj.getBusisness();
			System.out.println(obj.carryTheLoan());
			obj.haveJob();
			obj.haveCar();
		}

}
