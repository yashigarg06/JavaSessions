package javasessions;

public class TestStaticVarFunctions {
	//WAF: to define car object with number of wheels as static and other attributes as non static
	static int wheelCount=4;
	String carname;
	String carcolor;
	
	public static void carBehaviour(String carName)
	{
		TestStaticVarFunctions r1=new TestStaticVarFunctions();
		r1.carname=carName;
		String s= carName.toLowerCase().trim();
		System.out.println(wheelCount);
		switch(s) {
		case "i20": 
			System.out.println("car is hatchback private car");
			break;
		case "innova":
			System.out.println("car is suv and a taxi");
			break;
		case "creta": 
			System.out.println("car is suv and a rented car");
			break;
	    default: System.out.println("please pass the right carname");
			
		
		}
		
	}

	public static void main(String[] args) {
		TestStaticVarFunctions cb= new TestStaticVarFunctions();
		cb.carname="mghector";
		TestStaticVarFunctions.carBehaviour("i20");
		System.out.println(TestStaticVarFunctions.wheelCount);
		System.out.println(cb.carname);
		
	}
}
