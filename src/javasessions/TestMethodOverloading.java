package javasessions;

public class TestMethodOverloading {
	//WAF: write 3 functions with same name and different arguments to test method overloading
	public void addNum(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum of two numbers is: "+c);	
	}
	public int addNum(int a,int b,int c)
	{
		int d=a+b+c;
		return d;
	}
	public float addNum(int a, float b)
	{
		float c= a+b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethodOverloading testAdd=new TestMethodOverloading();
		testAdd.addNum(2,3);
		int sum=testAdd.addNum(1, 2, 4);
		System.out.println("addition of three integers is: "+sum);
		float decimalSum=testAdd.addNum(3, 4.3f);
		System.out.println("addtion of a int and float is: "+decimalSum);
		

	}

}
