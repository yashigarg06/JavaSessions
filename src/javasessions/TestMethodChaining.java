package javasessions;

public class TestMethodChaining {
	
	public static void m1(String s)
	{
		System.out.println(s);
		System.out.println("method m1 is called");
		TestMethodChaining obj=new TestMethodChaining();
		obj.m2();
		//TestMethodChaining.m2();
	}
	public void m2()
	{
		System.out.println("method m2 is called");
		TestMethodChaining obj1=new TestMethodChaining();
	    obj1.m3();
		//TestMethodChaining.m3();
	}
	public void m3()
	{
		System.out.println("method m3 is called");
		//TestMethodChaining obj1=new TestMethodChaining();
		//obj1.m1();
		TestMethodChaining.m1(" ");
		
	}
	public static void main(String[] args) {
		System.out.println("this is main method");
		System.out.println("-----------------");
		TestMethodChaining.m1("call from main");
		
	}

}
