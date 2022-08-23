package stringManipulations;

public class TestString {

	public static void main(String[] args) {
		FindOccurance occ=new FindOccurance();
		String s="this is my java code and i am so happy";
		int index=occ.thirdOcc(s, 'i');
		System.out.println(index);

	}

}
