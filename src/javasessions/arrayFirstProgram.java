package javasessions;

import java.util.Arrays;

public class arrayFirstProgram {
	
	
	
	public static void main(String args[])
	{
		int arr[]= new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		System.out.println("size of array is" + arr.length);
		System.out.println("------------------");
		System.out.println("sum of elements of array"+ Arrays.toString(arr)+" is: ");
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
		
		
	}

}
