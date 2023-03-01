	package global.ny.basic.project;
	
	
	public class VarriableAccess {
		static String Name;
		
		int age;
		
		void Student1() {
			
			Name = "Meraz Gazi";
			age = 21;
			int Grade = 8;
			System.out.println(Name);
			System.out.println(age);
			System.out.println(Grade);
		}
		
	    String Student2() {
			return Name = "Tahidul Haque";
			
					
	    }
	    
	    int Fees(int a) {
			return a;
			
	    	
	    }
		public static void main(String[] args) {
			
			VarriableAccess obj = new VarriableAccess();
			
			obj.Student1();
			System.out.println(obj.Student2());
			System.out.println(obj.Fees(1000));
			System.out.println("Tohid");
		}
		
		
	
	}
	
	
