package javasessions;
//import java.util.*;

public class TestMethodforArrayLiterals {
	//WAF: to accept array literals as parameter
	//WAF: to accept and return array literals
	public void methodArrayLiterals(int a[]) {
		
		for(int e:a)
		{
			System.out.println(e);
		}
	}
	public Object[] returnArrLiteralMethod() {
		Object objarr[]=new Object[] {"ram", 25, "male"};
		return objarr;
	}

	public static void main(String[] args) {
		
		TestMethodforArrayLiterals t= new TestMethodforArrayLiterals();
		int arr[]=new int[] {1,2,3,4};
		//t.methodArrayLiterals({1,2,3,4});
		t.methodArrayLiterals(arr);
		Object citizeninfo[] =t.returnArrLiteralMethod();
		for(Object e:citizeninfo)
		{
			System.out.println(e);
		}

	}

}
