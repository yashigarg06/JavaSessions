package exceptionHandling;

public class FinallyBlock {

	public static int getMarks(String stName) {
		System.out.println("student name is: "+ stName);
		if (stName.equals("Vijay")) {
			try { 
				int i=9/0;
				return 90;
			}
			catch (ArithmeticException e){
				System.out.println("AE is coming");
				return 10;
			}
			finally {
				System.out.println("this is finally block");
				//return 10;
			}
			
		}
		else if(stName.equals("Aman"))
		{
			return 95;
		}
		else if(stName.equals("Priya"))
		{
			return 100;
		}
		else
		{
			System.out.println("student is not found: "+stName);
			return -1;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(getMarks("Vijay"));
		/*System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
			//int i=9/3;
			int i=9/0;
			
		}
		//catch(ArithmeticException e)
		//{
		//	e.printStackTrace();
		//}*/
		

		System.out.println("bye");
	}

}
