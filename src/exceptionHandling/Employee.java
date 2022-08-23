package exceptionHandling;

public class Employee {
	String name="naveen";
	public static void main(String[] args) {
		 
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
			Employee e=new Employee();
			e=null;
			System.out.println("emp name is: "+e.name);//NPE
			int i=9/0;
		}
		catch(Throwable e){
			e.printStackTrace();
		}
	   // catch(NullPointerException e) {
		//e.printStackTrace();
	    //}
		System.out.println("bye");
	}
		
	
}



