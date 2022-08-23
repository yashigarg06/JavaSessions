package exceptionHandling;

public class ThrowKeyword {

	public static void getInfo() {
		String data=null;
		try {
			if(data==null) {
				throw new Exception("Data not found");
			}else
			{
				System.out.println(data);
			}
			
		}
		catch(Exception e) {
			System.out.println("data not found");
			e.printStackTrace();
		}

		System.out.println("bye");
	}
	public static void main(String[] args) {
		//ThrowKeyword obj=new ThrowKeyword();
		getInfo();
	}

}
