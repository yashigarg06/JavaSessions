package stringManipulations;

public class FindOccurance {
	//String s="This is my java code and I am so happy";
	public int thirdOcc(String s,char ch)
	{
		int index=-1;
		for (int i=1;i<=3;i++)
		{
		   index=s.indexOf(ch,index+1);
		   
		}
	
		return index;
	}

}
