package javasessions;

public class CheckPrime {

	public static void main(String[] args) {
		int num=1;
		boolean flag=true;
		for (int i=2;i<=9;i++)
		{
			if (i!=num)
			{
				if(num%i==0)
				{
					flag=false;
					break;
				}
				else
					flag=true;
			}
		}
		if (flag==true)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");

	}

}
