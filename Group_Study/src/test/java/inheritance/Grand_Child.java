package inheritance;

public class Grand_Child extends Child_Class{
	
	protected void haveBankAccount(String A) {
		
		System.out.println(A);
		
	}
	
	public static void main(String[] args) {
		
		Grand_Child obj = new Grand_Child();
		
		obj.haveBankAccount("Chase");
		obj.getCar();
	    System.out.println(obj.getCash());
	    System.out.println(obj.familyName());
	    obj.haveJob();
	    obj.haveHouse();
	    System.out.println(obj.salary());
	    obj.haveBankAccount("TD");
	    
		
		
	}

}
