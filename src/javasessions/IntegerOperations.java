package javasessions;

public class IntegerOperations {

	public static boolean checkPrime(int num){
		
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
		return flag;
		
	}
	public static void checkArmstrong(int num) {
		
		int n=num,temp=0;
		while(n!=0)
		{ 
			int rem=n%10;
			n=n/10;
			temp=temp*10+rem;
			
		}
		if (temp==num)
			System.out.println(num+" is armstrong number");
		else
			System.out.println(num+" is not amstrong number");
	}
	
	public static void main(String[] args) {
		int num=12;
		boolean flag = IntegerOperations.checkPrime(num);
		if (flag==true)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
		IntegerOperations.checkArmstrong(1214);

	}

}
