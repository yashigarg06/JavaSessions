package exceptionHandling;

public class Company {

	public void m1(){
		System.out.println("m1 method");
		m2();
	}
	public void m2(){
		System.out.println("m2 method");
		try{
			m3();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
	public void m3() throws ArithmeticException{
		System.out.println("m3 method");
		int i=9/0;
		//System.out.println(i);
	}
	public static void main(String[] args) {
		Company obj=new Company();
	    obj.m1();
		System.out.println("bye");
	}

}