	package global.ny.login;
	
	public class MethodTypes {
		void Name(){
			System.out.println("I am a QA Automation Engineer");
		}
		
		String Name2() {
			return("Tahidul Haque");
		}
		
		int Salary() {
			return(10);
		}
		public static void main(String[] args) {
			
			MethodTypes objt = new MethodTypes();
			
			System.out.println(objt.Salary());
			
			objt.Name();
			
		    System.out.println(objt.Name2());
			
			
		}
	}
